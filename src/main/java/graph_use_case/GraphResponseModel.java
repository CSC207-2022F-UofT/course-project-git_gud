package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 * This is essentially the output generated from the input (the GraphRequestModel).
 */

public class GraphResponseModel {

    private LinkedHashMap<Date, Float> Data;

    private String buttontext;


    /**
     * This shows what has been retrieved from the database.
     * @param data this represents the corresponding hashmap from the database
     * @param buttontext this determines wihch hashmap will be retrieved (i.e. bodyweight, volume etc.)
     */
    public GraphResponseModel(LinkedHashMap<Date, Float> data, String buttontext){
        this.Data = data;
        this.buttontext = buttontext;
    }

    /**
     * setter for bodyweight data
     * @param bodyweightData uses this to set bodyweight variable
     */
    public void setBodyweightData(LinkedHashMap<Date, Float> bodyweightData) {
        this.Data = bodyweightData;
    }

    /**
     * getter for data
     * @return the data variable
     */
    public LinkedHashMap<Date, Float> getData(){
        return this.Data;
    }

    /**
     * getter for the buttontext
     * @return the buttontext variable
     */
    public String getButtontext(){
        return this.buttontext;
    }
}
