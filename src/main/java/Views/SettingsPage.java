package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("Convert2Lambda")
public class SettingsPage {

    public SettingsPage() {
        JFrame settingsFrame = new JFrame();
        settingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        settingsFrame.setSize(320, 564);
        settingsFrame.setLayout(null);
        settingsFrame.setTitle("User Dashboard");

        JPanel dashboard = new JPanel();
        dashboard.setLocation(0, 250);
        dashboard.setBounds(50, 144, 200, 275);
        dashboard.setBackground(Color.lightGray);
        dashboard.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton changeUsername = new JButton();
        JButton changeEmail = new JButton();
        JButton changePassword = new JButton();
        JButton deleteAccount = new JButton();
        JButton logOut = new JButton();
        JButton changeWeight = new JButton();
        JButton changeFat = new JButton();

        changeUsername.setText("Change Username");
        changeEmail.setText("Change Email");
        changePassword.setText("Change Password");
        deleteAccount.setText("Delete Account");
        logOut.setText("Log Out");
        changeWeight.setText("Change Weight");
        changeFat.setText("Change Fat");

        changeUsername.setFocusable(false);
        changeEmail.setFocusable(false);
        changePassword.setFocusable(false);
        deleteAccount.setFocusable(false);
        logOut.setFocusable(false);
        changeWeight.setFocusable(false);
        changeFat.setFocusable(false);

        changeUsername.setFont(new Font("Dialog", Font.BOLD, 10));
        changeEmail.setFont(new Font("Dialog", Font.BOLD, 10));
        changePassword.setFont(new Font("Dialog", Font.BOLD, 10));
        deleteAccount.setFont(new Font("Dialog", Font.BOLD, 10));
        logOut.setFont(new Font("Dialog", Font.BOLD, 10));
        changeWeight.setFont(new Font("Dialog", Font.BOLD, 10));
        changeFat.setFont(new Font("Dialog", Font.BOLD, 10));

        dashboard.add(changeUsername);
        dashboard.add(changeEmail);
        dashboard.add(changePassword);
        dashboard.add(changeWeight);
        dashboard.add(changeFat);
        dashboard.add(deleteAccount);
        dashboard.add(logOut);


        settingsFrame.add(dashboard);
        settingsFrame.setVisible(true);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == changeUsername) {
                    UsernameView usernameViewer = new UsernameView();
                    //System.exit(0);
                }
                if (e.getSource() == changeEmail) {
                    EmailView emailViewer = new EmailView();
                }
                if (e.getSource() == changePassword) {
                    PasswordView passwordViewer = new PasswordView();
                }
                if (e.getSource() == deleteAccount) {
                    DeleteView deleteViewer = new DeleteView();
                }
                if (e.getSource() == logOut) {
                    System.exit(0);
                }
                if (e.getSource() == changeWeight) {
                    WeightView weightViewer = new WeightView();
                }
                if (e.getSource() == changeFat) {
                    FatView fatViewer = new FatView();
                }
            }
        };
        changeUsername.addActionListener(action);
        changeEmail.addActionListener(action);
        changePassword.addActionListener(action);
        deleteAccount.addActionListener(action);
        logOut.addActionListener(action);
        changeWeight.addActionListener(action);
        changeFat.addActionListener(action);
    }
}
