package Views;

import Controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public RoutineManagerView() {

        WorkoutSelection theView = new WorkoutSelection();

        RoutineManager theModel = new RoutineManager();

        WorkoutSelectionController theController = new WorkoutSelectionController(theModel, theView);
    }
}

