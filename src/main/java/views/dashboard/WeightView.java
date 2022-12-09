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
public class WeightView {
    /**
     * WeightView holds a constructor that instantiates a new view model for the usecase of changing a USER's weight
     * stats
     */
    public JPanel weight;
    public WeightView(){}

    public void CreateWeightView(){
        JFrame weightFrame = new JFrame();
        weightFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        weightFrame.setSize(320, 564);
        weightFrame.setLayout(null);
        weightFrame.setTitle("Change Body Weight");

        weight = new JPanel();

        JTextField weightInput = new JTextField();
        JTextField userNameInput = new JTextField();

        JButton submitButton = new JButton();
        JButton backButton = new JButton();

        weightViewSetter(weight, submitButton, backButton, weightInput, userNameInput);

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
    public static void weightViewSetter(JPanel viewType, JButton submitButton,
                                    JButton backButton, JTextField useCaseInput, JTextField userNameInput) {
        viewSetter(viewType, useCaseInput);
        useCaseInput.setText("Please Enter Your New Body Weight");

        userNameInput.setPreferredSize(new Dimension(150, 20));
        userNameInput.setFont(new Font("Dialog", Font.BOLD, 7));
        userNameInput.setText("Please Enter Your Current Username");

        buttonSetter(submitButton, backButton);
    }
}
