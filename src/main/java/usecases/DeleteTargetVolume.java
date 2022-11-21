package usecases;
import entities.Target;
import entities.TargetVolume;
import java.util.ArrayList;

/**
 * Usecase to delete the most recently added target Volume
 * @author jhalaksaraogi
 */
public class DeleteTargetVolume {
    /**
     * @return true if a target is deleted, false otherwise
     *  Deletes the most recently added target
     */
    public Boolean deleteTargetVolume(){
        TargetVolume targetVolume = TargetVolume.getInstance();
        ArrayList<Target> targetVolumeList = targetVolume.targetVolumeList;
        if (targetVolumeList.size() >= 1) {
            targetVolumeList.remove(targetVolumeList.size() - 1);   // removes current target
            targetVolume.setTargetVolumeList(targetVolumeList);
            return true;
        }
        else{
            return false;
        }
    }
}
