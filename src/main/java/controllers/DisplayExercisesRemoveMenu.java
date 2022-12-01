package controllers;

import management.RoutineManager;
import views.RemoveExerciseMenuView;

/**
 * @author turne142
 */
public interface DisplayExercisesRemoveMenu {

    /**
     * A method which is in charge of displaying all the exercises currently stored in a Workout in
     * RemoveExerciseMenuView.
     * @param theModel a RoutineManager instance where all the data and business methods are stored
     * @param removeExerciseMenuView a RemoveExerciseMenuView instance representing the menu where the exercises are
     *                               displayed.
     * @param workoutNumber an int representing the current workout number for the display (see the JavaDoc in
     *                      WorkoutMenuView for workoutNumber for a more detailed explanation about workout numbers)
     */
    void displayExercises(RoutineManager theModel, RemoveExerciseMenuView removeExerciseMenuView, int workoutNumber);
}
