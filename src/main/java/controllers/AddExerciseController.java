package controllers;

import entities.Exercise;
import management.RoutineManager;
import views.AddExerciseMenuView;
import views.WorkoutMenuView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * A controller class for AddExerciseMenuView.
 * @author turne142
 */
public class AddExerciseController {

    RoutineManager theModel;
    AddExerciseMenuView theView;

    /**
     * The constructor adds action listeners to all exercise buttons on the display and to the back button.
     * @param theModel a RoutineManager instance where all the data is stored.
     * @param theView an AddExerciseMenuView instance representing the current display.
     */
    public AddExerciseController(RoutineManager theModel, AddExerciseMenuView theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addAddAction(new AddAction());
        this.theView.addBackAction(new BackActionAddExercise());
    }

    /**
     * An action listener class in charge of returning to WorkoutMenuView once the back button is pressed.
     */
    class BackActionAddExercise implements ActionListener, ReturnToMenu{

        @Override
        public void actionPerformed(ActionEvent e) {

            theView.dispose();

            WorkoutMenuView workoutMenuView = new WorkoutMenuView();

            returnToMenu(theModel, workoutMenuView);

        }

        /**
         * A method overridden from the ReturnToMenu interface, see the JavaDoc over there for more info.
         * @param theModel a RoutineManager instance where all the data is stored.
         * @param workoutMenuView a WorkoutMenuView instance representing the display that we're returning to.
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

    class AddAction implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {

            for (JButton exercise : theView.getExercises()){
                if (e.getSource()==exercise){

                    if (theView.getWorkoutNumber()==1){

                        int lastIndex = theModel.getWorkouts()[0].getWorkout().size()-1;

                        if (theModel.getWorkouts()[0].getWorkout().isEmpty()){
                            Exercise newExercise = new Exercise();
                            newExercise.setType(exercise.getText());

                            theModel.getWorkouts()[0].addExercise(newExercise.getType());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                        else {

                            for (Exercise x : theModel.getWorkouts()[0].getWorkout()){

                                if (Objects.equals(x.getType(), exercise.getText())){
                                    theView.setErrorMessage(exercise.getText());
                                    theView.getConfirmationMessage().setText(null);
                                    theView.add(theView.getErrorMessage());
                                    break;
                                }

                                if (x==theModel.getWorkouts()[0].getWorkout().get(lastIndex)){
                                    Exercise newExercise = new Exercise();
                                    newExercise.setType(exercise.getText());

                                    theModel.getWorkouts()[0].addExercise(newExercise.getType());

                                    theView.setConfirmationMessage(exercise.getText());
                                    theView.getErrorMessage().setText(null);
                                    theView.add(theView.getConfirmationMessage());
                                }
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==2){
                        int lastIndex = theModel.getWorkouts()[1].getWorkout().size()-1;

                        if (theModel.getWorkouts()[1].getWorkout().isEmpty()){
                            Exercise newExercise = new Exercise();
                            newExercise.setType(exercise.getText());

                            theModel.getWorkouts()[1].addExercise(newExercise.getType());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                        else {

                            for (Exercise x : theModel.getWorkouts()[1].getWorkout()) {

                                if (Objects.equals(x.getType(), exercise.getText())) {
                                    theView.setErrorMessage(exercise.getText());
                                    theView.getConfirmationMessage().setText(null);
                                    theView.add(theView.getErrorMessage());
                                    break;
                                }

                                if (x == theModel.getWorkouts()[1].getWorkout().get(lastIndex)) {
                                    Exercise newExercise = new Exercise();
                                    newExercise.setType(exercise.getText());

                                    theModel.getWorkouts()[1].addExercise(newExercise.getType());

                                    theView.setConfirmationMessage(exercise.getText());
                                    theView.getErrorMessage().setText(null);
                                    theView.add(theView.getConfirmationMessage());
                                }
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==3){

                        int lastIndex = theModel.getWorkouts()[2].getWorkout().size()-1;

                        if (theModel.getWorkouts()[2].getWorkout().isEmpty()){
                            Exercise newExercise = new Exercise();
                            newExercise.setType(exercise.getText());

                            theModel.getWorkouts()[2].addExercise(newExercise.getType());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                        else {

                            for (Exercise x : theModel.getWorkouts()[2].getWorkout()) {

                                if (Objects.equals(x.getType(), exercise.getText())) {
                                    theView.setErrorMessage(exercise.getText());
                                    theView.getConfirmationMessage().setText(null);
                                    theView.add(theView.getErrorMessage());
                                    break;
                                }

                                if (x == theModel.getWorkouts()[2].getWorkout().get(lastIndex)) {
                                    Exercise newExercise = new Exercise();
                                    newExercise.setType(exercise.getText());

                                    theModel.getWorkouts()[2].addExercise(newExercise.getType());

                                    theView.setConfirmationMessage(exercise.getText());
                                    theView.getErrorMessage().setText(null);
                                    theView.add(theView.getConfirmationMessage());
                                }
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==4){

                        int lastIndex = theModel.getWorkouts()[3].getWorkout().size()-1;

                        if (theModel.getWorkouts()[3].getWorkout().isEmpty()){
                            Exercise newExercise = new Exercise();
                            newExercise.setType(exercise.getText());

                            theModel.getWorkouts()[3].addExercise(newExercise.getType());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                        else {

                            for (Exercise x : theModel.getWorkouts()[3].getWorkout()) {

                                if (Objects.equals(x.getType(), exercise.getText())) {
                                    theView.setErrorMessage(exercise.getText());
                                    theView.getConfirmationMessage().setText(null);
                                    theView.add(theView.getErrorMessage());
                                    break;
                                }

                                if (x == theModel.getWorkouts()[3].getWorkout().get(lastIndex)) {
                                    Exercise newExercise = new Exercise();
                                    newExercise.setType(exercise.getText());

                                    theModel.getWorkouts()[3].addExercise(newExercise.getType());

                                    theView.setConfirmationMessage(exercise.getText());
                                    theView.getErrorMessage().setText(null);
                                    theView.add(theView.getConfirmationMessage());
                                }
                            }
                        }
                    }
                    if (theView.getWorkoutNumber()==5){

                        int lastIndex = theModel.getWorkouts()[4].getWorkout().size()-1;

                        if (theModel.getWorkouts()[4].getWorkout().isEmpty()){
                            Exercise newExercise = new Exercise();
                            newExercise.setType(exercise.getText());

                            theModel.getWorkouts()[4].addExercise(newExercise.getType());

                            theView.setConfirmationMessage(exercise.getText());
                            theView.getErrorMessage().setText(null);
                            theView.add(theView.getConfirmationMessage());
                        }
                        else {

                            for (Exercise x : theModel.getWorkouts()[4].getWorkout()) {

                                if (Objects.equals(x.getType(), exercise.getText())) {
                                    theView.setErrorMessage(exercise.getText());
                                    theView.getConfirmationMessage().setText(null);
                                    theView.add(theView.getErrorMessage());
                                    break;
                                }

                                if (x == theModel.getWorkouts()[4].getWorkout().get(lastIndex)) {
                                    Exercise newExercise = new Exercise();
                                    newExercise.setType(exercise.getText());

                                    theModel.getWorkouts()[4].addExercise(newExercise.getType());

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
    }
}
