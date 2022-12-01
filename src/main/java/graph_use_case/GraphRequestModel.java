package graph_use_case;

/**
 * The input. There are also some setters and getters.
 */

public class GraphRequestModel {

    private String username;
    private String buttontext;

//    private LinkedHashMap<Date, Float> bodyweightData;
//
//    private LinkedHashMap<Date, Float> volumeData;



    public GraphRequestModel(String username, String buttontext){
        this.username = username;
        this.buttontext = buttontext;
//        this.bodyweightData = bodyweightData;
//        this.volumeData = volumeData;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getButtontext(){return this.buttontext; }

    public void setButtontext(String buttontext) {
        this.buttontext = buttontext;
    }

    //    public LinkedHashMap<Date, Float> getBodyweightData(){
//        return this.bodyweightData;
//    }
//
//    public LinkedHashMap<Date, Float> getVolumeData() {
//        return this.volumeData;
//    }
}
