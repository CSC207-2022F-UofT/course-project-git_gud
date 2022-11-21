package UI;

import javax.swing.*;

/**
 * UI for when view Target option is clicked on the HomeUI screen
 * @author jhalaksaraogi
 */
public class ViewTargetOptions extends JFrame{
    public ViewTargetOptions(){
        this.setTitle("Choose Target to be added");
        this.setSize(500, 350);
        this.setLayout(null);
        this.setVisible(true);
    }

    /**
     * main function to create a frame for this class
     */
    public static void main(){
        ViewTargetOptions frame = new ViewTargetOptions();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "View ");

        frame.setVisible(true);
    }
}

