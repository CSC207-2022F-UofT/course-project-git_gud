package UI;

import controllers.ViewController;
import entities.TargetORM;

import javax.swing.*;

/**
 * UI for when view Target option is clicked on the HomeUI screen
 * @author jhalaksaraogi
 */
public class ViewTargetOptions extends JFrame{
    public ViewTargetOptions(){
        this.setTitle("Choose Target to be viewed");
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

        JButton ORM = types.getButtonORM();
        JButton volume = types.getButtonVolume();
        JButton weight = types.getButtonWeight();

        ViewController viewORMController = new ViewController(TargetORM.getInstance());
        String stringORM = viewORMController.view(); //calls the controller method to view a target
        ORM.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringORM);   //displays relevant message indicating whether a target is deleted
        });

        ViewController viewVolumeController = new ViewController(TargetORM.getInstance());
        String stringVolume = viewVolumeController.view();  //calls the controller method to view a target
        volume.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringVolume);   //displays targets
        });

        ViewController viewController = new ViewController(TargetORM.getInstance());
        String stringWeight = viewController.view();  //calls the controller method to view a target
        weight.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringWeight);   //displays targets
        });

        frame.setVisible(true);
    }
}

