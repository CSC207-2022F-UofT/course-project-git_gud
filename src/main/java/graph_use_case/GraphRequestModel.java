package graph_use_case;

import Entities.User;

import java.util.Date;
import java.util.LinkedHashMap;

public class GraphRequestModel {

    private String username;

    private LinkedHashMap<Date, Float> bodyweightData;

    private LinkedHashMap<Date, Float> volumeData;



    public GraphRequestModel(String username, LinkedHashMap<Date, Float> bodyweightData, LinkedHashMap<Date, Float> volumeData){
        this.username = username;
        this.bodyweightData = bodyweightData;
        this.volumeData = volumeData;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LinkedHashMap<Date, Float> getBodyweightData(){
        return this.bodyweightData;
    }

    public LinkedHashMap<Date, Float> getVolumeData() {
        return this.volumeData;
    }
}
