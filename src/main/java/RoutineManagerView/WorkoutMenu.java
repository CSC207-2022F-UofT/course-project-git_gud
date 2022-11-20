package RoutineManagerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenu extends JFrame {

    private JPanel scrollPanel = new JPanel();
    private JButton startButton = new JButton("Start Workout");
    private JButton addButton = new JButton("Add Exercise");
    private JButton removeButton = new JButton("Remove Exercise");
    private JButton historyButton = new JButton("Workout History");
    public JButton backButton = new JButton("Back");

    public WorkoutMenu() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Workout Menu");

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

    public void addWorkoutSelectionDisplay(ActionListener displayListener){

        backButton.addActionListener(displayListener);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==backButton) {
//            this.dispose();
//            WorkoutSelection workoutSelection = new WorkoutSelection();
//        }
//    }
}
