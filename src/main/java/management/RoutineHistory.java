package management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents the history of all completed routines and when they were completed.
 * @author turne142
 */
public class RoutineHistory {

    /**
     * completedWorkouts: a HashMap object where there are five keys initialized representing the five workout routines
     * stored in RoutineManager
     * Each key value is an ArrayList object where LocalDate objects representing dates of completion are stored.
     * All keys are initialized with an empty arraylist.
     */
    HashMap<String, ArrayList<LocalDate>> completedWorkouts;

    public RoutineHistory() {

        this.completedWorkouts = new HashMap<String, ArrayList<LocalDate>>();

        this.completedWorkouts.put("Workout 1", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 2", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 3", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 4", new ArrayList<LocalDate>());
        this.completedWorkouts.put("Workout 5", new ArrayList<LocalDate>());

    }

    /**
     * Adds the current date the workout was completed to its respective key in completedWorkouts.
     * Precondition: The parameter that is passed must be one of the five keys stored in completedWorkouts.
     * @param workout a String representing the key where the current LocalDate will be added.
     */
    public void updateHistory(String workout) {

        this.completedWorkouts.get(workout).add(LocalDate.now());
    }

    /**
     * Returns the dates of all workouts that were completed.
     * @return the HashMap object completedWorkouts representing the history of completed workouts
     */
    public HashMap<String, ArrayList<LocalDate>> getCompleted() {

        return this.completedWorkouts;
    }

    /**
     * Returns all the completed workouts within a given year.
     * @param year an int object representing the workouts that were completed in that year. Parameter year MUST be
     *             passed if and only if there are workouts completed in that year.
     * @return a HashMap object where each key is a String value related to the five workouts, and each key stores all
     * the dates in which those workouts were completed in the specific year that was passed.
     */
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

    /**
     * Returns all the completed workouts within a given month.
     * @param month an int object representing the workouts that were completed in that month. Parameter month MUST be
     *              passed if and only if there is at least one workout completed in that month.
     * @return a HashMap object where each key is a String value related to the five workouts, and each key stores all
     * the dates in which those workouts were completed in the specific month that was passed.
     */
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

    /**
     * Returns the dates in which ONE specific workout was completed within a given month.
     * @param month an int object representing the workouts that were completed in that month. Parameter month MUST be
     *              passed if and only if the specific workout has been completed in that month at least once.
     * @param workout a String object that represents the workout we want to check for completion history for the given
     *                month.
     * @return a HashMap object where there is one key String representing the Workout, this key stores all
     * the dates in which that workout was completed in the specific month that was passed.
     */
    public ArrayList<LocalDate> getMonth(int month, String workout) {

        HashMap<String, ArrayList<LocalDate>> hash = this.getMonth(month);

        return hash.get(workout);
    }

    /**
     * Returns the dates in which ONE specific workout was completed within a given year.
     * @param year an int object representing the workouts that were completed in that year. Parameter year MUST be
     *             passed if and only if the specific workout has been completed in that year at least once.
     * @param workout a String object that represents the workout we want to check for completion history for the given
     *                year.
     * @return a HashMap object where there is one key String representing the Workout, this key stores all
     * the dates in which that workout was completed in the specific year that was passed.
     */
    public ArrayList<LocalDate> getYear(int year, String workout) {

        HashMap<String, ArrayList<LocalDate>> hash = this.getYear(year);

        return hash.get(workout);
    }
}
