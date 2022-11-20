package usecases;

import entities.Target;
import entities.TargetWeight;

import java.util.ArrayList;
import java.util.Date;

/**
 * Class to edit the most recent target weight/current target
 */
public class EditTargetWeight {
    Date date;
    Float value;
    /**
     *
     * @param date New Date for the target
     * @param value Mew Value of the target
     * Constructor for this class
     */
    public EditTargetWeight(Date date, Float value) {
        this.date = date;
        this.value = value;
    }

    /**
     * Method to remove existing current target and update with new target
     */

    public void makeEdit(){
        Target target = new Target(this.date, this.value);
        TargetWeight targetWeight = TargetWeight.getInstance();
        ArrayList<Target> targetWeightList = targetWeight.targetWeightList;
        if (targetWeightList.isEmpty()){
            targetWeightList.add(0,target); //editing the target if no target exists, adds the target
        } else if (targetWeightList.size() == 1) {
            targetWeightList.remove(0);  // removes current target
            targetWeightList.add(target);  //updates with new target
        }  else if (targetWeightList.size() == 2) {
            targetWeightList.remove(1);  // removes current target
            targetWeightList.add(target);  //updates with new target
        } else if (targetWeightList.size() == 3) {
            targetWeightList.remove(2);  // removes current target
            targetWeightList.add(target);  //updates with new target
        }

        targetWeight.setTargetWeightList(targetWeightList); //updates class
    }

}
