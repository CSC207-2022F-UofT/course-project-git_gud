package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Represents the GUI for the Workout Menu, here you'll be able to view your workout routine, add or remove exercises to
 * your liking, view your workout history with that workout, and start the workout!
 */
public class WorkoutMenuView extends JFrame {

    /**
     * scrollPanel: represents the scroll pane in which you'll be able to view your exercises in your workout.
     * startButton: represents the Start Workout button, where you'll be able to start a workout.
     * addButton: represents the Add Exercise button in which you'll be able to choose from a list of exercises to add
     * to your workout routine.
     * removeButton: represents the Remove Exercise button in which you'll be able to choose which exercise from your
     * workout you want removed.
     * historyButton: represents the Workout History, where you can view your workout data.
     * backButton: will take you back to the Workout Selection Menu.
     */
    private final JPanel scrollPanel = new JPanel();
    private final JButton addButton = new JButton("Add Exercise");
    private final JButton removeButton = new JButton("Remove Exercise");
    private final JButton backButton = new JButton("Back");

    /**
     * Each workout has a workout number, which is set by WorkoutSelectionController after selecting a workout. The
     * number is set depending on which Workout is selected, e.g. Workout 1 = 1, Workout 2 = 2, etc. This helps the code
     * identify which workout we're currently on and will carry through each View code related to that workout, so if
     * we select "Add Exercise" the new window that pops up will also have the workout number set.
     */
    public int workoutNumber = 0;

    /**
     * Represents the view for the Workout Menu.
     */
    public WorkoutMenuView() {

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

        JButton startButton = new JButton("Start Workout");
        startButton.setFocusable(false);
        startButton.setSize(new Dimension(200,30));
        startButton.setLocation(52,120);
        startButton.setFont(new Font("Dialog", Font.BOLD, 13));

        addButton.setFocusable(false);
        addButton.setSize(new Dimension(200,30));
        addButton.setLocation(52,420);
        addButton.setFont(new Font("Dialog", Font.BOLD, 13));

        JButton historyButton = new JButton("Workout History");
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

    /**
     * This method adds all exercises currently stored in the workout routine to the scroll pane as JButtons and
     * displays them as a list of exercises for the user.
     * This method is called by WorkoutSelectionController when a Workout is selected in the Workout Selection Menu.
     * @param exercise a String representing the exercise name that would be displayed in the view.
     */
    public void addExercise(String exercise) {

        JButton newExercise = new JButton(exercise);
        newExercise.setFocusable(false);
        newExercise.setPreferredSize(new Dimension(190,20));
        newExercise.setFont(new Font("Dialog", Font.BOLD, 11));

        scrollPanel.add(newExercise);

    }

    /**
     * Returns the Workout Number related to the current workout selected, which is used for setting the workout number
     * in the next window.
     * @return an int representing the current workout number
     */
    public int getWorkoutNumber() {

        return workoutNumber;
    }

    /**
     * This method sets the workout number in WorkoutSelectionController for the workout that was selected.
     * @param i an int representing the number which the workout number will be set to.
     */
    public void setWorkoutNumber(int i) {

        workoutNumber = i;
    }
//  --------------- Add Action Listener Methods ------------------------------
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
