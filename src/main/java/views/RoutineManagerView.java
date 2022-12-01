package views;

import controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public static void main(String[] args) {
        WorkoutSelectionView theView = new WorkoutSelectionView();

        RoutineManager theModel = new RoutineManager();

        new WorkoutSelectionController(theModel, theView);
    }
}

