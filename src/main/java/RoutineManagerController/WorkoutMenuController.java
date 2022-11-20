package RoutineManagerController;

import RoutineManagerModel.RoutineManager;
import RoutineManagerView.WorkoutMenu;
import RoutineManagerView.WorkoutSelection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorkoutMenuController {

    private RoutineManager theModel;
    private WorkoutMenu theView;

    public WorkoutMenuController(RoutineManager theModel, WorkoutMenu theView){

        this.theModel = theModel;

        this.theView = theView;

        this.theView.addWorkoutSelectionDisplay(new WorkoutSelectionDisplay());
    }

    class WorkoutSelectionDisplay implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.dispose();
            WorkoutSelection workoutSelection = new WorkoutSelection();

            WorkoutSelectionController theController = new WorkoutSelectionController(theModel, workoutSelection);
        }
    }

}
