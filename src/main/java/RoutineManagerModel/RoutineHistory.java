package RoutineManagerModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class RoutineHistory {
    HashMap<String, ArrayList<LocalDate>> completedWorkouts;

    public RoutineHistory() {

        this.completedWorkouts = new HashMap<String, ArrayList<LocalDate>>();

        this.completedWorkouts.put("Workout 1", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 2", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 3", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 4", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 5", new ArrayList<LocalDate>());

    }


    public void UpdateHistory(String workout) {

        this.completedWorkouts.get(workout).add(LocalDate.now());
    }

    public HashMap<String, ArrayList<LocalDate>> getCompleted() {

        return this.completedWorkouts;
    }

    public HashMap<String, ArrayList<LocalDate>> getCompletedWorkouts(){
        return this.completedWorkouts;
    }

    public HashMap<String, ArrayList<LocalDate>> getYear(int year) {

        HashMap<String, ArrayList<LocalDate>> hash = new HashMap<String, ArrayList<LocalDate>>();

        for (String i : this.completedWorkouts.keySet()) {

            if (!this.completedWorkouts.get(i).isEmpty()) {

                hash.put(i, new ArrayList<LocalDate>());

                for (int j = 0; j < this.completedWorkouts.get(i).size(); j++) {

                    if (this.completedWorkouts.get(i).get(j).getYear() == year) {

                        hash.get(i).add(this.completedWorkouts.get(i).get(j));
                    }

                }
            }
        }
        return hash;
    }

    public HashMap<String, ArrayList<LocalDate>> getMonth(int month) {

        HashMap<String, ArrayList<LocalDate>> hash = new HashMap<String, ArrayList<LocalDate>>();

        for (String i : this.completedWorkouts.keySet()) {

            if (!this.completedWorkouts.get(i).isEmpty()) {

                hash.put(i, new ArrayList<LocalDate>());

                for (int j = 0; j < this.completedWorkouts.get(i).size(); j++) {

                    if (this.completedWorkouts.get(i).get(j).getMonthValue() == month) {

                        hash.get(i).add(this.completedWorkouts.get(i).get(j));
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