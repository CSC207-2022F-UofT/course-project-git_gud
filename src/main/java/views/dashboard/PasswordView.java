//package views.dashboard;
//
//import controllers.DashboardController;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.SQLException;
//
//@SuppressWarnings("Convert2Lambda")
//public class PasswordView {
//    public JPanel password;
//    public PasswordView(){}
//
//    public void CreatePasswordView(){
//        JFrame passwordFrame = new JFrame();
//        passwordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        passwordFrame.setSize(320, 564);
//        passwordFrame.setLayout(null);
//        passwordFrame.setTitle("Change Password");
//
//        password = new JPanel();
//        password.setLocation(0, 250);
//        password.setBounds(50, 144, 200, 275);
//        password.setBackground(Color.lightGray);
//        password.setLayout(new FlowLayout(FlowLayout.CENTER));
//
//        JLabel inputPassword = new JLabel("Enter Your Current Password");
//
//        JPasswordField passwordInput = new JPasswordField();
//        passwordInput.setPreferredSize(new Dimension(150, 20));
//        passwordInput.setFont(new Font("Dialog", Font.BOLD, 10));
//
//        JLabel inputNewPassword = new JLabel("Enter Your New Password");
//
//        JPasswordField newPasswordInput = new JPasswordField();
//        newPasswordInput.setPreferredSize(new Dimension(150, 20));
//        newPasswordInput.setFont(new Font("Dialog", Font.BOLD, 10));
//
//        JButton submitButton = new JButton();
//        submitButton.setText("Submit");
//        submitButton.setFocusable(false);
//        submitButton.setFont(new Font("Dialog", Font.BOLD, 10));
//
//        JButton backButton = new JButton();
//        backButton.setText("Go Back");
//        backButton.setFocusable(false);
//        backButton.setFont(new Font("Dialog", Font.BOLD, 10));
//
//        password.add(inputPassword);
//        password.add(passwordInput);
//        password.add(inputNewPassword);
//        password.add(newPasswordInput);
//        password.add(submitButton);
//        password.add(backButton);
//
//        passwordFrame.add(password);
//        passwordFrame.setVisible(true);
//
//        ActionListener submission = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //once button submit is pressed, send to query changer
//                if (e.getSource() == submitButton){
//                    String oldPassword = String.valueOf(passwordInput.getPassword());
//                    String newPassword = String.valueOf(newPasswordInput.getPassword());
//                    try {
//                        DashboardController.changePasswordUseCase(oldPassword, newPassword);
//                    } catch (SQLException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                    JLabel newInfo = new JLabel("Your Password Has Been Changed!");
//                    password.add(newInfo);
//                    password.revalidate();
//                }
//                if (e.getSource() == backButton){
//                    SettingsPage newPage = new SettingsPage();
//                    newPage.CreateSettingsPage(null);
//                    passwordFrame.dispose();
//                }
//
//            }
//        };
//        submitButton.addActionListener(submission);
//        backButton.addActionListener(submission);
//    }
//}
