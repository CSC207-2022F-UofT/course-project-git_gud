package entities;

import java.util.ArrayList;

/**
 * This class is a modified example of a singleton class. A singleton class is used usually when
 * there is only one instance of a class throughout the project and there is only one instance of
 * the list of Targets.
 */
public class TargetWeight {
    static TargetWeight targetWeight = null;
    public ArrayList<Target> targetWeightList;

    /**
     *
     * constructor for class TargetWeight
     */
    private TargetWeight(){
        targetWeightList = new ArrayList<Target>();
    }

    /**
     * @param targetWeight sets the instance variable of this class
     * setter method
     */
    public void setTargetWeight(TargetWeight targetWeight) {
        TargetWeight.targetWeight = targetWeight;
    }

    /**
     *
     * @param targetWeightList an ArrayList of targets
     */
    public void setTargetWeightList(ArrayList<Target> targetWeightList) {
        this.targetWeightList = targetWeightList;
    }

    /**
     *
     * @return the instance variable target weight of this class
     */
    public static TargetWeight getInstance(){
        if (targetWeight == null){
            targetWeight = new TargetWeight();
        }
        return targetWeight;
    }
}
