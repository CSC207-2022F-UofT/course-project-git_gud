package WorkoutTracker;
import RoutineManagerModel.RoutineManager;
import RoutineManagerModel.Workout;
import WorkoutViewModel.WorkoutStartView;
import WorkoutViewModel.WorkoutStartViewManager;

public class StartWorkout {

    WorkoutStartViewManager viewManager = new WorkoutStartViewManager();
    public void Start(Workout[] workouts, int index) {
        if (index == 1){
            viewManager.WorkoutStartDisplay(workouts[0], 1);
        }
        else if (index == 2) {
            viewManager.WorkoutStartDisplay(workouts[1], 2);
        }
        else if (index == 3) {
            viewManager.WorkoutStartDisplay(workouts[2], 3);
        }
        else if (index == 4) {
            viewManager.WorkoutStartDisplay(workouts[3], 4);
        }
        else if (index == 5) {
            viewManager.WorkoutStartDisplay(workouts[4], 5);
        }

    }



}
