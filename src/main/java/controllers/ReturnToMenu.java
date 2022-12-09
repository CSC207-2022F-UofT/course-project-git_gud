package controllers;

import management.RoutineManager;
import views.WorkoutMenuView;

/**
 * @author turne142
 */
public interface ReturnToMenu {

    /**
     * A method which is in charge of displaying all the exercises currently stored in a Workout in WorkoutMenuView.
     * @param theModel a RoutineManager instance where all the data and business methods are stored
     * @param workoutMenuView a WorkoutMenuView instance representing the menu where the exercises are displayed.
     */
    void returnToMenu(RoutineManager theModel, WorkoutMenuView workoutMenuView);
}
