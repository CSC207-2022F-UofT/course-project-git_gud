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
        this.workout.add("hi");
        this.workout.add("hiiii");
    }

    /**
     * Adds an Exercise object to the workout ArrayList at a specified index.
     * THE exercise PARAMETER SHOULD BE AN Exercise OBJECT BUT I MADE IT A String FOR NOW.
     * @param exercise an Exercise object that will be added to the workout ArrayList.
     * @param index an int representing the specific index at which exercise is inserted.
     */
    public void addExercise(String exercise, int index) {

        this.workout.add(index, exercise);
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
     * @param index an int representing the index in where an Exercise object will be removed from the workout ArrayList.
     */
    public void removeExercise(int index) {

        this.workout.remove(index);
    }

    /**
     * A getter method that returns an ArrayList workout representing all the exercises contained in this workout.
     * @return the list of exercises in workout.
     */
    public ArrayList<String> getWorkout() {
        return this.workout;
    }
}
