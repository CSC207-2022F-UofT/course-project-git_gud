package views;

import controllers.WorkoutStartController;
import management.RoutineManager;

public class WorkoutStartViewManager {

    public WorkoutStartViewManager(RoutineManager userWorkout) {
        WorkoutStartView startView = new WorkoutStartView();
        RoutineManager startModel;
        if (userWorkout == null) {
            startModel = new RoutineManager();
        } else {
            startModel = userWorkout;
        }
        WorkoutStartController startController = new WorkoutStartController(startModel, startView);
    }
}
