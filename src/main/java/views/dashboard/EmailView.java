package views.dashboard;

import controllers.DashboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static management.DashboardViewSetter.buttonSetter;
import static management.DashboardViewSetter.viewSetter;

@SuppressWarnings("Convert2Lambda")
public class EmailView {
    /**
     * EmailView holds a constructor that instantiates a new view model for the usecase of changing a USER's email
     */
    public JPanel email;
    public EmailView(){}
    public void CreateEmailView(){
        JFrame emailFrame = new JFrame();
        emailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emailFrame.setSize(320, 564);
        emailFrame.setLayout(null);
        emailFrame.setTitle("Change Email");

        email = new JPanel();

        JTextField emailInput = new JTextField();
        JTextField newEmailInput = new JTextField();

        JButton submitButton = new JButton();
        JButton backButton = new JButton();

        emailViewSetter(email, submitButton, backButton, emailInput, newEmailInput);

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
                    newPage.CreateSettingsPage(null);
                    emailFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
    public static void emailViewSetter(JPanel viewType, JButton submitButton,
                                        JButton backButton, JTextField useCaseInput, JTextField newEmailInput) {
        viewSetter(viewType, useCaseInput);
        useCaseInput.setText("Please Enter Your Current Email");

        newEmailInput.setPreferredSize(new Dimension(150, 20));
        newEmailInput.setFont(new Font("Dialog", Font.BOLD, 7));
        newEmailInput.setText("Please Enter Your New Email");

        buttonSetter(submitButton, backButton);
    }
}
