package datastorage;

import java.util.Arrays;
import java.util.Scanner;

class Tracker extends Exercises {
    // Modifies the weight, number of reps in a set, and number of sets

    String typeExercise;
    int weight;
    int rep;
    int set;
    String[] listExercise = {"pullUps", "barbellRow", "handstandPushUps", "militaryPress", "sideLateralRaise", "benchPress",
            "pushUps", "squats", "deadLift", "legRaises", "crunches"};

    // Constructor
    Tracker (String t, int w, int r, int s) {

        // Initializing class variables
        typeExercise = null;
        weight = 0;
        rep = 0;
        set = 0;
    }

    // Modifies weight, rep, set depending on the input
    void CustomizeSets() {
        Scanner scan = new Scanner(System.in);

        boolean contains = false;

        while(!contains) {
            System.out.println("Enter the name of the exercise you'd like to modify: ");
            contains = Arrays.asList(listExercise).contains(scan.next());
            if (contains) {
                typeExercise = scan.next();
            }
        }
        System.out.println("Enter the new weight: ");
        weight = scan.nextInt();

        System.out.println("Enter the new Set: ");
        set = scan.nextInt();

        System.out.println("Enter the new rep: ");
        rep = scan.nextInt();
    }

    // call RoutineHistory
    void UpdateHistory() {
        // Call UpdateHistory method in RoutineHistory class (Implemented by Jake)
        // Commented out because it shows as an error

        // RoutineHistory.UpdateHistory();
    }

    // Records one rep max if there is an input. If there is no input, record as null
    public void RecordOneRepMax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one rep max: ");
        int oneRepMax = scan.nextInt();
        // call RoutineHistory and send oneRepMax
    }
}