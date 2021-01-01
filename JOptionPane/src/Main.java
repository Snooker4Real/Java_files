import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane =    pop up a standard dialog box that prompts users for a value
        //                  or inform them or something

        //JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more useless info","title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"really ?","title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Your computer has a VIRUS !!!","title",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Call tech support now or else !!!","title",JOptionPane.ERROR_MESSAGE);


        //int answer = JOptionPane.showConfirmDialog(null,"Bro do you even code ?","this is my title",JOptionPane.YES_NO_CANCEL_OPTION);

        //String name = JOptionPane.showInputDialog("What is your name?:");
        //System.out.println("Hello "+ name);

        String[] responses = {"No, you're awesome!","thank you!","*blush*"};

        ImageIcon icon = new ImageIcon("smile.png");
        JOptionPane.showOptionDialog(
                null,
                "You're awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}
