package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 * This is essentially the output generated from the input (the GraphRequestModel). At the moment it only has
 * a bodyweightdata variable, but it should also have volume. It also has some getters and setters.
 */

public class GraphResponseModel {

    private LinkedHashMap<Date, Float> Data;

    public GraphResponseModel(LinkedHashMap<Date, Float> bodyweightData){
        this.Data = bodyweightData;
    }

    public void setBodyweightData(LinkedHashMap<Date, Float> bodyweightData) {
        this.Data = bodyweightData;
    }

    public LinkedHashMap<Date, Float> getBodyweightData(){
        return this.Data;
    }
}
