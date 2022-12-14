package views;

import controllers.DeleteController;
import entities.TargetORM;
import entities.TargetVolume;
import entities.TargetWeight;

import javax.swing.*;
/**
 * UI for when delete Target option is clicked on the HomeTargetUI screen
 * @author jhalaksaraogi
 */
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
        DeleteTargetOptions frame = new DeleteTargetOptions();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Delete "); // the Target types class
        // has buttons for Volume, Weight and ORM. These buttons are added to the panel. types is initialised to access
        // these buttons and perform actions

        JButton DelORM = types.getButtonORM();
        JButton DelVolume = types.getButtonVolume();
        JButton DelWeight = types.getButtonWeight();
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> frame.dispose());
        backButton.setBounds(0,0,100, 50);
        frame.add(backButton);

        DeleteController deleteControllerORM = new DeleteController(TargetORM.getInstance());
        String stringORM = deleteControllerORM.delete(); //calls the controller method to delete a target
        DelORM.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringORM);   //displays relevant message indicating whether a target is deleted
        });

        DeleteController deleteControllerVolume = new DeleteController(TargetVolume.getInstance());
        String stringVolume = deleteControllerVolume.delete();  //calls the controller method to delete a target
        DelVolume.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringVolume);   //displays relevant message indicating whether a target is deleted
        });

        DeleteController deleteControllerWeight = new DeleteController(TargetWeight.getInstance());
        String stringWeight = deleteControllerWeight.delete();  //calls the controller method to delete a target
        DelWeight.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringWeight);   //displays relevant message indicating whether a target is deleted
        });

        frame.setVisible(true);

    }
}
