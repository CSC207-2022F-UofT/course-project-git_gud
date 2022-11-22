package WorkoutViewModel;

import RoutineManagerModel.Workout;


import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

public class WorkoutStartViewManager extends JFrame {

    Workout workout0 = new Workout();
    static ArrayList<String> workoutTest = new ArrayList<String>();

    public void WorkoutStartDisplay(Workout workout, int index){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WorkoutStartView frame1 = new WorkoutStartView(workout, index);
            }
        });
    }
//    public static void main(String[] args) {
//
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                WorkoutStartView frame1 = new WorkoutStartView();
//            }
//        });
//
//    }
}
