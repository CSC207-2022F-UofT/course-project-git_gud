package controllers;

import management.RoutineManager;
import views.RemoveExerciseMenu;

public interface DisplayExercisesRemoveMenu {

    void displayExercises(RoutineManager theModel, RemoveExerciseMenu removeExerciseMenu, int workoutNumber);
}
