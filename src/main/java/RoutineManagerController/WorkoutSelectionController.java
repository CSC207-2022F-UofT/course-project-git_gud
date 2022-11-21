package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.WorkoutSelection;
import RoutineManagerView.WorkoutMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutSelectionController {

    private RoutineManager theModel;
    private WorkoutSelection theView;

    public WorkoutSelectionController(RoutineManager theModel, WorkoutSelection theView){

        this.theModel = theModel;
        this.theView = theView;

        this.theView.addWorkoutMenuDisplay(new WorkoutMenuDisplay());
    }

    class WorkoutMenuDisplay implements ActionListener, DisplayExercisesWorkoutMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == theView.workout1Button) {
                theView.dispose();
                WorkoutMenu workout1Menu = new WorkoutMenu();
                workout1Menu.setWorkoutNumber(1);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout1Menu);

                displayExercises(theModel, workout1Menu, 1);
            }
            if (e.getSource() == theView.workout2Button) {
                theView.dispose();
                WorkoutMenu workout2Menu = new WorkoutMenu();
                workout2Menu.setWorkoutNumber(2);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout2Menu);

                displayExercises(theModel, workout2Menu, 2);
            }
            if (e.getSource() == theView.workout3Button) {
                theView.dispose();
                WorkoutMenu workout3Menu = new WorkoutMenu();
                workout3Menu.setWorkoutNumber(3);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout3Menu);

                displayExercises(theModel, workout3Menu, 3);
            }
            if (e.getSource() == theView.workout4Button) {
                theView.dispose();
                WorkoutMenu workout4Menu = new WorkoutMenu();
                workout4Menu.setWorkoutNumber(4);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout4Menu);

                displayExercises(theModel, workout4Menu, 4);
            }
            if (e.getSource() == theView.workout5Button) {
                theView.dispose();
                WorkoutMenu workout5Menu = new WorkoutMenu();
                workout5Menu.setWorkoutNumber(5);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout5Menu);

                displayExercises(theModel, workout5Menu, 5);
            }
        }

        @Override
        public void displayExercises(RoutineManager theModel, WorkoutMenu workoutMenu, int workoutNumber) {
            if (!theModel.getWorkouts()[workoutNumber-1].getWorkout().isEmpty()){
                for (int i=0; i<theModel.getWorkouts()[workoutNumber-1].getWorkout().size(); i++){
                    workoutMenu.addExercise(theModel.getWorkouts()[workoutNumber-1].getWorkout().get(i));
                }
            }
        }
    }
}


