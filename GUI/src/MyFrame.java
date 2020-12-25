import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("JFrame Title goes here"); // sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
        this.setResizable(false); // prevent this for being resized
        this.setSize(420, 420); // set the  x & y dimension of this
        this.setVisible(true); //make this visible

        ImageIcon image  = new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of this
        this.getContentPane().setBackground(Color.orange); // Change color of background
        // or
        //this.getContentPane().setBackground( new Color (255,0,250)); // Change color of background
    }

}
