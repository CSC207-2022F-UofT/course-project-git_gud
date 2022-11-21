package controllers;

import entities.Target;
import entities.TargetWeight;

import java.util.ArrayList;
/**
 * Controller that interacts with both the view model and returns a string of targets
 * @author jhalaksaraogi
 */
public class ViewWeightController {
    /**
     * @return a string with the list of targets
     */
    public String viewWeight(){
        TargetWeight targetWeight = TargetWeight.getInstance();
        ArrayList<Target> targetWeightList = targetWeight.targetWeightList;
        if (targetWeightList.isEmpty()){
            return "No Weight targets exist";
        }
        else{
            String targets = "Targets are: ";
            for (Target target : targetWeightList) {
                String targetStr = target.toString();
                targets = target + targetStr + ", ";
            }
            return targets;
        }
    }
}
