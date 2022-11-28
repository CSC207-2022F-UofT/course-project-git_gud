package Controllers;

import management.RoutineManager;
import Views.AddExerciseMenu;
import Views.RemoveExerciseMenu;
import Views.WorkoutMenu;
import Views.WorkoutSelection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenuController {

    private RoutineManager theModel;
    private WorkoutMenu theView;

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

            WorkoutSelectionController theController = new WorkoutSelectionController(theModel, workoutSelection);
        }
    }

    class AddExerciseDisplay implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(1);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(2);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(3);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(4);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenu);
            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                AddExerciseMenu addExerciseMenu = new AddExerciseMenu();

                addExerciseMenu.setWorkoutNumber(5);

                AddExerciseController addExerciseController = new AddExerciseController(theModel, addExerciseMenu);
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

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 2);

                removeExerciseMenu.setWorkoutNumber(2);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 3);

                removeExerciseMenu.setWorkoutNumber(3);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 4);

                removeExerciseMenu.setWorkoutNumber(4);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                displayExercises(theModel, removeExerciseMenu, 5);

                removeExerciseMenu.setWorkoutNumber(5);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);
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
