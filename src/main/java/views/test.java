package views;

import controllers.WorkoutStartController;
import management.RoutineManager;

public class test {

    public static void main(String[] args) {

        RoutineManager theModel = new RoutineManager();

        WorkoutStartView theView = new WorkoutStartView();

        new WorkoutStartController(theModel, theView);
    }
}
