package controllers;

import management.RoutineManager;
import views.RemoveExerciseMenuView;

public interface DisplayExercisesRemoveMenu {

    void displayExercises(RoutineManager theModel, RemoveExerciseMenuView removeExerciseMenuView, int workoutNumber);
}
