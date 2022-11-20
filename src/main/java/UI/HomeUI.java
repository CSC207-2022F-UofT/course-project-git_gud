package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.Button;

public class HomeUI extends JFrame {
    JButton buttonAdd;
    JButton buttonView;
    JButton buttonDelete;
    JButton buttonEdit;
    public HomeUI(){
        this.setTitle("Home Target");
        this.setSize(710,400);
        JButton buttonAdd = new JButton("Add Target");
        buttonAdd.addActionListener(e -> AddTargetOptions.main());
        buttonAdd.setBounds(50,150,100, 50);
        JButton buttonView = new JButton("View Targets");
        buttonView.setBounds(170,150,150, 50);
        JButton buttonDelete = new JButton("Delete Target");
        buttonDelete.setBounds(340,150,150, 50);
        buttonDelete.addActionListener(e -> DeleteTargetOptions.main());
        JButton buttonEdit = new JButton("Edit Target");
        buttonEdit.addActionListener(e -> EditTargetOptions.main());
        buttonEdit.setBounds(510,150,100, 50);
        getContentPane().setLayout(null);
        this.getContentPane().add(buttonAdd);
        this.getContentPane().add(buttonView);
        this.getContentPane().add(buttonDelete);
        this.getContentPane().add(buttonEdit);
        this.setVisible(true);

    }

    /**
     *
     * main function to display frame
     */
    public static void main(String args[]){
        HomeUI homeFrame = new HomeUI();
        homeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        homeFrame.setVisible(true);
    }
}
