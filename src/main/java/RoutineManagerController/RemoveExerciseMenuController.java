package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.RemoveExerciseMenu;
import RoutineManagerView.WorkoutMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveExerciseMenuController {

    RoutineManager theModel;

    RemoveExerciseMenu theView;

    public RemoveExerciseMenuController(RoutineManager theModel, RemoveExerciseMenu theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addRemoveExerciseListener(new RemoveExerciseAction());
        this.theView.addBackListener(new BackAction());
    }

    class RemoveExerciseAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            for (JButton exercise : theView.getExercises()){
                if (e.getSource()==exercise){

                    if (theView.getWorkoutNumber()==1){
                        theModel.getWorkouts()[0].removeExercise(exercise.getText());

                        theView.dispose();

                        WorkoutMenu workoutMenu = new WorkoutMenu();
                        workoutMenu.setWorkoutNumber(1);

                        WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                        if (!theModel.getWorkouts()[0].getWorkout().isEmpty()) {
                            for (int i = 0; i < theModel.getWorkouts()[0].getWorkout().size(); i++) {
                                workoutMenu.addExercise(theModel.getWorkouts()[0].getWorkout().get(i));
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==2){
                        theModel.getWorkouts()[1].removeExercise(exercise.getText());

                        theView.dispose();

                        WorkoutMenu workoutMenu = new WorkoutMenu();
                        workoutMenu.setWorkoutNumber(2);

                        WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                        if (!theModel.getWorkouts()[1].getWorkout().isEmpty()) {
                            for (int i = 0; i < theModel.getWorkouts()[1].getWorkout().size(); i++) {
                                workoutMenu.addExercise(theModel.getWorkouts()[1].getWorkout().get(i));
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==3){
                        theModel.getWorkouts()[2].removeExercise(exercise.getText());

                        theView.dispose();

                        WorkoutMenu workoutMenu = new WorkoutMenu();
                        workoutMenu.setWorkoutNumber(3);

                        WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                        if (!theModel.getWorkouts()[2].getWorkout().isEmpty()) {
                            for (int i = 0; i < theModel.getWorkouts()[2].getWorkout().size(); i++) {
                                workoutMenu.addExercise(theModel.getWorkouts()[2].getWorkout().get(i));
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==4){
                        theModel.getWorkouts()[3].removeExercise(exercise.getText());

                        theView.dispose();

                        WorkoutMenu workoutMenu = new WorkoutMenu();
                        workoutMenu.setWorkoutNumber(4);

                        WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                        if (!theModel.getWorkouts()[3].getWorkout().isEmpty()) {
                            for (int i = 0; i < theModel.getWorkouts()[3].getWorkout().size(); i++) {
                                workoutMenu.addExercise(theModel.getWorkouts()[3].getWorkout().get(i));
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==5){
                        theModel.getWorkouts()[4].removeExercise(exercise.getText());

                        theView.dispose();

                        WorkoutMenu workoutMenu = new WorkoutMenu();
                        workoutMenu.setWorkoutNumber(5);

                        WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                        if (!theModel.getWorkouts()[4].getWorkout().isEmpty()) {
                            for (int i = 0; i < theModel.getWorkouts()[4].getWorkout().size(); i++) {
                                workoutMenu.addExercise(theModel.getWorkouts()[4].getWorkout().get(i));
                            }
                        }
                    }
                }
            }
        }

    }

    class BackAction implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();

                WorkoutMenu workoutMenu = new WorkoutMenu();
                workoutMenu.setWorkoutNumber(1);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                if (!theModel.getWorkouts()[0].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[0].getWorkout().size(); i++) {
                        workoutMenu.addExercise(theModel.getWorkouts()[0].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();

                WorkoutMenu workoutMenu = new WorkoutMenu();
                workoutMenu.setWorkoutNumber(2);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                if (!theModel.getWorkouts()[1].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[1].getWorkout().size(); i++) {
                        workoutMenu.addExercise(theModel.getWorkouts()[1].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();

                WorkoutMenu workoutMenu = new WorkoutMenu();
                workoutMenu.setWorkoutNumber(3);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                if (!theModel.getWorkouts()[2].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[2].getWorkout().size(); i++) {
                        workoutMenu.addExercise(theModel.getWorkouts()[2].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();

                WorkoutMenu workoutMenu = new WorkoutMenu();
                workoutMenu.setWorkoutNumber(4);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                if (!theModel.getWorkouts()[3].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[3].getWorkout().size(); i++) {
                        workoutMenu.addExercise(theModel.getWorkouts()[3].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();

                WorkoutMenu workoutMenu = new WorkoutMenu();
                workoutMenu.setWorkoutNumber(5);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenu);

                if (!theModel.getWorkouts()[4].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[4].getWorkout().size(); i++) {
                        workoutMenu.addExercise(theModel.getWorkouts()[4].getWorkout().get(i));
                    }
                }
            }
        }
    }

}
