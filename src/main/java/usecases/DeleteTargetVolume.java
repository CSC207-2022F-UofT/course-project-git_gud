package usecases;

import entities.Target;
import entities.TargetVolume;

import java.util.ArrayList;

public class DeleteTargetVolume {
    /**
     *
     * @throws Exception if the target list is empty
     * Deletes most recently added target (temporary)
     */
    void deleteTargetVolume() throws Exception {
        TargetVolume targetVolume = TargetVolume.getInstance();
        ArrayList<Target> targetVolumeList = targetVolume.targetVolumeList;
        if (targetVolumeList.size() >= 1) {
            targetVolumeList.remove(targetVolumeList.size() - 1);   // removes current target
            targetVolume.setTargetVolumeList(targetVolumeList);
        }
        else{
            throw new Exception("No current target for Volume exists");  //throws exception if target list
            // is empty, this exception will be changed to an error message once UI is implemented
        }
    }
}
