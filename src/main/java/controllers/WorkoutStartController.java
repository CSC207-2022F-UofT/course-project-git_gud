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

    /**
     * Implements the behaviour of the next button.
     */
    class NextStartDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (startView.getWorkoutNumber() == 1){

                if (startModel.getWorkouts()[0].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(1);

                    new WorkoutMenuController(startModel, workoutMenuView);
                }
                else{

                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(1);

                    int workoutLength = startModel.getWorkouts()[0].getWorkout().size();
                    for (int i = 0; i < workoutLength; i++){
                        startView.addExercises(startModel.getWorkouts()[0].getWorkout().get(i).getType());

                    }
                    newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[0].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }

            if (startView.getWorkoutNumber() == 2){

                if (startModel.getWorkouts()[1].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(2);

                    new WorkoutMenuController(startModel, workoutMenuView);
                }
                else{

                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(2);

                    int workoutLength = startModel.getWorkouts()[1].getWorkout().size();
                    for (int i = 0; i < workoutLength; i++){
                        startView.addExercises(startModel.getWorkouts()[1].getWorkout().get(i).getType());

                    }
                    newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[1].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }

            if (startView.getWorkoutNumber() == 3){

                if (startModel.getWorkouts()[2].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(3);

                    new WorkoutMenuController(startModel, workoutMenuView);
                }
                else{

                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(1);

                    int workoutLength = startModel.getWorkouts()[2].getWorkout().size();
                    for (int i = 0; i < workoutLength; i++){
                        startView.addExercises(startModel.getWorkouts()[2].getWorkout().get(i).getType());

                    }
                    newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[2].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }

            if (startView.getWorkoutNumber() == 4){

                if (startModel.getWorkouts()[3].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(4);

                    new WorkoutMenuController(startModel, workoutMenuView);
                }
                else{

                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(4);

                    int workoutLength = startModel.getWorkouts()[3].getWorkout().size();
                    for (int i = 0; i < workoutLength; i++){
                        startView.addExercises(startModel.getWorkouts()[3].getWorkout().get(i).getType());

                    }
                    newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[3].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }

            if (startView.getWorkoutNumber() == 5){

                if (startModel.getWorkouts()[4].getWorkout().size()==startView.exerciseNumber){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(5);

                    new WorkoutMenuController(startModel, workoutMenuView);
                }
                else{

                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(5);

                    int workoutLength = startModel.getWorkouts()[4].getWorkout().size();
                    for (int i = 0; i < workoutLength; i++){
                        startView.addExercises(startModel.getWorkouts()[4].getWorkout().get(i).getType());

                    }
                    newStartView.setExerciseNumber(newStartView.getExerciseNumber()+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[4].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }


        }
    }

}

