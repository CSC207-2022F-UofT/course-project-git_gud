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

    class WorkoutMenuDisplay implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == theView.workout1Button) {
                theView.dispose();
                WorkoutMenu workout1Menu = new WorkoutMenu();
                workout1Menu.setWorkoutNumber(1);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout1Menu);

                if (!theModel.getWorkouts()[0].getWorkout().isEmpty()){
                    for (int i=0; i<theModel.getWorkouts()[0].getWorkout().size(); i++){
                        workout1Menu.addExercise(theModel.getWorkouts()[0].getWorkout().get(i));
                    }
                }
            }
            if (e.getSource() == theView.workout2Button) {
                theView.dispose();
                WorkoutMenu workout2Menu = new WorkoutMenu();
                workout2Menu.setWorkoutNumber(2);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout2Menu);

                if (!theModel.getWorkouts()[1].getWorkout().isEmpty()){
                    for (int i=0; i<theModel.getWorkouts()[1].getWorkout().size(); i++){
                        workout2Menu.addExercise(theModel.getWorkouts()[1].getWorkout().get(i));
                    }
                }
            }
            if (e.getSource() == theView.workout3Button) {
                theView.dispose();
                WorkoutMenu workout3Menu = new WorkoutMenu();
                workout3Menu.setWorkoutNumber(3);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout3Menu);

                if (!theModel.getWorkouts()[2].getWorkout().isEmpty()){
                    for (int i=0; i<theModel.getWorkouts()[2].getWorkout().size(); i++){
                        workout3Menu.addExercise(theModel.getWorkouts()[2].getWorkout().get(i));
                    }
                }
            }
            if (e.getSource() == theView.workout4Button) {
                theView.dispose();
                WorkoutMenu workout4Menu = new WorkoutMenu();
                workout4Menu.setWorkoutNumber(4);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout4Menu);

                if (!theModel.getWorkouts()[3].getWorkout().isEmpty()){
                    for (int i=0; i<theModel.getWorkouts()[3].getWorkout().size(); i++){
                        workout4Menu.addExercise(theModel.getWorkouts()[3].getWorkout().get(i));
                    }
                }
            }
            if (e.getSource() == theView.workout5Button) {
                theView.dispose();
                WorkoutMenu workout5Menu = new WorkoutMenu();
                workout5Menu.setWorkoutNumber(5);

                WorkoutMenuController theController = new WorkoutMenuController(theModel, workout5Menu);

                if (!theModel.getWorkouts()[4].getWorkout().isEmpty()){
                    for (int i=0; i<theModel.getWorkouts()[4].getWorkout().size(); i++){
                        workout5Menu.addExercise(theModel.getWorkouts()[4].getWorkout().get(i));
                    }
                }
            }
        }
    }
}


