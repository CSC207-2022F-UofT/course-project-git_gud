package views;

import controllers.WorkoutSelectionController;
import management.RoutineManager;

public class RoutineManagerView {

    public static void main(String[] args) {

        WorkoutSelection theView = new WorkoutSelection();

        RoutineManager theModel = new RoutineManager();

        new WorkoutSelectionController(theModel, theView);
    }
}

