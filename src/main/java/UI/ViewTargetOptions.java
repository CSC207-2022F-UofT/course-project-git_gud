package UI;

import controllers.ViewORMController;
import controllers.ViewVolumeController;
import controllers.ViewWeightController;

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

        ViewORMController viewORMController = new ViewORMController();
        String stringORM = viewORMController.viewORM(); //calls the controller method to view a target
        ORM.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringORM);   //displays relevant message indicating whether a target is deleted
        });

        ViewVolumeController viewVolumeController = new ViewVolumeController();
        String stringVolume = viewVolumeController.viewVolume();  //calls the controller method to delete a target
        volume.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringVolume);   //displays relevant message indicating whether a target is deleted
        });

        ViewWeightController viewWeightController = new ViewWeightController();
        String stringWeight = viewWeightController.viewWeight();  //calls the controller method to delete a target
        weight.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringWeight);   //displays relevant message indicating whether a target is deleted
        });

        frame.setVisible(true);
    }
}

