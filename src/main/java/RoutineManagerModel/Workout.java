package RoutineManagerModel;

import java.util.ArrayList;

public class Workout {

    ArrayList<String> workout;
    public Workout() {

        this.workout = new ArrayList<String>();
    }

    public void AddExercise(String exercise, int index) {

        this.workout.add(index, exercise);
    }

//    public void CustomizeExercise(int index, String sets) {
//
//        workout.get(index) = sets;
//    }

    public void RemoveExercise(int index) {

        this.workout.remove(index);
    }

    public ArrayList<String> getWorkout() {
        return this.workout;
    }
}