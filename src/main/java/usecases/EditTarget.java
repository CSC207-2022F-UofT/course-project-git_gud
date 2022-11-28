package usecases;

import entities.Target;
import entities.TargetORM;
import entities.Targets;

import java.util.ArrayList;
import java.util.Date;

public class EditTarget {
    Date date;
    Targets targets;
    Float value;
    /**
     *
     * @param date New Date for the target
     * @param value New Value of the target
     * @param targets The target that needs to be edited
     * Constructor for this class
     */
    public EditTarget(Targets targets, Date date, Float value) {
        this.date = date;
        this.value = value;
        this.targets = targets;
    }

    /**
     * Method to remove existing current target and update with new target
     */

    public void makeEdit(){
        Target target = new Target(this.date, this.value);
        Targets targets = TargetORM.getInstance();
        ArrayList<Target> targetList = targets.targetList;
        if (targetList.isEmpty()){
            targetList.add(0,target); //editing the target if no target exists, adds the target
        } else if (targetList.size() == 1) {
            targetList.remove(0);  // removes current target
            targetList.add(target);  //updates with new target
        }  else if (targetList.size() == 2) {
            targetList.remove(1);  // removes current target
            targetList.add(target);  //updates with new target
        } else if (targetList.size() == 3) {
            targetList.remove(2);  // removes current target
            targetList.add(target);  //updates with new target
        }

        targets.setTargetList(targetList); //updates class
    }
}
