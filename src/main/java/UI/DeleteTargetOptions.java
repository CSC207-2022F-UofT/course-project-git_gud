package UI;

import controllers.DeleteORMController;
import controllers.DeleteVolumeController;
import controllers.DeleteWeightController;

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
        DeleteTargetOptions frame = new DeleteTargetOptions();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Delete ");
        JButton DelORM = types.getButtonORM();
        JButton DelVolume = types.getButtonVolume();
        JButton DelWeight = types.getButtonWeight();
        DeleteORMController deleteORMController = new DeleteORMController();
        String stringORM = deleteORMController.delete();
        DelORM.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringORM);
        });
        DeleteVolumeController deleteVolumeController = new DeleteVolumeController();
        String stringVolume = deleteVolumeController.delete();
        DelVolume.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringVolume);
        });
        DeleteWeightController deleteWeightController = new DeleteWeightController();
        String stringWeight = deleteWeightController.delete();
        DelWeight.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame,
                    stringWeight);
        });

        frame.setVisible(true);

    }
}
