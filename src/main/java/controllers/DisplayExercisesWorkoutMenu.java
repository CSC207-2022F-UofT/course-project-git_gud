package controllers;

import management.RoutineManager;
import views.WorkoutMenuView;

public interface DisplayExercisesWorkoutMenu {

    void displayExercises(RoutineManager theModel, WorkoutMenuView workoutMenuView, int workoutNumber);
}
