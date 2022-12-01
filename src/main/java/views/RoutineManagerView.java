package views;

import controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public RoutineManagerView(RoutineManager userWorkout) {

        WorkoutSelection theView = new WorkoutSelection();
        RoutineManager theModel;
        if (userWorkout == null) {
            theModel = new RoutineManager();
        } else {
            theModel = userWorkout;
        }
        WorkoutSelectionController theController = new WorkoutSelectionController(theModel, theView);
    }
}

