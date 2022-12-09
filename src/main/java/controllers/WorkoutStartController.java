package controllers;

import management.RoutineManager;
import management.Workout;
import views.WorkoutMenuView;
import views.WorkoutSelectionView;
import views.WorkoutStartView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutStartController {
    private final RoutineManager startModel;
    private final WorkoutStartView startView;

    public WorkoutStartController(RoutineManager startModel, WorkoutStartView startView) {

        this.startModel = startModel;

        this.startView = startView;

        this.startView.nextExerciseDisplay(new NextStartDisplay());
    }


    class NextStartDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (startView.getWorkoutNumber() == 1){

                if (startModel.getWorkouts()[0].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
//                    WorkoutMenuView
                }

                startView.dispose();
                WorkoutStartView newStartView = new WorkoutStartView();

                newStartView.setWorkoutNumber(1);

                int workoutLength = startModel.getWorkouts()[0].getWorkout().size();
                for (int i = 0; i < workoutLength; i++){
                    startView.addExercises(startModel.getWorkouts()[0].getWorkout().get(i));

            }
                newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                newStartView.setExerciseName(startModel.getWorkouts()[0].getWorkout().get(newStartView.getExerciseNumber()));

            }



//            new WorkoutStartController(startModel, newStartView);
        }
    }





    public void run() {

    }
}

