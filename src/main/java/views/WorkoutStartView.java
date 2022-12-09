package views;

import controllers.WorkoutStartController;
import management.Workout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class WorkoutStartView extends JFrame{

    private WorkoutStartViewPanel basePanel;
    ArrayList<String> workout;

    public String exerciseName = "";
    public ArrayList<String> exerciseList;
    public int workoutNumber = 0;
    public int exerciseNumber = 1;

    public ArrayList<String> weights = new ArrayList<String>();
    public ArrayList<String> repsNumber = new ArrayList<String>();

    private JPanel panel = new JPanel();

    private final JButton weight = new JButton("Weight");
    private final JButton reps = new JButton("Reps");
    private final JButton one = new JButton("1");
    private JTextField weight1 = new JTextField();
    private JTextField reps1 = new JTextField();
    private final JButton two = new JButton("2");
    private JTextField weight2 = new JTextField();
    private JTextField reps2 = new JTextField();
    private final JButton three = new JButton("3");
    private JTextField weight3 = new JTextField();
    private JTextField reps3 = new JTextField();
    private JButton ghost = new JButton();
    private JButton next = new JButton("Next");
    private JButton exercise = new JButton("");

    public ArrayList<String> GetWeight() {
        return weights;
    }

    public ArrayList<String> GetRep() {
        return repsNumber;
    }


    public WorkoutStartView() {
        this.workout = new ArrayList<>();
        this.workout.add("Triceps Dips");
        this.workout.add("Bicep Curls"); // THESE ARE TEMPORARY UNTIL THE EXERCISE FEATURE IS IMPLEMENTED, FOR TESTING PURPOSES
        initialize();

    }


    public void initialize(){
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Display the window.
        setVisible(true);

        this.workout = new ArrayList<>();
        this.workout.add("Triceps Dips");
        this.workout.add("Bicep Curls"); // THESE ARE TEMPORARY UNTIL THE EXERCISE FEATURE IS IMPLEMENTED, FOR TESTING PURPOSES

//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setLayout(new GridLayout(5, 3, 3, 5));
        add(panel);
        panel.setBackground(Color.GRAY);
        exercise.setEnabled(true);



        weight.setEnabled(false);
        reps.setEnabled(false);


        one.setEnabled(false);

        two.setEnabled(false);

        three.setEnabled(false);


        ghost.setEnabled(false);
        ghost.setVisible(false);


        panel.add(exercise);
        panel.add(weight);
        panel.add(reps);

        panel.add(one);
        panel.add(weight1);
        panel.add(reps1);

        panel.add(two);
        panel.add(weight2);
        panel.add(reps2);

        panel.add(three);
        panel.add(weight3);
        panel.add(reps3);

        panel.add(ghost);
        panel.add(ghost);
        panel.add(next);


        weight1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weights.add(weight1.getText());
            }
        });
        reps1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repsNumber.add(reps1.getText());
            }
        });

        weight2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weights.add(weight2.getText());
            }
        });
        reps2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repsNumber.add(reps2.getText());
            }
        });

        weight3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weights.add(weight3.getText());
            }
        });
        reps3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repsNumber.add(reps3.getText());
            }
        });





    }

    public void nextExerciseDisplay(ActionListener displayListener) {
        next.addActionListener(displayListener);
    }

    public void addExercises(String exercise){
        exerciseList.add(exercise);
    }

    public void setWorkoutNumber(int i){

        this.workoutNumber = i;
    }

    public int getWorkoutNumber() {

        return this.workoutNumber;
    }

    public void setExerciseNumber(int i){

        this.exerciseNumber = i;
    }

    public int getExerciseNumber(){

        return this.exerciseNumber;
    }

    public void setExerciseName(String name){

        this.exercise.setText(name);
    }

    public String getExerciseName(){

        return this.exercise.getText();
    }

}
