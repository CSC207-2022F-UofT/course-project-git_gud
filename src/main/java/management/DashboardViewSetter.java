package management;

import javax.swing.*;
import java.awt.*;

public class DashboardViewSetter {
    public static void buttonSetter(JButton submitButton, JButton backButton) {
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Dialog",Font.BOLD, 10));

        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));
    }

    public static void viewSetter(JPanel viewType, JTextField useCaseInput) {
        viewType.setLocation(0, 250);
        viewType.setBounds(50, 144, 200, 275);
        viewType.setBackground(Color.lightGray);
        viewType.setLayout(new FlowLayout(FlowLayout.CENTER));

        useCaseInput.setPreferredSize(new Dimension(150, 20));
        useCaseInput.setFont(new Font("Dialog", Font.BOLD, 7));
    }
}
