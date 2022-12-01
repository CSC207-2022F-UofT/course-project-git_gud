package views;

import controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public RoutineManagerView() {
        WorkoutSelectionView theView = new WorkoutSelectionView();

        RoutineManager theModel = new RoutineManager();

        new WorkoutSelectionController(theModel, theView);

    }
}
