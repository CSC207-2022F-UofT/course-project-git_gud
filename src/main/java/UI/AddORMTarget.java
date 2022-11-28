package UI;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jhalaksaraogi
 * Class to display screen for Adding a target and saving the entered value
 */
public class AddORMTarget extends JFrame{
    public static float value;
    public static Date date;

    /**
     * Constructor for this class
     */
    public AddORMTarget(){
        this.setTitle("Add Target");
        this.setSize(700,500);

        this.setVisible(true);
    }
    public static void main(){

        AddORMTarget frame = new AddORMTarget();
        EnterTarget enterUI = new EnterTarget((JPanel) frame.getContentPane());
        JTextField valueField = enterUI.getValueField();
        JTextField dateField = enterUI.getDateField();
        JButton confirmButton = enterUI.getConfirmButton();

        // action listener for when the confirm button is clicked. The action listener stores the target value
        // and date entered by the user as instance variables of this class
        confirmButton.addActionListener(e -> {
            value = (float) Double.parseDouble(valueField.getText());
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(dateField.getText());
                frame.dispose();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
