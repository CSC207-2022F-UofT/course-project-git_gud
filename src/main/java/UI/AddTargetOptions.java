package UI;

import javax.swing.*;

public class AddTargetOptions extends JFrame{

    public AddTargetOptions(){
        this.setTitle("Choose Target to be added");
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
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Add ");
        frame.setVisible(true);
    }

}
