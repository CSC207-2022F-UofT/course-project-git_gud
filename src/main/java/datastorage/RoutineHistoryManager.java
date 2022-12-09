package datastorage;

import java.util.ArrayList;
import java.util.Date;

public class RoutineHistoryManager {
    String userName;
    String exerciseName;
    Date date;
    ArrayList<String> weight;
    int set;
    ArrayList<String> rep;
    int oneRepMax;

    RoutineHistoryManager(String un, String en, Date d, ArrayList<String> w, int s, ArrayList<String> r, int orm){
        userName = un;
        exerciseName = en;
        date = d;
        weight = w;
        set = s;
        rep = r;
        oneRepMax = orm;
    }

    /*
    Calls take_in_data method that records all data in DataLibrary which is specific for each user for each date.
     */
    public boolean updateHistory(){
        new DataLibrary(exerciseName, weight, rep, oneRepMax).take_in_data(exerciseName, weight, rep, oneRepMax);
        return true;
    }
}

