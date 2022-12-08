package entities;

import java.util.ArrayList;

/**
 * @apiNote This class is a modified example of a singleton class. A singleton class is used usually when
 * there is only one instance of a class throughout the project and there is only one instance of
 * the list of Targets.
 * @author jhalaksaraogi
 */
public class TargetORM extends Targets{
    static TargetORM targetORM = null;
    public ArrayList<Target> targetORMList;

    /**
     *
     * constructor for class TargetWeight
     */
    TargetORM(){
        targetORMList = new ArrayList<Target>();
    }

    /**
     *
     * @param targetORM arraylist of target weight
     * setter method
     */

    public void setTargets(TargetORM targetORM) {
        TargetORM.targetORM = targetORM;
    }

    /**
     *
     * @param targetORMList An arraylist of ORM targets
     * setter method
     */
    public void setTargetList(ArrayList<Target> targetORMList) {
        this.targetORMList = targetORMList;
    }

    /**
     *
     * @return the instance variable target ORM of this class
     */
    public static Targets getInstance(){
        if (targetORM == null){
            targetORM = new TargetORM();
        }
        return targetORM;
    }
}
