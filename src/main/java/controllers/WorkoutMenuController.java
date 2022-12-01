package controllers;

import management.RoutineManager;
import views.AddExerciseMenuView;
import views.RemoveExerciseMenuView;
import views.WorkoutMenuView;
import views.WorkoutSelectionView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenuController {

    private RoutineManager theModel;
    private WorkoutMenuView theView;

    public WorkoutMenuController(RoutineManager theModel, WorkoutMenuView theView){

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
            WorkoutSelectionView workoutSelectionView = new WorkoutSelectionView();

            WorkoutSelectionController theController = new WorkoutSelectionController(theModel, workoutSelectionView);
        }
    }

    class AddExerciseDisplay implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(1);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(2);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(3);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(4);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(5);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenuView);
            }
        }
    }

    class RemoveExerciseDisplay implements ActionListener, DisplayExercisesRemoveMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 1);

                removeExerciseMenuView.setWorkoutNumber(1);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 2);

                removeExerciseMenuView.setWorkoutNumber(2);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 3);

                removeExerciseMenuView.setWorkoutNumber(3);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 4);

                removeExerciseMenuView.setWorkoutNumber(4);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 5);

                removeExerciseMenuView.setWorkoutNumber(5);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenuView);
            }
        }

        @Override
        public void displayExercises(RoutineManager theModel, RemoveExerciseMenuView removeExerciseMenuView, int workoutNumber) {
            if (!theModel.getWorkouts()[workoutNumber-1].getWorkout().isEmpty()) {
                for (int i = 0; i < theModel.getWorkouts()[workoutNumber - 1].getWorkout().size(); i++) {
                    removeExerciseMenuView.addExercise(theModel.getWorkouts()[workoutNumber - 1].getWorkout().get(i));
                }
            }
        }
    }
}
