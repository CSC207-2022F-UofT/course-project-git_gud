package usecases;

import entities.Target;
import entities.Targets;

import java.util.ArrayList;

public class ViewTarget {
    Targets targets;

    public ViewTarget(Targets targets){
        this.targets = targets;
    }
    /**
     * @return a string with the list of targets
     */
    public String view(){
        Targets targets = Targets.getInstance();
        ArrayList<Target> targetList = targets.targetList;
        if (targetList.isEmpty()){
            return "No ORM targets exist";
        }
        else{
            StringBuilder t = new StringBuilder("Targets are: ");
            for (Target target : targetList) {
                String targetStr = target.toString();
                t.append(targetStr).append(", ");
            }
            return t.toString();
        }
    }
}
