package views.dashboard;




import controllers.GraphController;
import graph_use_case.GraphInteractor;
import graph_use_case.GraphResponseFormatter;
import views.GraphMenu;
import views.HomeTargetUI;
import views.RoutineManagerView;
import views.ViewLoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("Convert2Lambda")
public class SettingsPage {
    /***
     * SettingsPage is called by Main.java and builds a GUI with all the available settings for the app. From here you can
     * pick what setting to perform which then calls upon other view pages.
     */

    public SettingsPage() {}

    public void CreateSettingsPage(){
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
        JSeparator horizontalLine = new JSeparator();
        JButton goToGraphs = new JButton();
        JButton goToGoals = new JButton();
        JButton goToWorkouts = new JButton();

        changeUsername.setText("Change Username");
        changeEmail.setText("Change Email");
        changePassword.setText("Change Password");
        deleteAccount.setText("Delete Account");
        logOut.setText("Log Out");
        changeWeight.setText("Change Weight");
        changeFat.setText("Change Fat");
        goToGraphs.setText("Graphs");
        goToGoals.setText("Goals");
        goToWorkouts.setText("Workouts");

        changeUsername.setFocusable(false);
        changeEmail.setFocusable(false);
        changePassword.setFocusable(false);
        deleteAccount.setFocusable(false);
        logOut.setFocusable(false);
        changeWeight.setFocusable(false);
        changeFat.setFocusable(false);
        goToGraphs.setFocusable(false);
        goToWorkouts.setFocusable(false);
        goToGoals.setFocusable(false);
        horizontalLine.setFocusable(false);

        horizontalLine.setOrientation(SwingConstants.HORIZONTAL);

        changeUsername.setFont(new Font("Dialog", Font.BOLD, 10));
        changeEmail.setFont(new Font("Dialog", Font.BOLD, 10));
        changePassword.setFont(new Font("Dialog", Font.BOLD, 10));
        deleteAccount.setFont(new Font("Dialog", Font.BOLD, 10));
        logOut.setFont(new Font("Dialog", Font.BOLD, 10));
        changeWeight.setFont(new Font("Dialog", Font.BOLD, 10));
        changeFat.setFont(new Font("Dialog", Font.BOLD, 10));
        goToGraphs.setFont(new Font("Dialog", Font.BOLD, 10));
        goToGoals.setFont(new Font("Dialog", Font.BOLD, 10));
        goToWorkouts.setFont(new Font("Dialog", Font.BOLD, 10));

        dashboard.add(changeUsername);
        dashboard.add(changeEmail);
        dashboard.add(changePassword);
        dashboard.add(changeWeight);
        dashboard.add(changeFat);
        dashboard.add(deleteAccount);
        dashboard.add(logOut);
        dashboard.add(horizontalLine);
        dashboard.add(goToGraphs);
        dashboard.add(goToGoals);
        dashboard.add(goToWorkouts);

        dashboard.setLayout(new GridLayout(0,1));

        settingsFrame.add(dashboard);
        settingsFrame.setVisible(true);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == changeUsername) {
                    settingsFrame.dispose();
                    UsernameView usernameViewer = new UsernameView();
                    usernameViewer.CreateUsernameView();
                }
                if (e.getSource() == changeEmail) {
                    settingsFrame.dispose();
                    EmailView emailViewer = new EmailView();
                    emailViewer.CreateEmailView();
                }
                if (e.getSource() == changePassword) {
                    settingsFrame.dispose();
                    PasswordView passwordViewer = new PasswordView();
                    passwordViewer.CreatePasswordView();
                }
                if (e.getSource() == deleteAccount) {
                    settingsFrame.dispose();
                    DeleteView deleteViewer = new DeleteView();
                    deleteViewer.CreateDeleteView();
                }
                if (e.getSource() == logOut) {
                    settingsFrame.dispose();
                    ViewLoginPage newLoginPage = new ViewLoginPage();
                    //newLoginPage.CreateLoginPage();
                }
                if (e.getSource() == changeWeight) {
                    settingsFrame.dispose();
                    WeightView weightViewer = new WeightView();
                    weightViewer.CreateWeightView();
                }
                if (e.getSource() == changeFat) {
                    settingsFrame.dispose();
                    FatView fatViewer = new FatView();
                    fatViewer.CreateFatView();
                }
                if (e.getSource() == goToGraphs){
                    settingsFrame.dispose();
                    //view from Tej goes here
                    GraphResponseFormatter presenter = new GraphResponseFormatter();
                    GraphInteractor interactor = new GraphInteractor(presenter);
                    GraphController controller = new GraphController(interactor);
                    GraphMenu graphMenu = new GraphMenu(controller, "abc");

                }
                if (e.getSource() == goToGoals){
                    settingsFrame.dispose();
                    //view from Jhalak goes here
                    HomeTargetUI homeFrame = new HomeTargetUI();
                }
                if (e.getSource() == goToWorkouts){
                    settingsFrame.dispose();
                    RoutineManagerView routineView = new RoutineManagerView();
                    //routineView.CreateRoutineView();
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
        goToGoals.addActionListener(action);
        goToGraphs.addActionListener(action);
        goToWorkouts.addActionListener(action);
    }
}
