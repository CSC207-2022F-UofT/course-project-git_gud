package Controllers;

import management.RoutineManager;
import Views.WorkoutMenu;

public interface DisplayExercisesWorkoutMenu {

    public void displayExercises(RoutineManager theModel, WorkoutMenu workoutMenu, int workoutNumber);
}
