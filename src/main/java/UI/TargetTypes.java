package UI;

import javax.swing.*;

public class TargetTypes {
    JButton buttonVolume;
    JButton buttonWeight;
    JButton buttonORM;

    public TargetTypes(JPanel panel, String action){
        JButton buttonVolume = new JButton(action + "Volume Target");
        JButton buttonWeight = new JButton(action + "Weight Target");
        JButton buttonORM = new JButton(action + "ORM Target");
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
