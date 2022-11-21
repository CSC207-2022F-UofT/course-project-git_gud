package RoutineManagerModel;

import java.util.Objects;

public class RoutineManager {

    Workout[] workouts;
    Workout workout1;
    Workout workout2;
    Workout workout3;
    Workout workout4;
    Workout workout5;

    RoutineHistory history;

    public RoutineManager() {

        this.workout1 = new Workout();
        this.workout2 = new Workout();
        this.workout3 = new Workout();
        this.workout4 = new Workout();
        this.workout5 = new Workout();

        this.workouts = new Workout[] {workout1, workout2, workout3, workout4, workout5};

        this.history = new RoutineHistory();
    }

    public Workout getWorkout(String workout) {
        if (Objects.equals(workout, "Workout 1")){
            return this.workout1;
        }
        else if (Objects.equals(workout, "Workout 2")){
            return this.workout2;
        }
        else if (Objects.equals(workout, "Workout 3")){
            return this.workout3;
        }
        else if (Objects.equals(workout, "Workout 4")){
            return this.workout4;
        }
        else {
            return this.workout5;
        }


    }

    public void CompleteWorkout(Workout workout) {

        if (workouts[0] == workout) {
            this.history.UpdateHistory("Workout 1");

        } else if (workouts[1] == workout) {
            this.history.UpdateHistory("Workout 2");

        } else if (workouts[2] == workout) {
            this.history.UpdateHistory("Workout 3");

        } else if (workouts[3] == workout) {
            this.history.UpdateHistory("Workout 4");

        } else if (workouts[4] == workout) {
            this.history.UpdateHistory("Workout 5");
        }
    }

    public Workout[] getWorkouts() {
        return this.workouts;
    }

}