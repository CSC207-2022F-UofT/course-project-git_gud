package views;

import controllers.ViewController;
import entities.TargetORM;
import entities.TargetVolume;
import entities.TargetWeight;

import javax.swing.*;

/**
 * UI for when view Target option is clicked on the HomeTargetUI screen
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
        frame.setVisible(true);

        JButton ORM = types.getButtonORM();
        JButton volume = types.getButtonVolume();
        JButton weight = types.getButtonWeight();
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> frame.dispose());
        backButton.setBounds(0,0,100, 50);
        frame.add(backButton);
        ViewController viewORMController = new ViewController(TargetORM.getInstance());
        String stringORM = viewORMController.view(); //calls the controller method to view a target
        ORM.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringORM);   //displays relevant message indicating whether a target is deleted
        });

        ViewController viewVolumeController = new ViewController(TargetVolume.getInstance());
        String stringVolume = viewVolumeController.view();  //calls the controller method to view a target
        volume.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringVolume);   //displays targets
        });

        ViewController viewController = new ViewController(TargetWeight.getInstance());
        String stringWeight = viewController.view();  //calls the controller method to view a target
        weight.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringWeight);   //displays targets
        });

        frame.setVisible(true);
    }
}

