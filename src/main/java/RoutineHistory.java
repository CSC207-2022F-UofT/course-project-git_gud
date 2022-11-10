import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class RoutineHistory {
    HashMap<String, ArrayList<LocalDate>> completed_workouts;

    public RoutineHistory() {

        this.completed_workouts = new HashMap<String, ArrayList<LocalDate>>();

        this.completed_workouts.put("Workout 1", new ArrayList<LocalDate>());
        this.completed_workouts.put("Workout 2", new ArrayList<LocalDate>());
        this.completed_workouts.put("Workout 3", new ArrayList<LocalDate>());
        this.completed_workouts.put("Workout 4", new ArrayList<LocalDate>());
        this.completed_workouts.put("Workout 5", new ArrayList<LocalDate>());

    }

    public void UpdateHistory(String workout) {

        this.completed_workouts.get(workout).add(LocalDate.now());
    }

    public HashMap<String, ArrayList<LocalDate>> getCompleted() {

        return this.completed_workouts;
    }

    public HashMap<String, ArrayList<LocalDate>> getYear(int year) {

        HashMap<String, ArrayList<LocalDate>> hash = new HashMap<String, ArrayList<LocalDate>>();

        for (String i : this.completed_workouts.keySet()) {

            if (!this.completed_workouts.get(i).isEmpty()) {

                hash.put(i, new ArrayList<LocalDate>());

                for (int j=0; j < this.completed_workouts.get(i).size(); j++) {

                    if (this.completed_workouts.get(i).get(j).getYear() == year) {

                        hash.get(i).add(this.completed_workouts.get(i).get(j));
                    }

                }
            }
        }
        return hash;
    }

    public HashMap<String, ArrayList<LocalDate>> getMonth(int month) {

        HashMap<String, ArrayList<LocalDate>> hash = new HashMap<String, ArrayList<LocalDate>>();

        for (String i : this.completed_workouts.keySet()) {

            if (!this.completed_workouts.get(i).isEmpty()) {

                hash.put(i, new ArrayList<LocalDate>());

                for (int j=0; j < this.completed_workouts.get(i).size(); j++) {

                    if (this.completed_workouts.get(i).get(j).getMonthValue() == month) {

                        hash.get(i).add(this.completed_workouts.get(i).get(j));
                    }

                }
            }
        }
        return hash;
    }

    public ArrayList<LocalDate> getMonth(int month, String workout) {

        HashMap<String, ArrayList<LocalDate>> hash = this.getMonth(month);

        return hash.get(workout);
    }

    public ArrayList<LocalDate> getYear(int year, String workout) {

        HashMap<String, ArrayList<LocalDate>> hash = this.getYear(year);

        return hash.get(workout);
    }
}
