package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Represents the GUI for the Add Exercise Menu, here the user will be able to select from a list of our catalogue
 * of exercises to add them to the current workout routine.
 */
public class AddExerciseMenu extends JFrame {
    /**
     * scrollPanel: represents the scroll pane in which our catalogue of exercises will be displayed to the user.
     */
    JPanel scrollPanel = new JPanel();

    /**
     * confirmationMessage: a message that tells the user they successfully added an exercise to their workout routine.
     * errorMessage: a message that tells the user that they already added the specific exercise to their routine.
     */
    JLabel confirmationMessage = new JLabel();
    JLabel errorMessage = new JLabel();

    /**
     * backButton: takes you back to the Workout Menu
     * All other buttons are temporary, these exercises will be pulled from our catalogue.
     */
    JButton backButton = new JButton("Back");
    JButton tricepDips = new JButton("Tricep Dips");
    JButton bicepCurls = new JButton("Bicep Curls");
    JButton militaryPress = new JButton("Military Press");

    /**
     * exercises: an Array representing all exercises to be displayed on the scroll panel.
     */
    JButton[] exercises = {tricepDips, bicepCurls, militaryPress};

    /**
     * workoutNumber: an int representing the workout identifier for the specific workout we are currently customizing.
     */
    public int workoutNumber = 0;

    /**
     * This represents the view for the Add Exercise Menu.
     */
    public AddExerciseMenu() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Add Exercise Menu");

        JLabel message = new JLabel("Select an exercise to add to this workout routine.");
        message.setBounds(25,410,320,20);
        message.setFont(new Font("Dialog", Font.BOLD, 10));
        message.setVisible(true);

        // TEMPORARY until certain features are implemented.
        String labelText = "<html>Once the Exercise class is fully implemented, you'll be<BR>able to choose from a much " +
                "bigger list of exercises.</html>";

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

        tricepDips.setFocusable(false);
        tricepDips.setPreferredSize(new Dimension(190,20));
        tricepDips.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(tricepDips);

        bicepCurls.setFocusable(false);
        bicepCurls.setPreferredSize(new Dimension(190,20));
        bicepCurls.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(bicepCurls);

        militaryPress.setFocusable(false);
        militaryPress.setPreferredSize(new Dimension(190,20));
        militaryPress.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(militaryPress);

        this.add(backButton);

        this.add(message);
        this.add(message2);
        this.add(confirmationMessage);
        this.add(errorMessage);

        this.add(displayPanel);
        this.setVisible(true);
    }

    /**
     * This method serves to get our Array of exercises which will be used by AddExerciseController to identify which
     * exercise to be added.
     * @return an Array representing all exercises to be added to our routine.
     */
    public JButton[] getExercises() {

        return exercises;
    }

    /**
     * Sets the confirmation message with a specific exercise to let the user know which exercise was added.
     * @param exercise a String representing the exercise that was added.
     */
    public void setConfirmationMessage(String exercise) {

        confirmationMessage.setText("You added "+ exercise + " to your routine.");
    }

    /**
     * Sets the error message with a specific exercise to let the user know that that exercise was already added.
     * @param exercise a String representing the exercise that was already added.
     */
    public void setErrorMessage(String exercise) {

        errorMessage.setText("You already added " + exercise + "!");
    }

    public JLabel getConfirmationMessage() {

        return confirmationMessage;
    }

    public JLabel getErrorMessage() {

        return errorMessage;
    }

    public void setWorkoutNumber(int i) {

        workoutNumber = i;
    }

    public int getWorkoutNumber() {

        return workoutNumber;
    }

    public void addAddAction(ActionListener actionListener){

        for (JButton exercise : exercises){

            exercise.addActionListener(actionListener);
        }
    }

    public void addBackAction(ActionListener displayListener){

        backButton.addActionListener(displayListener);
    }
}
