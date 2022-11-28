package Management;

/**
 * Represents the storage and manager of all workout data. Five workout classes will be stored in an array, each workout
 * can be selected to start and complete with completion data being stored in a RoutineHistory instance.
 * @author turne142
 */
public class RoutineManager {

    /**
     * workouts: an Array object that stores five Workout objects.
     * workout1, workout2, workout3, workout4, workout5: Workout objects representing five workout routines stored in
     * workouts. These workouts are each initialized as empty workouts, as in, no exercises.
     * history: a RoutineHistory object that saves data for each workout routine stored in workouts
     */
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

    /**
     * Stores the current date in which a workout was completed to history by calling updateHistory
     * @param workout a Workout object representing the workout that was completed for the current date.
     */
    public void completeWorkout(Workout workout) {

        if (workouts[0] == workout) {
            this.history.updateHistory("Workout 1");

        } else if (workouts[1] == workout) {
            this.history.updateHistory("Workout 2");

        } else if (workouts[2] == workout) {
            this.history.updateHistory("Workout 3");

        } else if (workouts[3] == workout) {
            this.history.updateHistory("Workout 4");

        } else if (workouts[4] == workout) {
            this.history.updateHistory("Workout 5");
        }
    }

    /**
     * Returns an array of all workout routines stored in workouts.
     * @return a Workout[] object representing an array of the five workout routines that were initialized.
     */
    public Workout[] getWorkouts() {
        return this.workouts;
    }

}
