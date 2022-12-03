package views.dashboard;

import controllers.DashboardController;
import views.ViewLoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class DeleteView {
    public JPanel delete;
    public static JFrame deleteFrame;
    public DeleteView(){}

    public void CreateDeleteView(){
        deleteFrame = new JFrame();
        deleteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deleteFrame.setSize(320, 564);
        deleteFrame.setLayout(null);
        deleteFrame.setTitle("Delete Account");

        delete = new JPanel();
        delete.setLocation(0, 250);
        delete.setBounds(50, 144, 200, 275);
        delete.setBackground(Color.lightGray);
        delete.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField usernameInput = new JTextField();
        usernameInput.setPreferredSize(new Dimension(150, 20));
        usernameInput.setFont(new Font("Dialog", Font.BOLD, 10));
        usernameInput.setText("Please Enter Your Current Username");

        JButton deleteButton = new JButton();
        deleteButton.setText("Delete");
        deleteButton.setFocusable(false);
        deleteButton.setFont(new Font("Dialog", Font.BOLD, 10));

        JButton backButton = new JButton();
        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));

        delete.add(usernameInput);
        delete.add(deleteButton);
        delete.add(backButton);

        deleteFrame.add(delete);
        deleteFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == deleteButton){
                    String userName = usernameInput.getText();
                    try {
                        DashboardController.deleteAccountUseCase(userName);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    deleteFrame.dispose();
                    ViewLoginPage newLoginPage = new ViewLoginPage();
                    //newLoginPage.CreateLoginPage();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage(null);
                    deleteFrame.dispose();
                }

            }
        };
        deleteButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
