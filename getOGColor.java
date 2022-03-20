

import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

public class getOGColor {
    
    private int OGPred;
    private int OGPblue;
    private int OGPgreen;
    
    private static getOGColor instance = null;

    public void main(){
        OGPred = 0;
        OGPblue = 0;
        OGPgreen = 0;

    }


    public static getOGColor getInstance() {
        if(instance == null)
            instance = new getOGColor();
        return instance;
    }

        public void setOGPred(int red) {
            OGPred = red;
        }

        public void setOGPblue(int blue) {
            OGPblue = blue;
        }

        public void setOGPgreen(int green) {
            OGPgreen = green;
        }


        public int getOGPred() {
            
            return OGPred;
        }

        public int getOGPblue() {
            return OGPblue;
        }

        public int getOGPgreen() {
            return OGPgreen;
        }

        public void TakeScreenShot(int px, int py, int whichPic){

        try{


            Robot robot = new Robot();
            Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage OGcolors = robot.createScreenCapture(captureSize);

            if(whichPic == 0){
                //used for picture of pokemon
                Path path = Paths.get("pokeColorCheck.bmp");
                ImageIO.write(OGcolors, "bmp", new File(path.toString()));   

            }else if(whichPic == 1){
                //used for picture for run button
                Path path = Paths.get("runColorCheck.bmp");
                ImageIO.write(OGcolors, "bmp", new File(path.toString())); 

            }
           
            // do rgb checking here
        
            int OGPokeColor = OGcolors.getRGB(px, py);

            int  OGPokeRed = (OGPokeColor & 0x00ff0000) >> 16;
            int  OGPokeBlue = (OGPokeColor & 0x0000ff00) >> 8;
            int  OGPokeGreen = OGPokeColor & 0x000000ff;
            setOGPred(OGPokeRed);
            setOGPblue(OGPokeBlue);
            setOGPgreen(OGPokeGreen);

        }catch(AWTException e) {e.printStackTrace();
        }catch(IOException e){e.printStackTrace();}

        }
}
