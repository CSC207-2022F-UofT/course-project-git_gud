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
    class NextStartDisplay implements ActionListener, ReturnToMenu {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (startView.getWorkoutNumber() == 1){

                int number = startView.getExerciseNumber();

                if (startModel.getWorkouts()[0].getWorkout().size()-1==startView.getExerciseNumber()){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(1);

                    returnToMenu(startModel, workoutMenuView);

                }
                else{
                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(1);

                    System.out.println(startView.getExerciseNumber());
                    System.out.println(startModel.getWorkouts()[0].getWorkout().size());

                    newStartView.setExerciseNumber(number+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[0].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }
            if (startView.getWorkoutNumber() == 2){

                int number = startView.getExerciseNumber();

                if (startModel.getWorkouts()[1].getWorkout().size()-1==startView.getExerciseNumber()){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(2);

                    returnToMenu(startModel, workoutMenuView);
                }
                else{
                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(2);

                    System.out.println(startView.getExerciseNumber());
                    System.out.println(startModel.getWorkouts()[1].getWorkout().size());

                    newStartView.setExerciseNumber(number+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[1].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }
            if (startView.getWorkoutNumber() == 3){

                int number = startView.getExerciseNumber();

                if (startModel.getWorkouts()[2].getWorkout().size()-1==startView.getExerciseNumber()){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(3);

                    returnToMenu(startModel, workoutMenuView);
                }
                else{
                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(3);

                    System.out.println(startView.getExerciseNumber());
                    System.out.println(startModel.getWorkouts()[2].getWorkout().size());

                    newStartView.setExerciseNumber(number+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[2].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }
            if (startView.getWorkoutNumber() == 4){

                int number = startView.getExerciseNumber();

                if (startModel.getWorkouts()[3].getWorkout().size()-1==startView.getExerciseNumber()){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(4);

                    returnToMenu(startModel, workoutMenuView);
                }
                else{
                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(4);

                    System.out.println(startView.getExerciseNumber());
                    System.out.println(startModel.getWorkouts()[3].getWorkout().size());

                    newStartView.setExerciseNumber(number+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[3].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }
            if (startView.getWorkoutNumber() == 5){

                int number = startView.getExerciseNumber();

                if (startModel.getWorkouts()[4].getWorkout().size()-1==startView.getExerciseNumber()){

                    startView.dispose();
                    WorkoutMenuView workoutMenuView = new WorkoutMenuView();

                    workoutMenuView.setWorkoutNumber(5);

                    returnToMenu(startModel, workoutMenuView);
                }
                else{
                    startView.dispose();
                    WorkoutStartView newStartView = new WorkoutStartView();

                    newStartView.setWorkoutNumber(5);

                    System.out.println(startView.getExerciseNumber());
                    System.out.println(startModel.getWorkouts()[4].getWorkout().size());

                    newStartView.setExerciseNumber(number+1);
                    newStartView.setExerciseName(startModel.getWorkouts()[4].getWorkout().get(newStartView.getExerciseNumber()).getType());

                    new WorkoutStartController(startModel, newStartView);
                }

            }
        }

        @Override
        public void returnToMenu(RoutineManager theModel, WorkoutMenuView workoutMenuView) {
            if (startView.getWorkoutNumber()==1){

                workoutMenuView.setWorkoutNumber(1);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[0].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[0].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[0].getWorkout().get(i).getType());
                    }
                }
            }
            if (startView.getWorkoutNumber()==2){

                workoutMenuView.setWorkoutNumber(2);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[1].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[1].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[1].getWorkout().get(i).getType());
                    }
                }
            }
            if (startView.getWorkoutNumber()==3){

                workoutMenuView.setWorkoutNumber(3);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[2].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[2].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[2].getWorkout().get(i).getType());
                    }
                }
            }
            if (startView.getWorkoutNumber()==4){

                workoutMenuView.setWorkoutNumber(4);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[3].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[3].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[3].getWorkout().get(i).getType());
                    }
                }
            }
            if (startView.getWorkoutNumber()==5){

                workoutMenuView.setWorkoutNumber(5);

                new WorkoutMenuController(theModel, workoutMenuView);

                if (!theModel.getWorkouts()[4].getWorkout().isEmpty()) {
                    for (int i = 0; i < theModel.getWorkouts()[4].getWorkout().size(); i++) {
                        workoutMenuView.addExercise(theModel.getWorkouts()[4].getWorkout().get(i).getType());
                    }
                }
            }
        }
    }

}

