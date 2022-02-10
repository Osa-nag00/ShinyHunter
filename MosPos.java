
import java.awt.*;

public class MosPos {
  
    private int CordX;
    private int CordY;
    private static MosPos instance = null;

    public void main(int CordX, int CordY){

        
        this.CordX = CordX;
        this.CordY = CordY;

    }


    //needed to use the object values thoughout program
    public static MosPos getInstance() {
        if(instance == null)
            instance = new MosPos();
        return instance;
    }


    //getters
    public int getCordX(){
        return CordX;
    }

    public int getCordY(){
        return CordY;
    }


    //setter

    public void setCords(){

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        PointerInfo a = MouseInfo.getPointerInfo();
        Point b = a.getLocation();
        int x = (int) b.getX();
        int y = (int) b.getY();
    
        this.CordX = x;
        this.CordY = y;

    }


    
}
