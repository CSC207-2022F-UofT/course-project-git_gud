package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * UI to add enter a target
 * @author jhalaksaraogi
 */
public class EnterTarget {
    JLabel valueLabel;
    JLabel dateLabel;
    JTextField valueField;
    JTextField dateField;
    JButton confirmButton;

    /**
     *
     * @param panel Jpanel to which the fields and labels should be added
     * Constructor to create fields for value and date
     */
    public EnterTarget(JPanel panel){

        this.dateLabel = new JLabel("Date");
        this.dateLabel.setBounds(50, 150, 150, 50);
        panel.add(dateLabel);
        this.valueLabel = new JLabel("Value");
        this.valueLabel.setBounds(50, 50, 150, 50);
        panel.add(dateField);

        this.valueField = new JTextField();
        this.valueField.setBounds(50, 250, 250, 50);
        panel.add(valueField);
        this.dateField = new JTextField();
        this.dateField.setBounds(50, 250, 250, 50);
        panel.add(dateField);

        this.confirmButton = new JButton();
        this.confirmButton.setBounds(100, 350, 200, 50);
        panel.add(confirmButton);

    }

    public JTextField getDateField() {
        return dateField;
    }

    public JTextField getValueField() {
        return valueField;
    }

    public JButton getConfirmButton() {
        return confirmButton;
    }
}
