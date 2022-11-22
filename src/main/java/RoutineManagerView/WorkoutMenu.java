package RoutineManagerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the GUI for the menu
 */
public class WorkoutMenu extends JFrame {

    private JPanel scrollPanel = new JPanel();
    private JButton startButton = new JButton("Start Workout");
    private JButton addButton = new JButton("Add Exercise");
    private JButton removeButton = new JButton("Remove Exercise");
    private JButton historyButton = new JButton("Workout History");
    private JButton backButton = new JButton("Back");

    public int workoutNumber = 0;

    public WorkoutMenu() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Workout Menu");

        // TEMPORARY until certain features are implemented
        JLabel message1 = new JLabel("The Start Workout, Workout History, and all the exercise");
        message1.setBounds(0,40,300,100);
        message1.setFont(new Font("Dialog", Font.BOLD, 10));
        message1.setForeground(Color.RED);
        message1.setVisible(true);

        // TEMPORARY until certain features are implemented
        JLabel message2 = new JLabel("buttons from THIS menu don't do anything yet as they ");
        message2.setBounds(0,50,300,100);
        message2.setFont(new Font("Dialog", Font.BOLD, 10));
        message2.setForeground(Color.RED);
        message2.setVisible(true);

        // TEMPORARY until certain features are implemented
        JLabel message3 = new JLabel("depend on other features that need to be implemented first.");
        message3.setBounds(0,60,300,100);
        message3.setFont(new Font("Dialog", Font.BOLD, 10));
        message3.setForeground(Color.RED);
        message3.setVisible(true);


        JPanel displayPanel = new JPanel();
        displayPanel.setLocation(0, 250);
        displayPanel.setBounds(22, 157, 260, 250);
        displayPanel.setBackground(Color.lightGray);
        displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        scrollPanel.setPreferredSize(new Dimension(220, 1000));
        scrollPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane scrollPane = new JScrollPane(scrollPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(230, 240));
        displayPanel.add(scrollPane);

        startButton.setFocusable(false);
        startButton.setSize(new Dimension(200,30));
        startButton.setLocation(52,120);
        startButton.setFont(new Font("Dialog", Font.BOLD, 13));

        addButton.setFocusable(false);
        addButton.setSize(new Dimension(200,30));
        addButton.setLocation(52,420);
        addButton.setFont(new Font("Dialog", Font.BOLD, 13));

        historyButton.setFocusable(false);
        historyButton.setSize(new Dimension(200,30));
        historyButton.setLocation(52,480);
        historyButton.setFont(new Font("Dialog", Font.BOLD, 13));

        removeButton.setFocusable(false);
        removeButton.setSize(new Dimension(200,30));
        removeButton.setLocation(52,450);
        removeButton.setFont(new Font("Dialog", Font.BOLD, 13));

        backButton.setBounds(0,0,100,50);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 15));

        this.add(message1);
        this.add(message2);
        this.add(message3);

        this.add(startButton);
        this.add(addButton);
        this.add(historyButton);
        this.add(removeButton);
        this.add(backButton);

        this.add(displayPanel);
        this.setVisible(true);
    }

    public void addExercise(String exercise) {

        JButton newExercise = new JButton(exercise);
        newExercise.setFocusable(false);
        newExercise.setPreferredSize(new Dimension(190,20));
        newExercise.setFont(new Font("Dialog", Font.BOLD, 11));

        scrollPanel.add(newExercise);

    }

    public int getWorkoutNumber() {

        return workoutNumber;
    }

    public void setWorkoutNumber(int i) {

        workoutNumber = i;
    }

    public void addWorkoutSelectionDisplay(ActionListener displayListener){

        backButton.addActionListener(displayListener);
    }

    public void addAddExerciseDisplay(ActionListener displayListener){

        addButton.addActionListener(displayListener);
    }

    public void addRemoveExerciseDisplay(ActionListener displayListener){

        removeButton.addActionListener(displayListener);
    }

}
