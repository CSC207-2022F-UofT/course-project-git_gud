package datastorage;

import java.util.ArrayList;
import java.util.Date;

public class RoutineHistoryManager {
    String userName;
    String exerciseName;
    Date date;
    int weight;
    int set;
    int rep;
    int oneRepMax;

    public RoutineHistoryManager(String en, int w, int s, int r, int orm){
        exerciseName = en;
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

