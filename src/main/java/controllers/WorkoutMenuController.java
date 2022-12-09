package controllers;

import management.RoutineManager;
import views.AddExerciseMenuView;
import views.RemoveExerciseMenuView;
import views.WorkoutMenuView;
import views.WorkoutSelectionView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A controller class for WorkoutMenuView.
 * @author turne142
 */
public class WorkoutMenuController {

    private final RoutineManager theModel;
    private final WorkoutMenuView theView;

    /**
     * The constructor adds action listeners to the back, start exercise, add exercise, remove exercise, and workout
     * history buttons.
     * @param theModel a RoutineManager instance where all the data is stored.
     * @param theView a WorkoutMenuView instance representing the current display.
     */
    public WorkoutMenuController(RoutineManager theModel, WorkoutMenuView theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addWorkoutSelectionDisplay(new WorkoutSelectionDisplay());
        this.theView.addAddExerciseDisplay(new AddExerciseDisplay());
        this.theView.addRemoveExerciseDisplay(new RemoveExerciseDisplay());
//        this.theView.addWorkoutStartView(new WorkoutStartDisplay());
    }

//    class WorkoutStartDisplay implements ActionListener {

//        @Override
//        public void actionPerformed(ActionEvent e) {
//            theView.dispose();
//            WorkoutStartView workoutStartView = new WorkoutSelectionView();
//
//            workoutStartView.setWorkoutNumber = 1;
//
//            new WorkoutStartController(theModel, workoutStartView);
//        }
//    }

    /**
     * An action listener class in charge of returning to WorkoutSelectionView once the back button is pressed.
     */
    class WorkoutSelectionDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
            WorkoutSelectionView workoutSelectionView = new WorkoutSelectionView();

            new WorkoutSelectionController(theModel, workoutSelectionView);
        }
    }

    /**
     * An action listener class in charge of displaying AddExerciseMenuView once the add exercise button is pressed.
     */
    class AddExerciseDisplay implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(1);

                new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(2);

                new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(3);

                new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(4);

                new AddExerciseController(theModel, addExerciseMenuView);
            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                AddExerciseMenuView addExerciseMenuView = new AddExerciseMenuView();

                addExerciseMenuView.setWorkoutNumber(5);

                new AddExerciseController(theModel, addExerciseMenuView);
            }
        }
    }

    /**
     * An action listener class in charge of displaying RemoveExerciseMenuView once the remove exercise button is
     * pressed.
     */
    class RemoveExerciseDisplay implements ActionListener, DisplayExercisesRemoveMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 1);

                removeExerciseMenuView.setWorkoutNumber(1);

                new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 2);

                removeExerciseMenuView.setWorkoutNumber(2);

                new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 3);

                removeExerciseMenuView.setWorkoutNumber(3);

                new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 4);

                removeExerciseMenuView.setWorkoutNumber(4);

                new RemoveExerciseMenuController(theModel, removeExerciseMenuView);

            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                RemoveExerciseMenuView removeExerciseMenuView = new RemoveExerciseMenuView();

                displayExercises(theModel, removeExerciseMenuView, 5);

                removeExerciseMenuView.setWorkoutNumber(5);

                new RemoveExerciseMenuController(theModel, removeExerciseMenuView);
            }
        }

        /**
         * A method overridden from the DisplayExercisesRemoveMenu interface, check the JavaDoc there for more details.
         */
        @Override
        public void displayExercises(RoutineManager theModel, RemoveExerciseMenuView removeExerciseMenuView, int workoutNumber) {
            if (!theModel.getWorkouts()[workoutNumber-1].getWorkout().isEmpty()) {
                for (int i = 0; i < theModel.getWorkouts()[workoutNumber - 1].getWorkout().size(); i++) {
                    removeExerciseMenuView.addExercise(theModel.getWorkouts()[workoutNumber - 1].getWorkout().get(i).getType());
                }
            }
        }
    }
}
