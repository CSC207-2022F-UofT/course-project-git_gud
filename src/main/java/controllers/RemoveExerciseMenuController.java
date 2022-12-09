package controllers;

import entities.Exercise;
import management.RoutineManager;
import views.RemoveExerciseMenuView;
import views.WorkoutMenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * A controller class for RemoveExerciseMenuView.
 * @author turne142
 */
public class RemoveExerciseMenuController {

    RoutineManager theModel;

    RemoveExerciseMenuView theView;

    /**
     * The constructor adds an action listener to the backButton and all the exercise buttons displayed as a list in
     * the display of RemoveExerciseMenuView.
     * @param theModel a RoutineManager instance where all the data is stored.
     * @param theView a RemoveExerciseMenuView instance representing the current display.
     */
    public RemoveExerciseMenuController(RoutineManager theModel, RemoveExerciseMenuView theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addRemoveExerciseListener(new RemoveExerciseAction());
        this.theView.addBackListener(new BackAction());
    }

    /**
     * An action listener class in charge of removing an exercise from the current Workout, if the exercise was already
     * removed, then it will display the errorMessage from RemoveExerciseMenuView, otherwise the exercise will be
     * removed and the confirmationMessage is displayed instead.
     */
    class RemoveExerciseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (JButton exercise : theView.getExercises()){
                if (e.getSource()==exercise){

                    if (theView.getWorkoutNumber()==1){

                        int lastIndex = theModel.getWorkouts()[0].getWorkout().size()-1;

                        for (Exercise x : theModel.getWorkouts()[0].getWorkout()){

                            if (Objects.equals(x.getType(), exercise.getText())){
                                theModel.getWorkouts()[0].removeExercise(exercise.getText());

                                theView.setConfirmationMessage(exercise.getText());
                                theView.getErrorMessage().setText(null);
                                theView.add(theView.getConfirmationMessage());
                                break;
                            }

                            if (x==theModel.getWorkouts()[0].getWorkout().get(lastIndex)){
                                theView.setErrorMessage(exercise.getText());
                                theView.getConfirmationMessage().setText(null);
                                theView.add(theView.getErrorMessage());
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==2){

                        int lastIndex = theModel.getWorkouts()[1].getWorkout().size()-1;

                        for (Exercise x : theModel.getWorkouts()[1].getWorkout()){

                            if (Objects.equals(x.getType(), exercise.getText())){
                                theModel.getWorkouts()[1].removeExercise(exercise.getText());

                                theView.setConfirmationMessage(exercise.getText());
                                theView.getErrorMessage().setText(null);
                                theView.add(theView.getConfirmationMessage());
                                break;
                            }

                            if (x==theModel.getWorkouts()[1].getWorkout().get(lastIndex)){
                                theView.setErrorMessage(exercise.getText());
                                theView.getConfirmationMessage().setText(null);
                                theView.add(theView.getErrorMessage());
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==3){

                        int lastIndex = theModel.getWorkouts()[2].getWorkout().size()-1;

                        for (Exercise x : theModel.getWorkouts()[2].getWorkout()){

                            if (Objects.equals(x.getType(), exercise.getText())){
                                theModel.getWorkouts()[2].removeExercise(exercise.getText());

                                theView.setConfirmationMessage(exercise.getText());
                                theView.getErrorMessage().setText(null);
                                theView.add(theView.getConfirmationMessage());
                                break;
                            }

                            if (x==theModel.getWorkouts()[2].getWorkout().get(lastIndex)){
                                theView.setErrorMessage(exercise.getText());
                                theView.getConfirmationMessage().setText(null);
                                theView.add(theView.getErrorMessage());
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==4){

                        int lastIndex = theModel.getWorkouts()[3].getWorkout().size()-1;

                        for (Exercise x : theModel.getWorkouts()[3].getWorkout()){

                            if (Objects.equals(x.getType(), exercise.getText())){
                                theModel.getWorkouts()[3].removeExercise(exercise.getText());

                                theView.setConfirmationMessage(exercise.getText());
                                theView.getErrorMessage().setText(null);
                                theView.add(theView.getConfirmationMessage());
                                break;
                            }

                            if (x==theModel.getWorkouts()[3].getWorkout().get(lastIndex)){
                                theView.setErrorMessage(exercise.getText());
                                theView.getConfirmationMessage().setText(null);
                                theView.add(theView.getErrorMessage());
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==5){

                        int lastIndex = theModel.getWorkouts()[4].getWorkout().size()-1;

                        for (Exercise x : theModel.getWorkouts()[4].getWorkout()){

                            if (Objects.equals(x.getType(), exercise.getText())){
                                theModel.getWorkouts()[4].removeExercise(exercise.getText());

                                theView.setConfirmationMessage(exercise.getText());
                                theView.getErrorMessage().setText(null);
                                theView.add(theView.getConfirmationMessage());
                                break;
                            }

                            if (x==theModel.getWorkouts()[4].getWorkout().get(lastIndex)){
                                theView.setErrorMessage(exercise.getText());
                                theView.getConfirmationMessage().setText(null);
                                theView.add(theView.getErrorMessage());
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * An action listener method in charge of returning to WorkoutMenuView when the back button is pressed.
     */
    class BackAction implements ActionListener, ReturnToMenu {


        @Override
        public void actionPerformed(ActionEvent e) {

            theView.dispose();

            WorkoutMenuView workoutMenuView = new WorkoutMenuView();

            returnToMenu(theModel, workoutMenuView);
        }

        /**
         * A method overridden from the ReturnToMenu interface, see the JavaDOc there for more information.
         * @param theModel a RoutineManager instance where all the data is stored.
         * @param workoutMenuView a WorkoutMenuView instance representing the display that shows up once the back button
         *                        is pressed.
         */
        @Override
        public void returnToMenu(RoutineManager theModel, WorkoutMenuView workoutMenuView) {

            if (theView.getWorkoutNumber()==1){

                workoutMenuView.setWorkoutNumber(1);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[0].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[0].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[0].getWorkout().get(i).getType());
                    }
                }
            }
            if (theView.getWorkoutNumber()==2){

                workoutMenuView.setWorkoutNumber(2);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[1].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[1].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[1].getWorkout().get(i).getType());
                    }
                }
            }
            if (theView.getWorkoutNumber()==3){

                workoutMenuView.setWorkoutNumber(3);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[2].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[2].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[2].getWorkout().get(i).getType());
                    }
                }
            }
            if (theView.getWorkoutNumber()==4){

                workoutMenuView.setWorkoutNumber(4);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[3].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[3].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[3].getWorkout().get(i).getType());
                    }
                }
            }
            if (theView.getWorkoutNumber()==5){

                workoutMenuView.setWorkoutNumber(5);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[4].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[4].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[4].getWorkout().get(i).getType());
                    }
                }
            }
        }
    }

}
