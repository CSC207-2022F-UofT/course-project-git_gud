package entities;

import java.util.ArrayList;

/**
 * This class is a modified example of a singleton class. A singleton class is used usually when
 * there is only one instance of a class throughout the project and there is only one instance of
 * the list of Targets.
 */
public class TargetVolume {
    static TargetVolume targetVolume = null;
    public ArrayList<Target> targetVolumeList;

    /**
     *
     * constructor for class TargetWeight
     */
    private TargetVolume(){
        targetVolumeList = new ArrayList<Target>();
    }

    /**
     *
     * @param targetVolume arraylist of target volume
     * setter method
     */

    public void setTargetVolume(TargetVolume targetVolume) {
        TargetVolume.targetVolume = targetVolume;
    }

    /**
     *
     * @param targetWeightList an array list of target weights
     * setter method
     */
    public void setTargetVolumeList(ArrayList<Target> targetWeightList) {
        this.targetVolumeList = targetWeightList;
    }

    /**
     *
     * @return the instance variable target volume of this class
     */

    public static TargetVolume getInstance(){
        if (targetVolume == null){
            targetVolume = new TargetVolume();
        }
        return targetVolume;
    }
}
