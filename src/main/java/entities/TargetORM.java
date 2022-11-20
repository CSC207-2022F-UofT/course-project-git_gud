package entities;

import java.util.ArrayList;

public class TargetORM {
    static TargetORM targetORM = null;
    public ArrayList<Target> targetORMList;

    /**
     *
     * constructor for class TargetWeight
     */
    private TargetORM(){
        targetORMList = new ArrayList<Target>();
    }

    /**
     *
     * @param targetORM arraylist of target weight
     * setter method
     */

    public void setTargetORM(TargetORM targetORM) {
        TargetORM.targetORM = targetORM;
    }

    public void setTargetORMList(ArrayList<Target> targetORMList) {
        this.targetORMList = targetORMList;
    }

    /**
     *
     * @return the instance variable target weight of this class
     */

    public static TargetORM getInstance(){
        if (targetORM == null){
            targetORM = new TargetORM();
        }
        return targetORM;
    }
}
