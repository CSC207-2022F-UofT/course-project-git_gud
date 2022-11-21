package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.RemoveExerciseMenu;

public interface DisplayExercisesRemoveMenu {

    public void displayExercises(RoutineManager theModel, RemoveExerciseMenu removeExerciseMenu, int workoutNumber);
}
