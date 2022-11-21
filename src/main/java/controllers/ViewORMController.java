package controllers;

import entities.Target;
import entities.TargetORM;

import java.util.ArrayList;
/**
 * Controller that interacts with both the view model and returns a string of targets
 * @author jhalaksaraogi
 */
public class ViewORMController {
    /**
     * @return a string with the list of targets
     */
    public String viewORM(){
        TargetORM targetORM = TargetORM.getInstance();
        ArrayList<Target> targetORMList = targetORM.targetORMList;
        if (targetORMList.isEmpty()){
            return "No ORM targets exist";
        }
        else{
            String targets = "Targets are: ";
            for (Target target : targetORMList) {
                String targetStr = target.toString();
                targets = target + targetStr + ", ";
            }
            return targets;
        }
    }
}
