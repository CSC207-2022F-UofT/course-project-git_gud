package Usecases;

import Entities.Target;
import Entities.Targets;

import java.util.ArrayList;
import java.util.Date;
/**
 * Usecase to add a target
 * @author jhalaksaraogi
 */
public class AddTarget {
    Date date;
    Float value;
    Targets targets;

    /**
     *
     * @param date Date for the target to be added
     * @param value Value of the target
     *
     * Constructor for this class
     */
    public AddTarget(Date date, Float value, Targets targets) {
        this.date = date;
        this.value = value;
        this.targets = targets;
    }


    /**
     * Adds the most recent target to the end of the list
     * The last else statement removes the oldest target. This ensures that only 3 targets
     * including the current target exist in the ArrayList
     * Lastly sets the targets object as the final arraylist with the newest/current target
     * The newest target is the last element of the arraylist
     */
    public void addTarget(){
        Target target = new Target(this.date, this.value);
        Targets targets = Targets.getInstance();
        ArrayList<Target> targetList = targets.targetList;
        if (targetList.isEmpty()){
            targetList.add(0,target);
        } else if (targetList.size() == 1 || targetList.size() == 2) {
            targetList.add(target);
        } else {
            targetList.remove(0);
            targetList.add(target);
        }
        targets.setTargetList(targetList);
    }
}
