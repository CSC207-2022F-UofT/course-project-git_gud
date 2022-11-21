package usecases;

import entities.Target;
import entities.TargetVolume;
import entities.TargetWeight;

import java.util.ArrayList;
import java.util.Date;
/**
 * Usecase to add a target Volume
 * @author jhalaksaraogi
 */
public class UpdateTargetVolume {
    Date date;
    Float value;

    /**
     *
     * @param date Date for the target to be added
     * @param value Value of the target
     * Constructor for this class
     */
    public UpdateTargetVolume(Date date, Float value) {
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
        TargetVolume targetVolume = TargetVolume.getInstance();
        ArrayList<Target> targetVolumeList = targetVolume.targetVolumeList;
        if (targetVolumeList.isEmpty()){
            targetVolumeList.add(0,target);
        } else if (targetVolumeList.size() == 1 || targetVolumeList.size() == 2) {
            targetVolumeList.add(target);
        } else {
            targetVolumeList.remove(0);
            targetVolumeList.add(target);
        }
        targetVolume.setTargetVolumeList(targetVolumeList);
    }
}
