package views;

import controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public RoutineManagerView(RoutineManager userWorkout) {

        WorkoutSelectionView theView = new WorkoutSelectionView();
        RoutineManager theModel;
        if (userWorkout == null) {
            theModel = new RoutineManager();
        } else {
            theModel = userWorkout;
        }
        WorkoutSelectionController theController = new WorkoutSelectionController(theModel, theView);
    }
}

