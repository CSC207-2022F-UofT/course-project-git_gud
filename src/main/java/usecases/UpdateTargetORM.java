package usecases;

import entities.Target;
import entities.TargetORM;
import java.util.ArrayList;
import java.sql.Date;

/**
 * Usecase to add a target ORM
 * @author jhalaksaraogi
 */
public class UpdateTargetORM {
    Date date;
    Float value;

    /**
     *
     * @param date Date for the target to be added
     * @param value Value of the target
     * Constructor for this class
     */
    public UpdateTargetORM(Date date, Float value) {
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
    public void addTargetVolume(){
        Target target = new Target(this.date, this.value);
        TargetORM targetORM = TargetORM.getInstance();
        ArrayList<Target> targetORMList = targetORM.targetORMList;
        if (targetORMList.isEmpty()){
            targetORMList.add(0,target);
        } else if (targetORMList.size() == 1 || targetORMList.size() == 2) {
            targetORMList.add(target);
        } else {
            targetORMList.remove(0);
            targetORMList.add(target);
        }
        targetORM.setTargetORMList(targetORMList);
    }
}
