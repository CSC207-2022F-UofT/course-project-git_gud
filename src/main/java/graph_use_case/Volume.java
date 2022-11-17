package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

// Most likely this class will be an instance variable of the exercise class
public class Volume {

    LinkedHashMap<Date, Float> data;

    public void addVolume(Date date, int sets, int reps, Float weight){
        data.put(date, (sets * reps * weight));


    }

}
