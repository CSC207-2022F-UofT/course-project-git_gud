package RoutineManagerModel;

import java.util.ArrayList;

/**
 * Represents a workout routine in which exercises can be added, removed, or modified.
 * @author turne142
 */
public class Workout {

    /**
     * workout: is an ArrayList object containing Exercise objects representing all the exercises in this workout routine.
     * THE ArrayList TAKES IN STRING FOR NOW, Exercise CLASS NOT IMPLEMENTED YET.
     */
    ArrayList<String> workout;
    public Workout() {

        this.workout = new ArrayList<String>();
        this.workout.add("Tricep Dips");
        this.workout.add("Bicep Curls"); // THESE ARE TEMPORARY UNTIL THE EXERCISE FEATURE IS IMPLEMENTED, FOR TESTING PURPOSES
    }

    /**
     * Adds an Exercise object to the workout ArrayList at a specified index.
     * THE exercise PARAMETER SHOULD BE AN Exercise OBJECT BUT I MADE IT A String FOR NOW.
     * @param exercise an Exercise object that will be added to the workout ArrayList.
     */
    public void addExercise(String exercise) {

        this.workout.add(exercise);
    }

    /**
     * Sets the amount of sets of an exercise at the specified index in the workout ArrayList.
     * CAN'T RUN YET Exercise CLASS NEEDS TO BE IMPLEMENTED.
     * @param index an int object that represents the index of the exercise that will be modified.
     * @param sets an int object representing the number of sets the exercise will have.
     */
//    public void customizeExercise(int index, int sets) {
//
//        workout.get(index).set = sets;
//    }

    /**
     * Removes an exercise from the workout ArrayList from a specified index.
     *
     * @param exercise an int representing the index in where an Exercise object will be removed from the workout ArrayList.
     */
    public void removeExercise(String exercise) {

        this.workout.remove(exercise);
    }

    /**
     * A getter method that returns an ArrayList workout representing all the exercises contained in this workout.
     * @return the list of exercises in workout.
     */
    public ArrayList<String> getWorkout() {
        return this.workout;
    }
}
