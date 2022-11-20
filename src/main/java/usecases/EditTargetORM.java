package usecases;

import entities.Target;
import entities.TargetORM;
import entities.TargetVolume;

import java.util.ArrayList;
import java.util.Date;

public class EditTargetORM {
    Date date;
    Float value;
    /**
     *
     * @param date New Date for the target
     * @param value Mew Value of the target
     * Constructor for this class
     */
    public EditTargetORM(Date date, Float value) {
        this.date = date;
        this.value = value;
    }

    /**
     * Method to remove existing current target and update with new target
     */

    public void makeEdit(){
        Target target = new Target(this.date, this.value);
        TargetORM targetORM = TargetORM.getInstance();
        ArrayList<Target> targetORMList = targetORM.targetORMList;
        if (targetORMList.isEmpty()){
            targetORMList.add(0,target); //editing the target if no target exists, adds the target
        } else if (targetORMList.size() == 1) {
            targetORMList.remove(0);  // removes current target
            targetORMList.add(target);  //updates with new target
        }  else if (targetORMList.size() == 2) {
            targetORMList.remove(1);  // removes current target
            targetORMList.add(target);  //updates with new target
        } else if (targetORMList.size() == 3) {
            targetORMList.remove(2);  // removes current target
            targetORMList.add(target);  //updates with new target
        }

        targetORM.setTargetORMList(targetORMList); //updates class
    }
}
