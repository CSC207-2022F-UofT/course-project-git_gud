package controllers;

import management.RoutineManager;
import views.WorkoutMenuView;

public interface DisplayExercisesWorkoutMenu {

    public void displayExercises(RoutineManager theModel, WorkoutMenuView workoutMenuView, int workoutNumber);
}
