package graph_use_case;

/**
 * This object essentially gives the graphinteractor everything it needs to do its job.
 * There are also some setters and getters.
 */

public class GraphRequestModel {

    private String username;
    private String buttontext;



    /**
     * Initializes the object
     * @param username Needs to have the username to tell the interactor which of the hashmap keys to look at.
     * @param buttontext Based on the button text, the interactor will get the corresponding data from the database.
     */
    public GraphRequestModel(String username, String buttontext){
        this.username = username;
        this.buttontext = buttontext;
    }

    /**
     * username getter method
     * @return the username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * generic username setter
     * @param username sets the username using this
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * buttontext getter method
     * @return the butontext
     */
    public String getButtontext(){return this.buttontext; }

    /**
     * generic buttontext setter method
     * @param buttontext uses this to set the buttontext
     */
    public void setButtontext(String buttontext) {
        this.buttontext = buttontext;
    }


}
