package views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorScreen extends JFrame {

    public ErrorScreen(){

        String message = "No data has been recorded for this.";

        JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                JOptionPane.ERROR_MESSAGE);


    }

}
