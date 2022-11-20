package usecases;
import entities.Target;
import entities.TargetWeight;

import java.util.ArrayList;

public class DeleteTargetWeight {
    /**
     *
     * @throws Exception if the target list is empty
     * Deletes most recently added target (temporary)
     */
    void deleteTargetWeight() throws Exception {
        TargetWeight targetWeight = TargetWeight.getInstance();
        ArrayList<Target> targetWeightList = targetWeight.targetWeightList;
        if (targetWeightList.size() >= 1) {
            targetWeightList.remove(targetWeightList.size() - 1);   // removes current target
            targetWeight.setTargetWeightList(targetWeightList);
        }
        else{
            throw new Exception("No target for weight exists");  //throws exception if target list
            // is empty, this exception will be changed to an error message once UI is implemented
        }
    }
}
