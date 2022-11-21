package Views;

import Controllers.DashboardController;
import Presenters.PresenterViewUpdate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class UsernameView {
    public JPanel username;
    public UsernameView(){
        JFrame usernameFrame = new JFrame();
        usernameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        usernameFrame.setSize(320, 564);
        usernameFrame.setLayout(null);
        usernameFrame.setTitle("Change Username");

        username = new JPanel();
        username.setLocation(0, 250);
        username.setBounds(50, 144, 200, 275);
        username.setBackground(Color.lightGray);
        username.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField usernameInput = new JTextField();
        usernameInput.setPreferredSize(new Dimension(150, 20));
        usernameInput.setFont(new Font("Dialog", Font.BOLD, 10));
        usernameInput.setText("Please Enter Your Current Username");


        JTextField newUsernameInput = new JTextField();
        newUsernameInput.setPreferredSize(new Dimension(150, 20));
        newUsernameInput.setFont(new Font("Dialog", Font.BOLD, 10));
        newUsernameInput.setText("Please Enter Your New Username");

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Dialog", Font.BOLD, 10));

        JButton backButton = new JButton();
        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));

        username.add(usernameInput);
        username.add(newUsernameInput);
        username.add(submitButton);
        username.add(backButton);

        usernameFrame.add(username);
        usernameFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //once button submit is pressed, send to query changer
                if (e.getSource() == submitButton){
                    String userName = usernameInput.getText();
                    String newUserName = newUsernameInput.getText();
                    try {
                        DashboardController.ChangeUsernameUseCase(userName, newUserName);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    PresenterViewUpdate updateUsernameView = new PresenterViewUpdate.UpdateUsernameView(UsernameView.this);
                    //System.exit(0);
                }
                if (e.getSource() == backButton){
                    usernameFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
