package usecases;

import entities.Target;
import entities.TargetWeight;

import java.util.ArrayList;
import java.util.Date;

public class UpdateTargetWeight {
    Date date;
    Float value;

    /**
     *
     * @param date Date for the target to be added
     * @param value Value of the target
     * Constructor for this class
     */
    public UpdateTargetWeight(Date date, Float value) {
        this.date = date;
        this.value = value;
    }

    /**
     * Adds the most recent target to the end of the list
     * The last else statement removes the oldest target. This ensures that only 3 targets
     * including the current target exist in the ArrayList
     * Lastly sets the targetWeight object as the final arraylist with the newest/current target
     * The newest target is the last element of the arraylist
     */
    public void addTargetWeight(){
        Target target = new Target(this.date, this.value);
        TargetWeight targetWeight = TargetWeight.getInstance();
        ArrayList<Target> targetWeightList = targetWeight.targetWeightList;
        if (targetWeightList.isEmpty()){
           targetWeightList.add(0,target);
        } else if (targetWeightList.size() == 1 || targetWeightList.size() == 2) {
            targetWeightList.add(target);
        } else {
            targetWeightList.remove(0);
            targetWeightList.add(target);
        }
        targetWeight.setTargetWeightList(targetWeightList);
    }
}
