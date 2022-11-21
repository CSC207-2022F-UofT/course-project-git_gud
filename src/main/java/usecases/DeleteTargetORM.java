package usecases;

import entities.Target;
import entities.TargetORM;
import java.util.ArrayList;

/**
 * Usecase to delete the most recently added target ORM
 * @author jhalaksaraogi
 */
public class DeleteTargetORM {
    /**
     * @return true if a target is deleted, false otherwise
     * Deletes most recently added target
     */
    public Boolean deleteTargetORM() {
        TargetORM targetORM = TargetORM.getInstance();
        ArrayList<Target> targetORMList = targetORM.targetORMList;
        if (targetORMList.size() >= 1) {
            targetORMList.remove(targetORMList.size() - 1);   // removes current target
            targetORM.setTargetORMList(targetORMList);
            return true;
        }
        else{
            return false;  //returns false
            // is empty, this exception will be changed to an error message once UI is implemented
        }
    }
}
