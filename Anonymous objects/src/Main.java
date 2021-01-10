import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        for (int i = 1; i<=52;i++){
            deck.add(new JLabel(new ImageIcon("cards/"+i+".png")));
            frame.add(deck.get(i-1));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
