package controllers;

import management.RoutineManager;
import views.WorkoutSelectionView;
import views.WorkoutMenuView;
import views.dashboard.SettingsPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutSelectionController {

    private final RoutineManager theModel;
    private final WorkoutSelectionView theView;

    public WorkoutSelectionController(RoutineManager theModel, WorkoutSelectionView theView){

        this.theModel = theModel;
        this.theView = theView;

        this.theView.addWorkoutMenuDisplay(new WorkoutMenuDisplay());
        this.theView.addSettingsDisplay(new SettingsDisplay());
    }

    class WorkoutMenuDisplay implements ActionListener, DisplayExercisesWorkoutMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == theView.workout1Button) {
                theView.dispose();
                WorkoutMenuView workout1Menu = new WorkoutMenuView();
                workout1Menu.setWorkoutNumber(1);

                new WorkoutMenuController(theModel, workout1Menu);

                displayExercises(theModel, workout1Menu, 1);
            }
            if (e.getSource() == theView.workout2Button) {
                theView.dispose();
                WorkoutMenuView workout2Menu = new WorkoutMenuView();
                workout2Menu.setWorkoutNumber(2);

                new WorkoutMenuController(theModel, workout2Menu);

                displayExercises(theModel, workout2Menu, 2);
            }
            if (e.getSource() == theView.workout3Button) {
                theView.dispose();
                WorkoutMenuView workout3Menu = new WorkoutMenuView();
                workout3Menu.setWorkoutNumber(3);

                new WorkoutMenuController(theModel, workout3Menu);

                displayExercises(theModel, workout3Menu, 3);
            }
            if (e.getSource() == theView.workout4Button) {
                theView.dispose();
                WorkoutMenuView workout4Menu = new WorkoutMenuView();
                workout4Menu.setWorkoutNumber(4);

                new WorkoutMenuController(theModel, workout4Menu);

                displayExercises(theModel, workout4Menu, 4);
            }
            if (e.getSource() == theView.workout5Button) {
                theView.dispose();
                WorkoutMenuView workout5Menu = new WorkoutMenuView();
                workout5Menu.setWorkoutNumber(5);

                new WorkoutMenuController(theModel, workout5Menu);

                displayExercises(theModel, workout5Menu, 5);
            }
        }

        @Override
        public void displayExercises(RoutineManager theModel, WorkoutMenuView workoutMenuView, int workoutNumber) {
            if (!theModel.getWorkouts()[workoutNumber-1].getWorkout().isEmpty()){
                for (int i=0; i<theModel.getWorkouts()[workoutNumber-1].getWorkout().size(); i++){
                    workoutMenuView.addExercise(theModel.getWorkouts()[workoutNumber-1].getWorkout().get(i));
                }
            }
        }
    }

    class SettingsDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource()==theView.backButton){

                theView.dispose();
                SettingsPage dashboardViewer = new SettingsPage();
                dashboardViewer.CreateSettingsPage();
            }
        }
    }
}


