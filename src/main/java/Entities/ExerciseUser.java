package Entities;
import graph_use_case.Bodyweight;
import graph_use_case.Volume;


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










}
