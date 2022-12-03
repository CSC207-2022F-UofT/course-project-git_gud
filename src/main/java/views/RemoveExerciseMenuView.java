package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Represents the GUI for the Remove Exercise Menu, here the user will be able to remove an exercise from one of their
 * workouts.
 * @author turne142
 */
public class RemoveExerciseMenuView extends JFrame {

    /**
     * scrollPanel: represents the scroll pane that displays all the chosen workout's exercises in a list.
     */
    JPanel scrollPanel = new JPanel();

    /**
     * confirmationMessage: represents the message meant to show the user that they successfully removed an exercise
     * from their Workout.
     * errorMessage: represents the message that pops up when a user tries to remove an exercise that has already
     * been removed.
     */
    JLabel confirmationMessage = new JLabel();
    JLabel errorMessage = new JLabel();

    /**
     * backButton: a button that takes you back to the Workout Menu.
     */
    JButton backButton = new JButton("Back");

    /**
     * workoutNumber: a number assigned once the GUI is displayed, used for identifying the current workout selected.
     */
    int workoutNumber = 0;

    /**
     * exercises: represents an ArrayList of JButton's where each button is an exercise in the current workout, which
     * is then displayed in the scrollPanel.
     */
    ArrayList<JButton> exercises = new ArrayList<>();

    /**
     * This represents the view for the Remove Exercise Menu that the user interacts with.
     */
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

    /**
     * A method which adds JButton's to the scrollPanel, this is used by the WorkoutMenuController to display the
     * exercises of the chosen workout on the scrollPanel.
     * @param exercise represents the text which the JButton will be set to.
     */
    public void addExercise(String exercise) {

        JButton newExercise = new JButton(exercise);
        newExercise.setFocusable(false);
        newExercise.setPreferredSize(new Dimension(190,20));
        newExercise.setFont(new Font("Dialog", Font.BOLD, 11));

        exercises.add(newExercise);
        scrollPanel.add(newExercise);

    }

    /**
     * RemoveExerciseController uses this method to loop over it and identifying which button was pressed.
     * @return an ArrayList representing the list of exercises displayed on scrollPanel.
     */
    public ArrayList<JButton> getExercises(){

        return exercises;
    }

    /**
     * Sets the Workout Number of the current workout selected by the WorkoutMenuController.
     * @param i an int representing the number workoutNumber will be set to.
     */
    public void setWorkoutNumber(int i){

        workoutNumber = i;
    }

    /**
     * Sets the text of confirmationMessage to a message confirming that the user removed the specific exercise they
     * selected.
     * @param exercise a String representing the exercise that was selected by the user.
     */
    public void setConfirmationMessage(String exercise) {

        confirmationMessage.setText("You removed " + exercise + " from your routine.");
    }

    /**
     * Sets the text of errorMessage to a message saying that the user already selected that specific exercise.
     * @param exercise a String representing the exercise that was already removed.
     */
    public void setErrorMessage(String exercise) {

        errorMessage.setText("You already removed " + exercise + "!");
    }

    /**
     * Returns the Workout Number of the current workout selected.
     * @return an int representing the number that this workout was set to when selected.
     */
    public int getWorkoutNumber(){

        return workoutNumber;
    }

    /**
     * Gives the confirmation message that displays to the user that they successfully added the exercise.
     * @return a JLabel that's supposed to display.
     */
    public JLabel getConfirmationMessage() {

        return confirmationMessage;
    }

    /**
     * Gives the error message that displays to the user that they already removed the exercise selected.
     * @return a JLabel that's supposed to display.
     */
    public JLabel getErrorMessage() {

        return errorMessage;
    }

    // ----------- Add Action Listener Methods ----------------------------
    public void addRemoveExerciseListener(ActionListener removeListener) {

        for (JButton exercise : exercises) {

            exercise.addActionListener(removeListener);
        }
    }

    public void addBackListener(ActionListener backListener){

        backButton.addActionListener(backListener);
    }

}
