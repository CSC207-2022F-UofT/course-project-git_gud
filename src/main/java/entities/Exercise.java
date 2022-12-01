package entities;

/**
 * Basic exercise class with variables for the name of the exercise, the reps, weight and sets. There are also
 * some getters and setters.
 */
public class Exercise {

    String type;
    int reps;

    int sets;

    Float weight;

    public Exercise(String type, int reps, int sets, Float weight) {
        this.type = type;
        this.reps = reps;
        this.sets = sets;
        this.weight = weight;
    }


    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }
    public int getReps(){
        return this.reps;
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    public int getSets(){
        return this.sets;
    }

    public void setSets(int sets){
        this.sets = sets;
    }

    public float getWeight(){
        return this.weight;
    }

    public void setWeight(Float weight){
        this.weight = weight;
    }

}