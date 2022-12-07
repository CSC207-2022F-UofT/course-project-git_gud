package views;
import entities.TargetORM;
import entities.TargetVolume;
import entities.TargetWeight;

import javax.swing.*;
/**
 * UI for when edit Target option is clicked on the HomeTargetUI screen
 * @author jhalaksaraogi
 */
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
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Edit ");
        frame.setVisible(true);
        frame.setVisible(true);
        JButton ORM = types.getButtonORM();
        JButton volume = types.getButtonVolume();
        JButton weight = types.getButtonWeight();
        ORM.addActionListener(e -> {
            EditTargetView viewORM = new EditTargetView(TargetORM.getInstance());
            viewORM.main();
        });
        volume.addActionListener(e -> {
            EditTargetView viewVolume = new EditTargetView(TargetVolume.getInstance());
            viewVolume.main();
        });
        weight.addActionListener(e -> {
            EditTargetView viewWeight = new EditTargetView(TargetWeight.getInstance());
            viewWeight.main();
        });
    }


}
