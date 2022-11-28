package Views.dashboard;

import Controllers.DashboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class EmailView {
    public JPanel email;
    public EmailView(){}
    public void CreateEmailView(){
        JFrame emailFrame = new JFrame();
        emailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emailFrame.setSize(320, 564);
        emailFrame.setLayout(null);
        emailFrame.setTitle("Change Email");

        email = new JPanel();
        email.setLocation(0, 250);
        email.setBounds(50, 144, 200, 275);
        email.setBackground(Color.lightGray);
        email.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField emailInput = new JTextField();
        emailInput.setPreferredSize(new Dimension(150, 20));
        emailInput.setFont(new Font("Dialog", Font.BOLD, 10));
        emailInput.setText("Please Enter Your Current Email");


        JTextField newEmailInput = new JTextField();
        newEmailInput.setPreferredSize(new Dimension(150, 20));
        newEmailInput.setFont(new Font("Dialog", Font.BOLD, 10));
        newEmailInput.setText("Please Enter Your New Email");

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Dialog", Font.BOLD, 10));

        JButton backButton = new JButton();
        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));

        email.add(emailInput);
        email.add(newEmailInput);
        email.add(submitButton);
        email.add(backButton);

        emailFrame.add(email);
        emailFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //once button submit is pressed, send to query changer
                if (e.getSource() == submitButton){
                    String oldEmail = emailInput.getText();
                    String newEmail = newEmailInput.getText();
                    try {
                        DashboardController.changeEmailUseCase(oldEmail, newEmail);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JLabel newInfo = new JLabel("Your Email Has Been Changed!");
                    email.add(newInfo);
                    email.revalidate();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage();
                    emailFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
