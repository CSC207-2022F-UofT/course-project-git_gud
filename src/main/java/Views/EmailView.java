package Views;

import Controllers.DashboardController;
import ViewUpdaters.EmailViewUpdate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class EmailView {
    public JPanel email;
    public EmailView(){
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
                        //System.out.println(DashboardController.ChangeEmailUseCase(oldEmail, newEmail, EmailView.this));
                        DashboardController.ChangeEmailUseCase(oldEmail, newEmail, EmailView.this);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    EmailViewUpdate updateEmailView = new EmailViewUpdate(EmailView.this);
                    //System.exit(0);
                }
                if (e.getSource() == backButton){
                    emailFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
