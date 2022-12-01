package views;

import entities.TargetORM;
import entities.TargetVolume;
import entities.TargetWeight;

import javax.swing.*;

/**
 * UI for when add Target option is clicked on the HomeTargetUI screen
 * @author jhalaksaraogi
 */
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
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        TargetTypes types = new TargetTypes((JPanel) frame.getContentPane(), "Add "); // the Target types class
        // has buttons for Volume, Weight and ORM. These buttons are added to the panel. types is initialised to access
        // these buttons for when an action should be performed
        frame.setVisible(true);
        JButton ORM = types.getButtonORM();
        JButton volume = types.getButtonVolume();
        JButton weight = types.getButtonWeight();
        ORM.addActionListener(e -> {
            AddTargetView viewORM = new AddTargetView(TargetORM.getInstance());
            viewORM.main();
        });
        volume.addActionListener(e -> {
            AddTargetView viewVolume = new AddTargetView(TargetVolume.getInstance());
            viewVolume.main();
        });
        weight.addActionListener(e -> {
            AddTargetView viewWeight = new AddTargetView(TargetWeight.getInstance());
            viewWeight.main();
        });
    }

}
