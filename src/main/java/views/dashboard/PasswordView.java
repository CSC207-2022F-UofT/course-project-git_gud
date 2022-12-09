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
public class PasswordView {
    public JPanel password;
    public PasswordView(){}

    public void CreatePasswordView(){
        JFrame passwordFrame = new JFrame();
        passwordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        passwordFrame.setSize(320, 564);
        passwordFrame.setLayout(null);
        passwordFrame.setTitle("Change Password");

        password = new JPanel();
        password.setLocation(0, 250);
        password.setBounds(50, 144, 200, 275);
        password.setBackground(Color.lightGray);
        password.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel inputPassword = new JLabel("Enter Your Current Password");

        JPasswordField passwordInput = new JPasswordField();

        JLabel inputNewPassword = new JLabel("Enter Your New Password");

        JPasswordField newPasswordInput = new JPasswordField();

        JButton submitButton = new JButton();
        JButton backButton = new JButton();


        passwordViewSetter(password, submitButton, backButton, passwordInput, newPasswordInput);

        password.add(inputPassword);
        password.add(passwordInput);
        password.add(inputNewPassword);
        password.add(newPasswordInput);
        password.add(submitButton);
        password.add(backButton);

        passwordFrame.add(password);
        passwordFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //once button submit is pressed, send to query changer
                if (e.getSource() == submitButton){
                    String oldPassword = String.valueOf(passwordInput.getPassword());
                    String newPassword = String.valueOf(newPasswordInput.getPassword());
                    try {
                        DashboardController.changePasswordUseCase(oldPassword, newPassword);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JLabel newInfo = new JLabel("Your Password Has Been Changed!");
                    password.add(newInfo);
                    password.revalidate();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage(null);
                    passwordFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
    public static void passwordViewSetter(JPanel viewType, JButton submitButton,
                                        JButton backButton, JTextField useCaseInput, JTextField newPasswordInput) {
        viewSetter(viewType, useCaseInput);
        useCaseInput.setText("");

        newPasswordInput.setPreferredSize(new Dimension(150, 20));
        newPasswordInput.setFont(new Font("Dialog", Font.BOLD, 7));
        newPasswordInput.setText("");

        buttonSetter(submitButton, backButton);
    }
}
