package management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    @Test
    void addExercise() {

        Workout w = new Workout();

        w.addExercise("Push Ups");
        w.addExercise("Chin Ups");
        w.addExercise("Dead lift");

        assertEquals("Push Ups", w.getWorkout().get(0).getType());
        assertEquals("Chin Ups", w.getWorkout().get(1).getType());
        assertEquals("Dead lift", w.getWorkout().get(2).getType());
    }

    @Test
    void customizeExercise() {

        Workout w = new Workout();

        w.addExercise("Push Ups");
        w.addExercise("Chin Ups");
        w.addExercise("Dead lift");

        w.customizeExercise(0,5);
        w.customizeExercise(1,2);
        w.customizeExercise(2,5);

        assertEquals(5, w.getWorkout().get(0).getSets());
        assertEquals(2, w.getWorkout().get(1).getSets());
        assertEquals(5, w.getWorkout().get(2).getSets());
    }

    @Test
    void removeExercise() {

        Workout w = new Workout();

        w.addExercise("Push Ups");
        w.addExercise("Chin Ups");
        w.addExercise("Dead lift");

        w.removeExercise("Chin Ups");

        assertEquals("Dead lift", w.getWorkout().get(1).getType());

        w.removeExercise("Push Ups");

        assertEquals("Dead lift", w.getWorkout().get(0).getType());
    }
}