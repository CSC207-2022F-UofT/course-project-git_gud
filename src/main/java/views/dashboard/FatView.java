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
public class FatView {
    /**
     * FatView holds a constructor that instantiates a new view model for the usecase of changing a USER's fat stats
     */
    public JPanel fat;
    public FatView() {}

    public void CreateFatView(){
        JFrame fatFrame = new JFrame();
        fatFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fatFrame.setSize(320, 564);
        fatFrame.setLayout(null);
        fatFrame.setTitle("Change Body Fat");

        fat = new JPanel();

        JTextField usernameInput = new JTextField();
        JTextField newFatInput = new JTextField();

        JButton submitButton = new JButton();
        JButton backButton = new JButton();

        fatViewSetter(fat, submitButton, backButton, newFatInput, usernameInput);

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
                    newPage.CreateSettingsPage(null);
                    fatFrame.dispose();
                }

            }
        };
        submitButton.addActionListener(submission);
        backButton.addActionListener(submission);
    }
    public static void fatViewSetter(JPanel viewType, JButton submitButton,
                                        JButton backButton, JTextField useCaseInput, JTextField userNameInput) {
        viewSetter(viewType, useCaseInput);
        useCaseInput.setText("Please Enter Your New Body Fat");

        userNameInput.setPreferredSize(new Dimension(150, 20));
        userNameInput.setFont(new Font("Dialog", Font.BOLD, 7));
        userNameInput.setText("Please Enter Your Current Username");

        buttonSetter(submitButton, backButton);
    }
}
