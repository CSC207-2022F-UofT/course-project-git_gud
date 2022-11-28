package UI;

import javax.swing.*;

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
     */
    public EnterTarget(JPanel panel){

        this.dateLabel = new JLabel("Date", JLabel.CENTER);
        dateLabel.setHorizontalTextPosition(JLabel.CENTER);
        dateLabel.setVerticalTextPosition(JLabel.BOTTOM);
        dateLabel.setOpaque(true);
        this.dateLabel.setBounds(50, 150, 150, 50);
        panel.add(dateLabel);


        this.valueLabel = new JLabel("Value", JLabel.CENTER);
        valueLabel.setHorizontalTextPosition(JLabel.CENTER);
        valueLabel.setVerticalTextPosition(JLabel.BOTTOM);
        this.valueLabel.setBounds(50, 50, 150, 50);
        panel.add(valueLabel);

        this.valueField = new JTextField();
        this.valueField.setBounds(250, 50, 250, 50);
        panel.add(valueField);

        this.dateField = new JTextField();
        this.dateField.setBounds(250, 150, 250, 50);
        panel.add(dateField);

        this.confirmButton = new JButton("Confirm");
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

    public JLabel getDateLabel() {
        return dateLabel;
    }

    public JLabel getValueLabel() {
        return valueLabel;
    }
}
