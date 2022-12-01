package entities;
import graph_use_case.Bodyweight;
import graph_use_case.Volume;

/**
 * Basic User class. All users should have a username and pass. ExerciseUsers should also have Bodyweight and
 * Volume variables. Also some getters and setters.
 */

public class ExerciseUser implements User{

    private final String username;

    private final String password;

    private Bodyweight bodyweight;

    private Volume volume;



    ExerciseUser(String name, String password){
        this.username = name;
        this.password = password;
        this.bodyweight = new Bodyweight(0.0F);
        this.volume = new Volume();
    }

    public String getusername(){
        return this.username;
    }

    public String getpassword(){
        return this.password;
    }













}
