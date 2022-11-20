package usecases;

import entities.Target;
import entities.TargetORM;
import entities.TargetVolume;

import java.util.ArrayList;

public class DeleteTargetORM {
    /**
     *
     * @throws Exception if the target list is empty
     * Deletes most recently added target (temporary)
     */
    void deleteTargetVolume() throws Exception {
        TargetORM targetORM = TargetORM.getInstance();
        ArrayList<Target> targetORMList = targetORM.targetORMList;
        if (targetORMList.size() >= 1) {
            targetORMList.remove(targetORMList.size() - 1);   // removes current target
            targetORM.setTargetORMList(targetORMList);
        }
        else{
            throw new Exception("No target for ORM exists");  //throws exception if target list
            // is empty, this exception will be changed to an error message once UI is implemented
        }
    }
}
