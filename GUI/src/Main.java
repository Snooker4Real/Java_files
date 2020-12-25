import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JFrame = a  GUI window to add components to
        /*
        JFrame frame = new JFrame(); //Create a frame
        frame.setTitle("JFrame Title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
        frame.setResizable(false); // prevent frame for being resized
        frame.setSize(420, 420); // set the  x & y dimension of frame
        frame.setVisible(true); //make frame visible

        ImageIcon image  = new ImageIcon("logo.png"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(Color.orange); // Change color of background
        // or
        //frame.getContentPane().setBackground( new Color (255,0,250)); // Change color of background

         */

        MyFrame myFrame = new MyFrame();
    }
}
