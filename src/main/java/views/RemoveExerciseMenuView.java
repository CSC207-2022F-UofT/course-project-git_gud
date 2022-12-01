package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RemoveExerciseMenuView extends JFrame {

    JPanel scrollPanel = new JPanel();
    JLabel confirmationMessage = new JLabel();
    JLabel errorMessage = new JLabel();
    JButton backButton = new JButton("Back");

    int workoutNumber = 0;

    ArrayList<JButton> exercises = new ArrayList<>();

    public RemoveExerciseMenuView(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Remove Exercise");

        JLabel message = new JLabel("Select an exercise to remove from this workout routine.");
        message.setBounds(10,410,320,20);
        message.setFont(new Font("Dialog", Font.BOLD, 10));
        message.setVisible(true);

        // TEMPORARY until certain features are implemented.
        String labelText = "<html>These exercises on the list were added manually for testing<BR>purposes, once the " +
                "Exercise class is implemented, you'll be able to use the add exercise function to add these from scratch.</html>";

        JLabel message2 = new JLabel(labelText);
        message2.setBounds(0,80,320,50);
        message2.setFont(new Font("Dialog", Font.BOLD, 10));
        message2.setForeground(Color.RED);
        message2.setVisible(true);


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

        confirmationMessage.setBounds(0, 430,320,50);
        confirmationMessage.setFont(new Font("Dialog", Font.BOLD, 12));

        errorMessage.setBounds(0,430,320,50);
        errorMessage.setFont(new Font("Dialog", Font.BOLD, 12));

        backButton.setBounds(0,0,100,50);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 15));

        this.add(backButton);

        this.add(message);
        this.add(message2);
        this.add(errorMessage);
        this.add(confirmationMessage);

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

    public void setConfirmationMessage(String exercise) {

        confirmationMessage.setText("You removed " + exercise + " from your routine.");
    }

    public void setErrorMessage(String exercise) {

        errorMessage.setText("You already removed " + exercise + "!");
    }

    public int getWorkoutNumber(){

        return workoutNumber;
    }

    public JLabel getConfirmationMessage() {

        return confirmationMessage;
    }

    public JLabel getErrorMessage() {

        return errorMessage;
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
