import javax.swing.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();
    MyFrame(){
        this.add(dragPanel);
        this.setTitle("Frame Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
