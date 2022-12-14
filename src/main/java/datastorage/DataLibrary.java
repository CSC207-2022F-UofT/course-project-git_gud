package datastorage;

import java.util.*;

/*
Represents where all the data are stored: username, exercise type, date, weight used, set, repetition, one rep max.
Format of the data is a dictionary where key is an ArrayList of two elements (username and exercise type),
and value is a list of objects that contain date, weight, set, repetition, and oneRepMax.
 */
public class DataLibrary {

    ArrayList<String> lst_exercises = new ArrayList<String>();
    int[] numbers;
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final HashMap<String, int[]> data;

    public DataLibrary(String en, int w, int r, int orm){
        numbers = new int[]{w, r, orm};
        data = new HashMap<String, int[]>();
    }
    /*
    Saves data into the HashMap where all data gets stored for each user and each date.
    If the exercise already exists, replace it with the new data.
    If not, add the exercise to the list of exercises and record in the HashMap.
     */
    public boolean take_in_data(String en, int w, int r, int orm){

        if (lst_exercises.contains(en)){
            data.remove(en);
            data.put(en, numbers);
        }
        else {
            lst_exercises.add(en);
            data.put(en, numbers);
        }
        return true;
    }
}
