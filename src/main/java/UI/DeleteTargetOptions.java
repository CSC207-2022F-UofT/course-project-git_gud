package UI;

import javax.swing.*;

public class DeleteTargetOptions extends JFrame{
    public DeleteTargetOptions(){
        this.setTitle("Choose Target to be deleted");
        this.setSize(500, 350);
        this.setLayout(null);
        this.setVisible(true);
    }

    /**
     * main function to create a frame for this class
     */
    public static void main(){
        AddTargetOptions frame = new AddTargetOptions();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Delete ");
        frame.setVisible(true);
    }
}
