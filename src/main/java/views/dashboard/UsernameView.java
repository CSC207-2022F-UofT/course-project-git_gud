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
public class UsernameView {
    /**
     * UsernameView holds a constructor that instantiates a new view model for the usecase of changing a USER's username
     */
    public JPanel username;
    public UsernameView(){}

    public void CreateUsernameView(){
        JFrame usernameFrame = new JFrame();
        usernameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        usernameFrame.setSize(320, 564);
        usernameFrame.setLayout(null);
        usernameFrame.setTitle("Change Username");

        username = new JPanel();

        JTextField usernameInput = new JTextField();
        JTextField newUsernameInput = new JTextField();

        JButton submitButton = new JButton();
        JButton backButton = new JButton();

        usernameViewSetter(username, submitButton, backButton, usernameInput, newUsernameInput);

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
                        DashboardController.changeUsernameUseCase(userName, newUserName);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JLabel newInfo = new JLabel("Your Username Has Been Changed!");
                    username.add(newInfo);
                    username.revalidate();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage(null);
                    usernameFrame.dispose();
                }
            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
    public static void usernameViewSetter(JPanel viewType, JButton submitButton,
                                        JButton backButton, JTextField useCaseInput, JTextField userNameInput) {
        viewSetter(viewType, userNameInput);
        userNameInput.setText("Please Enter Your New Username");

        useCaseInput.setPreferredSize(new Dimension(150, 20));
        useCaseInput.setFont(new Font("Dialog", Font.BOLD, 7));
        useCaseInput.setText("Please Enter Your Current Username");

        buttonSetter(submitButton, backButton);
    }



}
