package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.WorkoutMenu;

public interface DisplayExercisesWorkoutMenu {

    public void displayExercises(RoutineManager theModel, WorkoutMenu workoutMenu, int workoutNumber);
}
