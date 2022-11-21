import java.util.Scanner;

class Tracker extends Exercises {
    // Records the weight, number of reps in a set, and number of sets

    String typeExercise;
    int weight;
    int rep;
    int set;

    // user will use this method after each workout to record what they just did
    // this method will then call UpdateHistory to send the data to RoutineHistory
    void GetExercise() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the exercise: ");
        System.out.println("Options: Pull-up, Barbell rows\n" +
                "Shoulders: Handstand push ups, Military press, Side lateral raise\n" +
                "Chest: Bench press, Push ups\n" +
                "Legs: Squats, Dead lift\n" +
                "Core: Leg raises, Crunches\n");
        typeExercise = scan.next();

        System.out.println("Enter the weight you'll use for this exercise: ");
        weight = scan.nextInt();

        System.out.println("Enter the number of repetitions: ");
        rep = scan.nextInt();

        System.out.println("Enter the number of sets: ");
        set = scan.nextInt();

        UpdateHistory();
    }

    // Modifies weight, rep, set depending on the input
    void CustomizeSets() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of the exercise you'd like to modify: ");
        typeExercise = scan.next();

        System.out.println("Enter the new weight: ");
        typeExercise = scan.next();
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