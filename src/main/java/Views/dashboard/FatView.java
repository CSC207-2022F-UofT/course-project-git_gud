package Views.dashboard;

import Controllers.DashboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class FatView {
    public JPanel fat;
    public FatView() {}

    public void CreateFatView(){
        JFrame fatFrame = new JFrame();
        fatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fatFrame.setSize(320, 564);
        fatFrame.setLayout(null);
        fatFrame.setTitle("Change Body Fat");

        fat = new JPanel();
        fat.setLocation(0, 250);
        fat.setBounds(50, 144, 200, 275);
        fat.setBackground(Color.lightGray);
        fat.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField usernameInput = new JTextField();
        usernameInput.setPreferredSize(new Dimension(150, 20));
        usernameInput.setFont(new Font("Dialog", Font.BOLD, 7));
        usernameInput.setText("Please Enter Your Current Username");


        JTextField newFatInput = new JTextField();
        newFatInput.setPreferredSize(new Dimension(150, 20));
        newFatInput.setFont(new Font("Dialog", Font.BOLD, 7));
        newFatInput.setText("Please Enter Your New Body Fat");

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Dialog", Font.BOLD, 10));

        JButton backButton = new JButton();
        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));

        fat.add(usernameInput);
        fat.add(newFatInput);
        fat.add(submitButton);
        fat.add(backButton);

        fatFrame.add(fat);
        fatFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //once button submit is pressed, send to query changer
                if (e.getSource() == submitButton){
                    String userName = usernameInput.getText();
                    int newBodyFat = Integer.parseInt(newFatInput.getText());
                    try {
                        DashboardController.changeBodyFatUseCase(userName, newBodyFat);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JLabel newInfo = new JLabel("Your Fat Has Been Changed!");
                    fat.add(newInfo);
                    fat.revalidate();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage();
                    fatFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
