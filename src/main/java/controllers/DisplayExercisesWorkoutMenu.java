package controllers;

import management.RoutineManager;
import views.WorkoutMenu;

public interface DisplayExercisesWorkoutMenu {

    public void displayExercises(RoutineManager theModel, WorkoutMenu workoutMenu, int workoutNumber);
}
