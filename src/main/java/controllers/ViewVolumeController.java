package controllers;

import entities.Target;
import entities.TargetVolume;
import entities.TargetWeight;

import java.util.ArrayList;
/**
 * Controller that interacts with both the view model and returns a string of targets
 * @author jhalaksaraogi
 */
public class ViewVolumeController {
    /**
     * @return a string with the list of targets
     */
    public String viewVolume(){
        TargetVolume targetVolume = TargetVolume.getInstance();
        ArrayList<Target> targetVolumeList = targetVolume.targetVolumeList;
        if (targetVolumeList.isEmpty()){
            return "No Weight targets exist";
        }
        else{
            String targets = "Targets are: ";
            for (Target target : targetVolumeList) {
                String targetStr = target.toString();
                targets = target + targetStr + ", ";
            }
            return targets;
        }
    }
}
