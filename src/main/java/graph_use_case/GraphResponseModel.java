package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

public class GraphResponseModel {

    private LinkedHashMap<Date, Float> bodyweightData;

    public GraphResponseModel(LinkedHashMap<Date, Float> bodyweightData){
        this.bodyweightData = bodyweightData;
    }

    public void setBodyweightData(LinkedHashMap<Date, Float> bodyweightData) {
        this.bodyweightData = bodyweightData;
    }

    public LinkedHashMap<Date, Float> getBodyweightData(){
        return this.bodyweightData;
    }
}
