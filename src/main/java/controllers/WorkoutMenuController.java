package controllers;

import management.RoutineManager;
import views.AddExerciseMenu;
import views.RemoveExerciseMenu;
import views.WorkoutMenu;
import views.WorkoutSelection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenuController {

    private final RoutineManager theModel;
    private final WorkoutMenu theView;

    public WorkoutMenuController(RoutineManager theModel, WorkoutMenu theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addWorkoutSelectionDisplay(new WorkoutSelectionDisplay());
        this.theView.addAddExerciseDisplay(new AddExerciseDisplay());
        this.theView.addRemoveExerciseDisplay(new RemoveExerciseDisplay());
    }

    class WorkoutSelectionDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
            WorkoutSelection workoutSelection = new WorkoutSelection();

            new WorkoutSelectionController(theModel, workoutSelection);
        }
    }

    class AddExerciseDisplay implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(1);

                new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(2);

                new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(3);

                new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(4);

                new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(5);

                new AddExerciseController(theModel, addExerciseMenu);
            }
        }
    }

    class RemoveExerciseDisplay implements ActionListener, DisplayExercisesRemoveMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 1);

                removeExerciseMenu.setWorkoutNumber(1);

                new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 2);

                removeExerciseMenu.setWorkoutNumber(2);

                new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 3);

                removeExerciseMenu.setWorkoutNumber(3);

                new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 4);

                removeExerciseMenu.setWorkoutNumber(4);

                new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 5);

                removeExerciseMenu.setWorkoutNumber(5);

                new RemoveExerciseMenuController(theModel, removeExerciseMenu);
            }
        }

        @Override
        public void displayExercises(RoutineManager theModel, RemoveExerciseMenu removeExerciseMenu, int workoutNumber) {
            if (!theModel.getWorkouts()[workoutNumber-1].getWorkout().isEmpty()) {
                for (int i = 0; i < theModel.getWorkouts()[workoutNumber - 1].getWorkout().size(); i++) {
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[workoutNumber - 1].getWorkout().get(i));
                }
            }
        }
    }
}
