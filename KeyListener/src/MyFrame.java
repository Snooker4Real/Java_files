import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("rocket.png");

        label = new JLabel();
        label.setBounds(0,0,4000,2000);
        label.setIcon(icon);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'q' -> label.setLocation(label.getX() - 10, label.getY());
            case 'z' -> label.setLocation(label.getX(), label.getY() - 10);
            case 's' -> label.setLocation(label.getX(), label.getY() + 10);
            case 'd' -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // KeyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37 -> label.setLocation(label.getX() - 10, label.getY());
            case 38 -> label.setLocation(label.getX(), label.getY() - 10);
            case 40 -> label.setLocation(label.getX(), label.getY() + 10);
            case 39 -> label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = Called whenever a button is pressed
        System.out.println("You released Key Char : " + e.getKeyChar());
        System.out.println("You released Key code : " + e.getKeyCode() );
    }
}
