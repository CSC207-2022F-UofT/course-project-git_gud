package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Represents the GUI for the Add Exercise Menu, here the user will be able to select from a list of our catalogue
 * of exercises to add them to the current workout routine.
 * @author turne142
 */
public class AddExerciseMenuView extends JFrame {
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
     * All other buttons represent the list of exercises that can be added to your routine.
     */
    JButton backButton = new JButton("Back");
    JButton benchPress = new JButton("Bench Press");
    JButton pushUps = new JButton("Push Ups");
    JButton tricepsDips = new JButton("Triceps Dips");
    JButton handStandPushUps = new JButton("Hand Stand Push Ups");
    JButton militaryPress = new JButton("Military Press");
    JButton pullUps = new JButton("Pull Ups");
    JButton barbellRow = new JButton("Barbell Row");
    JButton bicepCurls = new JButton("Bicep Curls");
    JButton sideLateralRaise = new JButton("Side Lateral Raise");
    JButton deadLift = new JButton("Dead Lift");
    JButton squats = new JButton("Squats");
    JButton legRaises = new JButton("Leg Raises");
    JButton crunches = new JButton("Crunches");

    /**
     * exercises: an Array representing all exercises to be displayed on the scroll panel.
     */
    JButton[] exercises = {tricepsDips, bicepCurls, militaryPress, benchPress, pushUps, handStandPushUps, pullUps,
            barbellRow, sideLateralRaise, deadLift, squats, legRaises, crunches};

    /**
     * workoutNumber: an int representing the workout identifier for the specific workout we are currently customizing.
     */
    public int workoutNumber = 0;

    /**
     * This represents the view for the Add Exercise Menu.
     */
    public AddExerciseMenuView() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Add Exercise Menu");

        JLabel message = new JLabel("Select an exercise to add to this workout routine.");
        message.setBounds(25,410,320,20);
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

        confirmationMessage.setBounds(0, 430,320,50);
        confirmationMessage.setFont(new Font("Dialog", Font.BOLD, 12));

        errorMessage.setBounds(0,430,320,50);
        errorMessage.setFont(new Font("Dialog", Font.BOLD, 12));


        backButton.setBounds(0,0,100,50);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 15));

        tricepsDips.setFocusable(false);
        tricepsDips.setPreferredSize(new Dimension(190,20));
        tricepsDips.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(tricepsDips);

        bicepCurls.setFocusable(false);
        bicepCurls.setPreferredSize(new Dimension(190,20));
        bicepCurls.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(bicepCurls);

        militaryPress.setFocusable(false);
        militaryPress.setPreferredSize(new Dimension(190,20));
        militaryPress.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(militaryPress);

        benchPress.setFocusable(false);
        benchPress.setPreferredSize(new Dimension(190,20));
        benchPress.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(benchPress);

        pushUps.setFocusable(false);
        pushUps.setPreferredSize(new Dimension(190,20));
        pushUps.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(pushUps);

        handStandPushUps.setFocusable(false);
        handStandPushUps.setPreferredSize(new Dimension(190,20));
        handStandPushUps.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(handStandPushUps);

        pullUps.setFocusable(false);
        pullUps.setPreferredSize(new Dimension(190,20));
        pullUps.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(pullUps);

        barbellRow.setFocusable(false);
        barbellRow.setPreferredSize(new Dimension(190,20));
        barbellRow.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(barbellRow);

        sideLateralRaise.setFocusable(false);
        sideLateralRaise.setPreferredSize(new Dimension(190,20));
        sideLateralRaise.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(sideLateralRaise);

        deadLift.setFocusable(false);
        deadLift.setPreferredSize(new Dimension(190,20));
        deadLift.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(deadLift);

        squats.setFocusable(false);
        squats.setPreferredSize(new Dimension(190,20));
        squats.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(squats);

        legRaises.setFocusable(false);
        legRaises.setPreferredSize(new Dimension(190,20));
        legRaises.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(legRaises);

        crunches.setFocusable(false);
        crunches.setPreferredSize(new Dimension(190,20));
        crunches.setFont(new Font("Dialog", Font.BOLD, 11));
        scrollPanel.add(crunches);

        this.add(backButton);

        this.add(message);
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

    /**
     * This method is used to display the confirmation message to the user.
     * @return a String representing the message to be displayed.
     */
    public JLabel getConfirmationMessage() {

        return confirmationMessage;
    }

    /**
     * This method is used to display the error message to the user.
     * @return a String representing the message to be displayed
     */
    public JLabel getErrorMessage() {

        return errorMessage;
    }

    /**
     * This will set the Workout Number to the Workout we are currently editing.
     * @param i an int representing the current workout number.
     */
    public void setWorkoutNumber(int i) {

        workoutNumber = i;
    }

    /**
     * This will return the Workout Number of the current Workout we are on, which is useful for identifying which
     * Workout we'll be modifying.
     * @return an int representing this Workout's id number.
     */
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
