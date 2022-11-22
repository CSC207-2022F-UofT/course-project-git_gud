package RoutineManagerView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddExerciseMenu extends JFrame {

    JPanel scrollPanel = new JPanel();
    JLabel confirmationMessage = new JLabel();
    JLabel errorMessage = new JLabel();
    JButton backButton = new JButton("Back");
    JButton tricepDips = new JButton("Tricep Dips");
    JButton bicepCurls = new JButton("Bicep Curls");
    JButton militaryPress = new JButton("Military Press");

    JButton[] exercises = {tricepDips, bicepCurls, militaryPress};

    public int workoutNumber = 0;

    public AddExerciseMenu() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(320, 564);
        this.setLayout(null);
        this.setTitle("Workout Menu");

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

    public JButton[] getExercises() {

        return exercises;
    }

    public void setConfirmationMessage(String exercise) {

        confirmationMessage.setText("You added "+ exercise + " to your routine.");
    }

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
