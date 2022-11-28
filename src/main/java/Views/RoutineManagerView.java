package Views;

import Controllers.WorkoutSelectionController;
import Management.RoutineManager;

public class RoutineManagerView {

    public static void main(String[] args) {

        WorkoutSelection theView = new WorkoutSelection();

        RoutineManager theModel = new RoutineManager();

        WorkoutSelectionController theController = new WorkoutSelectionController(theModel, theView);
    }
}

