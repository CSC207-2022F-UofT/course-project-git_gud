package usecases;
import entities.Target;
import entities.TargetVolume;
import java.util.ArrayList;
import java.sql.Date;
/**
 * Usecase to edit the most recently added target Volume
 * @author jhalaksaraogi
 */
public class EditTargetVolume {
    Date date;
    Float value;
    /**
     *
     * @param date New Date for the target
     * @param value Mew Value of the target
     * Constructor for this class
     */
    public EditTargetVolume(Date date, Float value) {
        this.date = date;
        this.value = value;
    }

    /**
     * Method to remove existing current target and update with new target
     */

    public void makeEdit(){
        Target target = new Target(this.date, this.value);
        TargetVolume targetVolume = TargetVolume.getInstance();
        ArrayList<Target> targetVolumeList = targetVolume.targetVolumeList;
        if (targetVolumeList.isEmpty()){
            targetVolumeList.add(0,target); //editing the target if no target exists, adds the target
        } else if (targetVolumeList.size() == 1) {
            targetVolumeList.remove(0);  // removes current target
            targetVolumeList.add(target);  //updates with new target
        }  else if (targetVolumeList.size() == 2) {
            targetVolumeList.remove(1);  // removes current target
            targetVolumeList.add(target);  //updates with new target
        } else if (targetVolumeList.size() == 3) {
            targetVolumeList.remove(2);  // removes current target
            targetVolumeList.add(target);  //updates with new target
        }

        targetVolume.setTargetVolumeList(targetVolumeList); //updates class
    }
}
