package management;

import entities.Exercise;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a workout routine in which exercises can be added, removed, or modified.
 * @author turne142
 */
public class Workout {

    /**
     * workout: is an ArrayList object containing Exercise objects representing all the exercises in this workout routine.
     * THE ArrayList TAKES IN STRING FOR NOW, Exercise CLASS NOT IMPLEMENTED YET.
     */
    ArrayList<Exercise> workout;
    public Workout() {

        this.workout = new ArrayList<>();
    }

    /**
     * Adds an Exercise object to the workout ArrayList at a specified index.
     * THE exercise PARAMETER SHOULD BE AN Exercise OBJECT BUT I MADE IT A String FOR NOW.
     * @param exercise an Exercise object that will be added to the workout ArrayList.
     */
    public void addExercise(String exercise) {

        Exercise newExercise = new Exercise();
        newExercise.setType(exercise);

        this.workout.add(newExercise);
    }

    /**
     * Sets the amount of sets of an exercise at the specified index in the workout ArrayList.
     * @param index an int object that represents the index of the exercise that will be modified.
     * @param sets an int object representing the number of sets the exercise will have.
     */
    public void customizeExercise(int index, int sets) {

        this.workout.get(index).setSets(sets);
    }

    /**
     * Removes an exercise from the workout ArrayList from a specified index.
     *
     * @param exercise an int representing the index in where an Exercise object will be removed from the workout ArrayList.
     */
    public void removeExercise(String exercise) {

        this.workout.removeIf(x -> Objects.equals(x.getType(), exercise));
    }

    /**
     * A getter method that returns an ArrayList workout representing all the exercises contained in this workout.
     * @return the list of exercises in workout.
     */
    public ArrayList<Exercise> getWorkout() {
        return this.workout;
    }
}
