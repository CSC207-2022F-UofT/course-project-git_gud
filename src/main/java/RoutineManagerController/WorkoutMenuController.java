package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.RemoveExerciseMenu;
import RoutineManagerView.WorkoutMenu;
import RoutineManagerView.WorkoutSelection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenuController {

    private RoutineManager theModel;
    private WorkoutMenu theView;

    public WorkoutMenuController(RoutineManager theModel, WorkoutMenu theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addWorkoutSelectionDisplay(new WorkoutSelectionDisplay());
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

    class RemoveExerciseDisplay implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if (theView.getWorkoutNumber()==1) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                for (int i=0; i<theModel.getWorkouts()[0].getWorkout().size(); i++){
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[0].getWorkout().get(i));
                }

                removeExerciseMenu.setWorkoutNumber(1);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);
            }
            if (theView.getWorkoutNumber()==2) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                for (int i=0; i<theModel.getWorkouts()[1].getWorkout().size(); i++){
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[1].getWorkout().get(i));
                }
                removeExerciseMenu.setWorkoutNumber(2);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==3) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                for (int i=0; i<theModel.getWorkouts()[2].getWorkout().size(); i++){
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[2].getWorkout().get(i));
                }
                removeExerciseMenu.setWorkoutNumber(3);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==4) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                for (int i=0; i<theModel.getWorkouts()[3].getWorkout().size(); i++){
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[3].getWorkout().get(i));
                }
                removeExerciseMenu.setWorkoutNumber(4);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
            if (theView.getWorkoutNumber()==5) {

                theView.dispose();
                RemoveExerciseMenu removeExerciseMenu = new RemoveExerciseMenu();

                for (int i=0; i<theModel.getWorkouts()[4].getWorkout().size(); i++){
                    removeExerciseMenu.addExercise(theModel.getWorkouts()[4].getWorkout().get(i));
                }
                removeExerciseMenu.setWorkoutNumber(5);

                RemoveExerciseMenuController theController = new RemoveExerciseMenuController(theModel, removeExerciseMenu);

            }
        }
    }

}
