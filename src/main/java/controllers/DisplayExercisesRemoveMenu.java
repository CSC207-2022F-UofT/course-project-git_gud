package controllers;

import management.RoutineManager;
import views.RemoveExerciseMenuView;

public interface DisplayExercisesRemoveMenu {

    public void displayExercises(RoutineManager theModel, RemoveExerciseMenuView removeExerciseMenuView, int workoutNumber);
}
