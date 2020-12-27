import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JLabels = a GUI display area for a string or a text, an image or both

        ImageIcon image = new ImageIcon("dude.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Bro, do you even code ?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(255,0,0)); // set font color of text
        label.setFont(new Font("Arial", Font.PLAIN, 60)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.black); // set  background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        //label.setBounds(0,0,750, 750); //set x & y position within frame as well as dimension

        JFrame frame = new JFrame(); //Create a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
        frame.setSize(1200, 800); // set the  x & y dimension of frame
        //frame.setLayout(null);
        frame.setVisible(true); //make frame visible
        frame.add(label);
        frame.pack();
    }
}
