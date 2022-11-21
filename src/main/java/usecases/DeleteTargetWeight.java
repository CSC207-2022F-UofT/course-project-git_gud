package usecases;
import entities.Target;
import entities.TargetWeight;
import java.util.ArrayList;
/**
 * Usecase to delete the most recently added target weight
 * @author jhalaksaraogi
 */
public class DeleteTargetWeight {
    /**
     * @return true if a target is deleted, false otherwise
     * Deletes the most recently added target
     */
    public Boolean deleteTargetWeight(){
        TargetWeight targetWeight = TargetWeight.getInstance();
        ArrayList<Target> targetWeightList = targetWeight.targetWeightList;
        if (targetWeightList.size() >= 1) {
            targetWeightList.remove(targetWeightList.size() - 1);   // removes current target
            targetWeight.setTargetWeightList(targetWeightList);
            return true;
        }
        else{
            return false;
        }
    }
}
