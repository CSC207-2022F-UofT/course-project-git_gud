package Screens;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ErrorScreen {

    public ErrorScreen(){

        String message = "No data has been recorded for this.";

        JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
                JOptionPane.ERROR_MESSAGE);


    }

}
