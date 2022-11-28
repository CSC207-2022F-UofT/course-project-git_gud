package usecases;
import entities.Target;
import entities.Targets;

import java.util.ArrayList;

/**
 * usecase to delete target
 * @author jhalaksarogi
 */
public class DeleteTarget {
    public Targets targets;

    public DeleteTarget(Targets targets) {
        this.targets = targets;
    }

    /**
     * @return true if a target is deleted, false otherwise
     * Deletes most recently added target
     */
    public Boolean deleteTarget() {
        Targets targets = Targets.getInstance();
        ArrayList<Target> targetList = targets.targetList;
        if (targetList.size() >= 1) {
            targetList.remove(targetList.size() - 1);   // removes current target
            targets.setTargetList(targetList);
            return true;
        }
        else{
            return false;  //returns false
            // is empty, this exception will be changed to an error message once UI is implemented
        }
    }
}
