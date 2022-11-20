package UI;

import javax.swing.*;

public class EditTargetOptions extends JFrame{
    public EditTargetOptions(){
        this.setTitle("Choose Target to be edited");
        this.setSize(500, 350);
        this.setLayout(null);
        this.setVisible(true);
    }

    /**
     * main function to create a frame for this class
     */
    public static void main(){
        EditTargetOptions frame = new EditTargetOptions();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Edit ");
        frame.setVisible(true);
    }


}
