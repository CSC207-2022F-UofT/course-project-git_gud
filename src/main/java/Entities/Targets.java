package Entities;

import java.util.ArrayList;

public class Targets {
    static Targets targets = null;
    public ArrayList<Target> targetList;

    /**
     *
     * constructor for class TargetWeight
     */
    Targets(){
        targetList = new ArrayList<Target>();
    }

    /**
     *
     * @param targets arraylist of targets
     * setter method
     */

    public void setTargets(Targets targets) {
        Targets.targets = targets;
    }

    /**
     *
     * @param targetList an array list of target weights
     * setter method
     */
    public void setTargetList(ArrayList<Target> targetList) {
        this.targetList = targetList;
    }

    /**
     *
     * @return the instance variable target volume of this class
     */

    public static Targets getInstance(){
        if (targets == null){
            targets = new Targets();
        }
        return targets;
    }
}
