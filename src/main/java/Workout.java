import java.util.ArrayList;

public class Workout {

    ArrayList<Exercise> workout;
    public Workout() {

        this.workout = new ArrayList<Exercise>();
    }

    public void AddExercise(Exercise exercise, int index) {

        this.workout.add(index, exercise);
    }

    public void CustomizeExercise(int index, int sets) {

        workout.get(index).sets = sets;
    }

    public void RemoveExercise(int index) {

        this.workout.remove(index);
    }

    public ArrayList<Exercise> getWorkout() {
        return this.workout;
    }
}
