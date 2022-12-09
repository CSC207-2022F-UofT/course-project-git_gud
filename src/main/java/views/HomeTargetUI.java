package views;

import views.dashboard.SettingsPage;

import javax.swing.*;


/**
 *  Home UI class for targets that extends JFrame
 *  Running the main method displays 4 buttons corresponding to each of the usecases(add, edit, delete, view)
 *  Run the main function in this class to run this feature of the project
 * @author jhalaksaraogi
 */
public class HomeTargetUI extends JFrame {

    /**
     * Constructor for the HomeTargetUI class
     * sets size, title and visibility of the frame
     * adds the four required buttons to the panel of the frame
     */
    public HomeTargetUI(){
        this.setTitle("Home Target");
        this.setSize(710,500);
        JButton buttonAdd = new JButton("Add Target");
        buttonAdd.addActionListener(e -> AddTargetOptions.main());
        buttonAdd.setBounds(50,150,100, 50);
        JButton buttonView = new JButton("View Targets");
        buttonView.setBounds(170,150,150, 50);
        buttonView.addActionListener(e -> ViewTargetOptions.main());
        JButton buttonDelete = new JButton("Delete Target");
        buttonDelete.setBounds(340,150,150, 50);
        buttonDelete.addActionListener(e -> DeleteTargetOptions.main());
        JButton buttonEdit = new JButton("Edit Target");
        buttonEdit.addActionListener(e -> EditTargetOptions.main());
        buttonEdit.setBounds(510,150,100, 50);
        getContentPane().setLayout(null);
        JButton backButton = new JButton("Back");
        SettingsPage settings = new SettingsPage();
        backButton.addActionListener(e -> {settings.CreateSettingsPage(null);
        dispose();});
        backButton.setBounds(0,0,100, 50);
        this.add(backButton);
        this.getContentPane().add(buttonAdd);
        this.getContentPane().add(buttonView);
        this.getContentPane().add(buttonDelete);
        this.getContentPane().add(buttonEdit);
        this.setVisible(true);
    }

    /**
     * @param args
     * running this function creates new homeFrame and displays it
     */
    public static void main(String args[]){
        HomeTargetUI homeFrame = new HomeTargetUI();
        homeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
    }

    // SettingsPage name = new SettingsPage();
    // dispose.
}
