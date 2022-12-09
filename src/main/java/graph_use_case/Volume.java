package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 *  This class will be an instance variable in the class User. It's main function is to keep track of  a Hashmap of
 *  corresponding Dates and volumes that are to be plotted.
 */
public class Volume {

    LinkedHashMap<Date, Float> data;



    public void addVolume(Date date, int sets, int reps, Float weight) {
        data.put(date, (sets * reps * weight));
    }

    public float getVolumeOnDate(Date date){
        return this.data.get(date);

    }

}
