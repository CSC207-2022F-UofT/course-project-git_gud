package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Represents the GUI for selecting between five workout routines stored in RoutineManager with the purpose of
 * customizing and/or starting a workout.
 * @author turne142
 */
public class WorkoutSelectionView extends JFrame{

    /**
     * Each one of these JButtons represents one of the five workout routines that the user can select. Clicking on one
     * will take you to the Workout Menu where you'll be able to start, add/remove exercises, or view the workout
     * history.
     */
    public JButton workout1Button = new JButton("Workout 1");
    public JButton workout2Button = new JButton("Workout 2");
    public JButton workout3Button = new JButton("Workout 3");
    public JButton workout4Button = new JButton("Workout 4");
    public JButton workout5Button = new JButton("Workout 5");

    public JButton backButton = new JButton("Back");

    /**
     * Represents the view for the Workout Selection window.
     */
    public WorkoutSelectionView() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Workout Selection");

        JPanel workoutsPanel = new JPanel();
        workoutsPanel.setLocation(0, 250);
        workoutsPanel.setBounds(50, 144, 200, 275);
        workoutsPanel.setBackground(Color.lightGray);
        workoutsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        workout1Button.setFocusable(false);
        workout2Button.setFocusable(false);
        workout3Button.setFocusable(false);
        workout4Button.setFocusable(false);
        workout5Button.setFocusable(false);
        workout1Button.setFont(new Font("Dialog", Font.BOLD, 30));
        workout2Button.setFont(new Font("Dialog", Font.BOLD, 30));
        workout3Button.setFont(new Font("Dialog", Font.BOLD, 30));
        workout4Button.setFont(new Font("Dialog", Font.BOLD, 30));
        workout5Button.setFont(new Font("Dialog", Font.BOLD, 30));

        backButton.setBounds(0,0,100,50);
        backButton.setFocusable(false);
        backButton.setFont(new Font("Dialog", Font.BOLD, 15));

        workoutsPanel.add(workout1Button);
        workoutsPanel.add(workout2Button);
        workoutsPanel.add(workout3Button);
        workoutsPanel.add(workout4Button);
        workoutsPanel.add(workout5Button);

        this.add(workoutsPanel);
        this.add(backButton);
        this.setVisible(true);
    }

    // Add Action Listener Method
    public void addWorkoutMenuDisplay(ActionListener displayListener){

        workout1Button.addActionListener(displayListener);
        workout2Button.addActionListener(displayListener);
        workout3Button.addActionListener(displayListener);
        workout4Button.addActionListener(displayListener);
        workout5Button.addActionListener(displayListener);
    }

    public void addSettingsDisplay(ActionListener displayListener){

        backButton.addActionListener(displayListener);
    }
}
