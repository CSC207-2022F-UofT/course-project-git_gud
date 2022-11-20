package RoutineManagerView;

import RoutineManagerController.WorkoutSelectionController;
import RoutineManagerModel.RoutineManager;

public class RoutineManagerView {

    public static void main(String[] args) {

        WorkoutSelection theView = new WorkoutSelection();

        RoutineManager theModel = new RoutineManager();

        WorkoutSelectionController theController = new WorkoutSelectionController(theModel, theView);
    }
}

