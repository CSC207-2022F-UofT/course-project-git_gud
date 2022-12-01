package controllers;

import management.RoutineManager;
import views.AddExerciseMenuView;
import views.WorkoutMenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddExerciseController {

    RoutineManager theModel;
    AddExerciseMenuView theView;

    public AddExerciseController(RoutineManager theModel, AddExerciseMenuView theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addAddAction(new AddAction());
        this.theView.addBackAction(new BackActionAddExercise());
    }

    class BackActionAddExercise implements ActionListener, ReturnToMenuAdd{

        @Override
        public void actionPerformed(ActionEvent e) {

            returnToMenu(theModel, theView);

        }

        @Override
        public void returnToMenu(RoutineManager theModel, AddExerciseMenuView theView) {

            if (theView.getWorkoutNumber()==1){
                theView.dispose();

                WorkoutMenuView workoutMenuView = new WorkoutMenuView();
                workoutMenuView.setWorkoutNumber(1);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[0].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[0].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[0].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==2){
                theView.dispose();

                WorkoutMenuView workoutMenuView = new WorkoutMenuView();
                workoutMenuView.setWorkoutNumber(2);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[1].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[1].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[1].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==3){
                theView.dispose();

                WorkoutMenuView workoutMenuView = new WorkoutMenuView();
                workoutMenuView.setWorkoutNumber(3);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[2].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[2].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[2].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==4){
                theView.dispose();

                WorkoutMenuView workoutMenuView = new WorkoutMenuView();
                workoutMenuView.setWorkoutNumber(4);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[3].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[3].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[3].getWorkout().get(i));
                    }
                }
            }
            if (theView.getWorkoutNumber()==5){
                theView.dispose();

                WorkoutMenuView workoutMenuView = new WorkoutMenuView();
                workoutMenuView.setWorkoutNumber(5);

                WorkoutMenuController workoutMenuController = new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[4].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[4].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[4].getWorkout().get(i));
                    }
                }
            }
        }
    }

    class AddAction implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {

            for (JButton exercise : theView.getExercises()){
                if (e.getSource()==exercise){

                    if (theView.getWorkoutNumber()==1){
                        if (theModel.getWorkouts()[0].getWorkout().contains(exercise.getText())){

                            theView.setErrorMessage(exercise.getText());
                            theView.getConfirmationMessage().setText(null);
                            theView.add(theView.getErrorMessage());
                        }
                        else {
                            theModel.getWorkouts()[0].addExercise(exercise.getText());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                    }
                    if (theView.getWorkoutNumber()==2){
                        if (theModel.getWorkouts()[1].getWorkout().contains(exercise.getText())){

                            theView.setErrorMessage(exercise.getText());
                            theView.getConfirmationMessage().setText(null);
                            theView.add(theView.getErrorMessage());
                        }
                        else {
                            theModel.getWorkouts()[1].addExercise(exercise.getText());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                    }
                    if (theView.getWorkoutNumber()==3){
                        if (theModel.getWorkouts()[2].getWorkout().contains(exercise.getText())){

                            theView.setErrorMessage(exercise.getText());
                            theView.getConfirmationMessage().setText(null);
                            theView.add(theView.getErrorMessage());
                        }
                        else {
                            theModel.getWorkouts()[2].addExercise(exercise.getText());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                    }
                    if (theView.getWorkoutNumber()==4){
                        if (theModel.getWorkouts()[3].getWorkout().contains(exercise.getText())){

                            theView.setErrorMessage(exercise.getText());
                            theView.getConfirmationMessage().setText(null);
                            theView.add(theView.getErrorMessage());
                        }
                        else {
                            theModel.getWorkouts()[3].addExercise(exercise.getText());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                    }
                    if (theView.getWorkoutNumber()==5){
                        if (theModel.getWorkouts()[4].getWorkout().contains(exercise.getText())){

                            theView.setErrorMessage(exercise.getText());
                            theView.getConfirmationMessage().setText(null);
                            theView.add(theView.getErrorMessage());
                        }
                        else {
                            theModel.getWorkouts()[4].addExercise(exercise.getText());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                    }
                }
            }
        }
    }
}
