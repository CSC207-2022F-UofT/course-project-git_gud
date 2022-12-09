package management;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoutineHistoryTest {

    @Test
    void updateHistory() {

        RoutineHistory h = new RoutineHistory();

        h.updateHistory("Workout 1");
        h.updateHistory("Workout 1");

        h.updateHistory("Workout 2");

        h.updateHistory("Workout 5");
        h.updateHistory("Workout 5");
        h.updateHistory("Workout 5");

        assertEquals(2, h.getCompletedWorkouts().get("Workout 1").size());
        assertEquals(1, h.getCompletedWorkouts().get("Workout 2").size());
        assertEquals(3, h.getCompletedWorkouts().get("Workout 5").size());
    }
}