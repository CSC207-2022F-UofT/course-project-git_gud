package graph_use_case;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Date;

/**
 *  This class will be an instance variable in the class User. It's main function is to keep track of the current
 *  bodyweight as well as a Hashmap of corresponding Dates and bodyweights that are to be plotted.
 */
public class Bodyweight {

    LinkedHashMap<Date, Float> data;
    Float current;

    //Initializes an instance of the bodyweight class for a user that keeps track of current weight and weight over time.
    public Bodyweight(Float currentweight){
        this.data = new LinkedHashMap<Date, Float>();
        this.current = currentweight;

    }

    // adds bodyweight value to the hashmap. Users can use this weekly to keep a record that will then be graphed.
    public void addBodyweight(Date date, Float weight){
        this.data.put(date, weight);
    }

    // getter method to get current weight
    public Float getCurrent(){
        return this.current;
    }


    // setter method to set current weight
    public void setCurrent(Float currentweight){
        this.current = currentweight;
    }


}
