package views.dashboard;

import controllers.DashboardController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

@SuppressWarnings("Convert2Lambda")
public class WeightView {
    public JPanel weight;
    public WeightView(){}

    public void CreateWeightView(){
        JFrame weightFrame = new JFrame();
        weightFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        weightFrame.setSize(320, 564);
        weightFrame.setLayout(null);
        weightFrame.setTitle("Change Body Weight");

        weight = new JPanel();
        weight.setLocation(0, 250);
        weight.setBounds(50, 144, 200, 275);
        weight.setBackground(Color.lightGray);
        weight.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField weightInput = new JTextField();
        weightInput.setPreferredSize(new Dimension(150, 20));
        weightInput.setFont(new Font("Dialog", Font.BOLD, 7));
        weightInput.setText("Please Enter Your New Body Weight");


        JTextField userNameInput = new JTextField();
        userNameInput.setPreferredSize(new Dimension(150, 20));
        userNameInput.setFont(new Font("Dialog", Font.BOLD, 7));
        userNameInput.setText("Please Enter Your Current Username");

        JButton submitButton = new JButton();
        submitButton.setText("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Dialog", Font.BOLD, 10));

        JButton backButton = new JButton();
        backButton.setText("Go Back");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 10));

        weight.add(userNameInput);
        weight.add(weightInput);
        weight.add(submitButton);
        weight.add(backButton);

        weightFrame.add(weight);
        weightFrame.setVisible(true);

        ActionListener submission = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //once button submit is pressed, send to query changer
                if (e.getSource() == submitButton){
                    String userName = userNameInput.getText();
                    int newBodyWeight = Integer.parseInt(weightInput.getText());
                    try {
                        DashboardController.changeBodyWeightUseCase(userName, newBodyWeight);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    JLabel newInfo = new JLabel("Your Weight Has Been Changed!");
                    weight.add(newInfo);
                    weight.revalidate();
                }
                if (e.getSource() == backButton){
                    SettingsPage newPage = new SettingsPage();
                    newPage.CreateSettingsPage(null);
                    weightFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
}
