import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import java.awt.image.BufferedImage;
import java.awt.event.InputEvent;

public class SH3Gui extends javax.swing.JFrame {

    public SH3Gui() {
        initComponents();
    }

    // GUI Variables declaration - do not modify      
    private javax.swing.JButton capturePokeRect;
    private javax.swing.JLabel currentAttempts;
    private javax.swing.JTextField currentPokeHunt;
    private javax.swing.JButton exitGui;
    private javax.swing.JButton getPokeOGColor;
    private javax.swing.JButton getRunButtonFromBattle;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel numOfAttempts;
    private javax.swing.JLabel pokeCaptureConfirmation;
    private javax.swing.JButton runButton;
    private static javax.swing.JLabel runCaptureConfirmation;
    // End of GUI variables declaration


    //Variables
    Rectangle pokeNamePicture;
    String pokeNameStr;
    String path = "pokename.bmp";
	File imageFile = new File(path);
	BufferedImage Image;
    int ATT = 0;
    //End of Variables



    //Static Objects
    static MosPos runCords = new MosPos();
    static getOGColor gogcRunButton = new getOGColor();
    static MosPos pokeCords = new MosPos();
    static getOGColor gogcPoke = new getOGColor();
    //end of Objects
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        
        capturePokeRect = new javax.swing.JButton();
        currentPokeHunt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();
        exitGui = new javax.swing.JButton();
        currentAttempts = new javax.swing.JLabel();
        getPokeOGColor = new javax.swing.JButton();
        getRunButtonFromBattle = new javax.swing.JButton();
        numOfAttempts = new javax.swing.JLabel();
        pokeCaptureConfirmation = new javax.swing.JLabel();
        runCaptureConfirmation = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shiny Hunter 3.0");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        capturePokeRect.setBackground(new java.awt.Color(0, 255, 51));
        capturePokeRect.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        capturePokeRect.setForeground(new java.awt.Color(0, 0, 0));
        capturePokeRect.setText("Capture Rectangle Around Pokemon");
        capturePokeRect.setPreferredSize(new java.awt.Dimension(250, 125));
        capturePokeRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturePokeRectActionPerformed(evt);
            }
        });

        currentPokeHunt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        currentPokeHunt.setName("Enter Pokemon name"); // NOI18N
        currentPokeHunt.setPreferredSize(new java.awt.Dimension(250, 65));
        currentPokeHunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPokeHuntActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Name of Pokemon and Press Enter :");

        runButton.setBackground(new java.awt.Color(51, 255, 51));
        runButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        runButton.setForeground(new java.awt.Color(0, 0, 0));
        runButton.setText("Run Program");
        runButton.setPreferredSize(new java.awt.Dimension(250, 125));
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        exitGui.setBackground(new java.awt.Color(222, 29, 29));
        exitGui.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitGui.setForeground(new java.awt.Color(0, 0, 0));
        exitGui.setText("Exit Gui");
        exitGui.setPreferredSize(new java.awt.Dimension(250, 125));
        exitGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitGuiActionPerformed(evt);
            }
        });

        currentAttempts.setBackground(new java.awt.Color(0, 0, 0));
        currentAttempts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        currentAttempts.setForeground(new java.awt.Color(0, 0, 0));
        currentAttempts.setText("Current Attempts:     ");

        getPokeOGColor.setBackground(new java.awt.Color(0, 255, 51));
        getPokeOGColor.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        getPokeOGColor.setForeground(new java.awt.Color(0, 0, 0));
        getPokeOGColor.setActionCommand("getPokeOGColor");
        getPokeOGColor.setText("Capture Pokemon's Non-Shiny Color");
        getPokeOGColor.setPreferredSize(new java.awt.Dimension(250, 125));
        getPokeOGColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPokeOGColorActionPerformed(evt);
            }
        });

        getRunButtonFromBattle.setBackground(new java.awt.Color(0, 255, 51));
        getRunButtonFromBattle.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        getRunButtonFromBattle.setForeground(new java.awt.Color(0, 0, 0));
        getRunButtonFromBattle.setActionCommand("getPokeOGColor");
        getRunButtonFromBattle.setText("Capture Run Button From Battle");
        getRunButtonFromBattle.setPreferredSize(new java.awt.Dimension(250, 125));
        getRunButtonFromBattle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRunButtonFromBattleActionPerformed(evt);
            }
        });

        numOfAttempts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18
        numOfAttempts.setText(Integer.toString(ATT));
        

        pokeCaptureConfirmation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        

        runCaptureConfirmation.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(exitGui, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(getPokeOGColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentPokeHunt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                            .addComponent(capturePokeRect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getRunButtonFromBattle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pokeCaptureConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(runCaptureConfirmation, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentAttempts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numOfAttempts)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPokeHunt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capturePokeRect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getPokeOGColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pokeCaptureConfirmation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getRunButtonFromBattle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runCaptureConfirmation))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentAttempts)
                    .addComponent(numOfAttempts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitGui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        pack();
    }// </editor-fold>        
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SH3Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SH3Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SH3Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SH3Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SH3Gui().setVisible(true);
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
                
            }
        });
    }

    private void capturePokeRectActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //creating a rectangle around to pokemons name, made by the user
        ScreenCaptureRectangle SCR;

        try {
            //makes a rectangle and sets it to pokeName type rectangle
            SCR = new ScreenCaptureRectangle();
            pokeNamePicture = SCR.getRect();
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }                                               

    private void currentPokeHuntActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        pokeNameStr = currentPokeHunt.getText();
        
    } 
    
    private void getPokeOGColorActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        int whichPic = 0;
        
        pokeCords.setCords();
        gogcPoke.TakeScreenShot(pokeCords.getCordX(), pokeCords.getCordY(), whichPic);
        pokeCaptureConfirmation.setText("X: " + pokeCords.getCordX() + " Y: "+ pokeCords.getCordY());
    }

    private void getRunButtonFromBattleActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
        int whichPic = 1;
        runCords.setCords();
        gogcRunButton.TakeScreenShot(runCords.getCordX(), runCords.getCordY(),whichPic);
        runCaptureConfirmation.setText("X: " + runCords.getCordX() + " Y: "+ runCords.getCordY());
        
    }
    

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:

        try {
            
            screenVideoCapture();
            moveMouseToDsScreen();
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }                                         

    private void exitGuiActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
    }                                       

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        // TODO add your handling code here:
        
    }                               

	public void pokeNameSimilarityChecker(int a){

		System.out.println("Score: " + a);

		//3 is used as a good threshold of checking many changes the userWord
		//is from the OCRword

		if(a < 3 & isRunbuttonVisible() == true){

            
            if(checkForShiny() == true){

                System.exit(0);

            }else{
                
                System.out.println("In Battle, correct poke");
                addToATT(); // adds to attempt counter if pokemon found
                runFromBattle();
        
            }

		}else if(a >= 3 & isRunbuttonVisible() == true){

            
            System.out.println("In Battle, not correct poke");
                addToATT(); // adds to attempt counter if pokemon found
                runFromBattle();
                
		}

	}

    public void screenVideoCapture() throws AWTException 
	{	

        //vars just for this method
        int similarityIndex;
		String OCRword;	
        int everyOtherWalk = 0;
        int timeBetweenRuns = 10;

		ITesseract instance = new Tesseract();
        

		instance.setDatapath("Tessdata/tessdata"); // needs this to find tessdata stuff
		instance.setLanguage("poketext"); // telling OCR  what train data to use

			
		
		if(pokeNamePicture == null){
           System.err.println("NO PICTURE OF POKEMON NAME CREATED/FOUND");
           System.exit(1);
		}  

        moveMouseToDsScreen();
        runFromBattle();

        //this gives time for battle to be left
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		while (true) {
            
        
			try {
                
            
                if(isRunbuttonVisible()== true){

                    System.out.println("run Button visible");
                    
                }else{

                    if(everyOtherWalk == 0){
                        walkForWildPoke(everyOtherWalk);
                        everyOtherWalk = 2;
                    }else if(everyOtherWalk == 1){
                        walkForWildPoke(everyOtherWalk);
                        everyOtherWalk = 1;
                    }
                    everyOtherWalk --;
                }

                Thread.sleep(timeBetweenRuns);
				
				OCRword = instance.doOCR(imageFile); 
				OCRword = OCRword.replaceAll("\\s", ""); //removes all white space from word


				//program would get hung up sending large corrupted Strings sent to stringSimilarityChecker
				//added this to check the string before it got there
				if(OCRword.length() <= 15){

                    // System.out.println("Looking for: " + pokeNameStr);
					similarityIndex = stringSimilarityChecker.calculate(pokeNameStr, OCRword);
					pokeNameSimilarityChecker(similarityIndex);

				}
		
			}
			catch (InterruptedException | TesseractException ex) {
				System.out.println(ex);
			}
		}
	}

    public static boolean checkForShiny(){

        boolean shiny = false;
        

        try {

            String path = "newPokeColorCheck.bmp";
            

            Robot robot = new Robot();
            Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage pokepic = robot.createScreenCapture(captureSize);

            ImageIO.write(pokepic, "bmp", new File(path.toString()));   

            // do rgb checking here
            
            int color = pokepic.getRGB(pokeCords.getCordX(), pokeCords.getCordY());

            int  currentSSRed = (color & 0x00ff0000) >> 16;
            int  currentSSBlue = (color & 0x0000ff00) >> 8;
            int  currentSSGreen = color & 0x000000ff;

            if((currentSSRed != gogcPoke.getOGPred()) || (currentSSBlue != gogcPoke.getOGPblue()) || (currentSSGreen != gogcPoke.getOGPgreen())){
                
                shiny = true;
    
            }else{
    
               shiny = false;
            }

        } catch (Exception e) {
            //TODO: handle exception
        }

        return shiny;
    
    }


    public static void runFromBattle(){

        int time = 75;

        try {

            Robot r = new Robot();
            Thread.sleep(time);
            r.keyPress(KeyEvent.VK_S);
            Thread.sleep(time);
            r.keyRelease(KeyEvent.VK_S);
            Thread.sleep(time);
            r.keyPress(KeyEvent.VK_A);
            Thread.sleep(time);
            r.keyRelease(KeyEvent.VK_A);
            Thread.sleep(time);
            r.keyPress(KeyEvent.VK_A);
            Thread.sleep(time);
            r.keyRelease(KeyEvent.VK_A);
            Thread.sleep(time);
            r.keyPress(KeyEvent.VK_D);
            Thread.sleep(time);
            r.keyRelease(KeyEvent.VK_D);
            Thread.sleep(time);
            r.keyPress(KeyEvent.VK_NUMPAD2);
            Thread.sleep(time);
            r.keyRelease(KeyEvent.VK_NUMPAD2);
            Thread.sleep(time);
            //move to A press to see if i could fix problem

        } catch (AWTException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }


    public static void walkForWildPoke(int everyOtherWalk){
            int time = 75;
        try {
            Robot r = new Robot();

            //code to make character walk in square and randomly press A
            

            if(everyOtherWalk == 0){
                r.keyPress(KeyEvent.VK_D);
                Thread.sleep(time);
                r.keyRelease(KeyEvent.VK_D);

            }else if(everyOtherWalk == 1){
                r.keyPress(KeyEvent.VK_A);
                Thread.sleep(time);
                r.keyRelease(KeyEvent.VK_A);
            }
            
            
            
            
        } catch (AWTException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    

    public static void moveMouseToDsScreen(){

        try {
            Robot r = new Robot();
            r.mouseMove(pokeCords.getCordX(),pokeCords.getCordY());
            Thread.sleep(120);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(500);
        } catch (AWTException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    };


    public static boolean isRunbuttonVisible(){
        
        
        boolean runButtonShown = false;
        

        try {

            String path = "newRunColorCheck.bmp";
            

            Robot robot = new Robot();
            Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage runButton = robot.createScreenCapture(captureSize);

            ImageIO.write(runButton, "bmp", new File(path.toString()));   

            // do rgb checking here
            
            int color = runButton.getRGB(runCords.getCordX(), runCords.getCordY());

            int  currentSSRed = (color & 0x00ff0000) >> 16;
            int  currentSSBlue = (color & 0x0000ff00) >> 8;
            int  currentSSGreen = color & 0x000000ff;

            if((currentSSRed == gogcRunButton.getOGPred()) & (currentSSBlue == gogcRunButton.getOGPblue()) & (currentSSGreen == gogcRunButton.getOGPgreen())){
                
                runButtonShown = true;
    
            }else{
    
               runButtonShown = false;
            }

        } catch (Exception e) {
            //TODO: handle exception
        }

        return runButtonShown;

    }


    public void addToATT(){

        ATT++;
        try {
            FileWriter myWriter = new FileWriter("attempts.txt");
            myWriter.write("attempts: " + pokeNameStr + " - " + ATT);
            myWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
