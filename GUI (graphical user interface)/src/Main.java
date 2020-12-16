import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Entrer ton nom : ");
        JOptionPane.showMessageDialog(null, "Bonjour " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Entrer votre âge : "));
        JOptionPane.showMessageDialog(null, "Vou avez "+ age + " ans");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Entrez votre poids : "));
        JOptionPane.showMessageDialog(null, "Vous faites "+ height + " cm de taille");

    }
}
