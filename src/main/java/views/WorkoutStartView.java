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


    ArrayList<String> workout;

    public String exerciseName = "";
    public ArrayList<String> exerciseList;
    public int workoutNumber = 1;
    public int exerciseNumber = 0;

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

        initialize();

    }


    public void initialize(){
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Display the window.
        setVisible(true);



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

        // Titles
        panel.add(exercise);
        panel.add(weight);
        panel.add(reps);

        //First set
        panel.add(one);
        panel.add(weight1);
        panel.add(reps1);

        //Second Set
        panel.add(two);
        panel.add(weight2);
        panel.add(reps2);

        //Third Set
        panel.add(three);
        panel.add(weight3);
        panel.add(reps3);

        //Fourth Set
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

    /**
     * Action Listener Method
     * @param displayListener
     */
    public void nextExerciseDisplay(ActionListener displayListener) {
        next.addActionListener(displayListener);
    }

    /**
     * This method adds exercises to the exerciseList from the particular workout.
     * @param exercise a String representing the exercise from the workout.
     */
    public void addExercises(String exercise){
        exerciseList.add(exercise);
    }

    /**
     * This method updates the workout number based on which workout has been opened.
     * @param i the woekout number that has been sent by the controller.
     */
    public void setWorkoutNumber(int i){

        this.workoutNumber = i;
    }

    /**
     * This method gets the workout number from the controller
     * @return
     */
    public int getWorkoutNumber() {

        return this.workoutNumber;
    }

    /**
     * This method sets the exercise number to figure out which exercise in the workout we are on.
     * @param i the updated exercise number.
     */
    public void setExerciseNumber(int i){

        this.exerciseNumber = i;
    }

    /**
     * This method gets the exercise number.
     * @return
     */
    public int getExerciseNumber(){

        return this.exerciseNumber;
    }

    /**
     * This method sets the current exercise name as the name of the exercise button in the view.
     * @param name The exercise name.
     */
    public void setExerciseName(String name){

        this.exercise.setText(name);
    }

    /**
     * This exercise gets the exercise name of the current exercise.
     * @return
     */
    public String getExerciseName(){

        return this.exercise.getText();
    }

    /**
     * This method returns the arraylist of the weights lifted for each exercise in any particular workout.
     * @return
     */
    public ArrayList<String> getWeights(){
        return weights;
    }

    /**
     * This method returns the arraylist of the number of reps done for each exercise in any particular workout.
     * @return
     */
    public ArrayList<String> getReps(){
        return repsNumber;
    }

}
