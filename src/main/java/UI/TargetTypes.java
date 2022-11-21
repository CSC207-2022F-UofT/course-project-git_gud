package UI;

import javax.swing.*;

/**
 * The class TargetTypes is essentially made to create 3 buttons common to all use cases(Volume, weight and
 * ORM). Reduces responsibilities of the TargetOptions Classes.
 * @author jhalaksaraogi
 **/
public class TargetTypes {
    JButton buttonVolume;
    JButton buttonWeight;
    JButton buttonORM;

    /**
     *
     * @param panel the panel of the Frame to which the three buttons should be added
     * @param action the string of the action performed(view, add, delete) merely for the button's text
     *
     */
    public TargetTypes(JPanel panel, String action){
        this.buttonVolume = new JButton(action + "Volume Target");
        this.buttonWeight = new JButton(action + "Weight Target");
        this.buttonORM = new JButton(action + "ORM Target");
        buttonVolume.setBounds(100, 50, 300, 50);
        buttonWeight.setBounds(100, 130, 300, 50);
        buttonORM.setBounds(100, 200, 300, 50);
        panel.add(buttonVolume);
        panel.add(buttonORM);
        panel.add(buttonWeight);
    }

    /**
     * returns respective button so UI file can add action or edit the button
     * @return button
     */
    public JButton getButtonORM() {
        return buttonORM;
    }
    /**
     * @return button
     */
    public JButton getButtonVolume() {
        return buttonVolume;
    }

    /**
     *
     * @return button
     */

    public JButton getButtonWeight() {
        return buttonWeight;
    }

}
