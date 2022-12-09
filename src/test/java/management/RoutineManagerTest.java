package management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoutineManagerTest {

    @Test
    void completeWorkout() {

        RoutineManager r = new RoutineManager();

        r.getWorkouts()[0].addExercise("Push Ups");
        r.getWorkouts()[0].addExercise("Triceps Dips");
        r.getWorkouts()[0].addExercise("Bench Press");

        r.getWorkouts()[1].addExercise("Dead lift");
        r.getWorkouts()[1].addExercise("Bicep Curl");

        r.getWorkouts()[2].addExercise("Military Press");
        r.getWorkouts()[2].addExercise("Forearm Curl");

        r.getWorkouts()[3].addExercise("Squats");

        r.completeWorkout(r.getWorkouts()[0]);
        r.completeWorkout(r.getWorkouts()[3]);
        r.completeWorkout(r.getWorkouts()[3]);

        assertEquals(1, r.getHistory().completedWorkouts.get("Workout 1").size());
        assertEquals(0, r.getHistory().completedWorkouts.get("Workout 2").size());
        assertEquals(2, r.getHistory().completedWorkouts.get("Workout 4").size());
    }
}