package RoutineManagerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveExerciseMenu extends JFrame {

    private JPanel scrollPanel = new JPanel();

    public JButton backButton = new JButton("Back");

    public int workoutNumber = 0;

    public ArrayList<JButton> exercises = new ArrayList<>();

    public RemoveExerciseMenu(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Remove Exercise");

        JLabel message = new JLabel("Select an exercise to remove from this workout routine.");
        message.setBounds(10,410,320,20);
        message.setFont(new Font("Dialog", Font.BOLD, 10));
        message.setVisible(true);

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

        backButton.setBounds(0,0,100,50);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 15));

        this.add(backButton);
        this.add(message);
        this.add(displayPanel);
        this.setVisible(true);
    }

    public void addExercise(String exercise) {

        JButton newExercise = new JButton(exercise);
        newExercise.setFocusable(false);
        newExercise.setPreferredSize(new Dimension(190,20));
        newExercise.setFont(new Font("Dialog", Font.BOLD, 11));

        exercises.add(newExercise);
        scrollPanel.add(newExercise);

    }

    public ArrayList<JButton> getExercises(){

        return exercises;
    }

    public void setWorkoutNumber(int i){

        workoutNumber = i;
    }

    public int getWorkoutNumber(){

        return workoutNumber;
    }

    public void addRemoveExerciseListener(ActionListener removeListener) {

        for (JButton exercise : exercises) {

            exercise.addActionListener(removeListener);
        }
    }

    public void addBackListener(ActionListener backListener){

        backButton.addActionListener(backListener);
    }

}
