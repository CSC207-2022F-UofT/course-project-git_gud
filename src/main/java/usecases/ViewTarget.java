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
            return "No targets of this type exist";
        }
        else{
            StringBuilder t = new StringBuilder("Targets are: ");
            for (Target target : targetList) {
                String targetDate = String.valueOf(target.getDate());
                String targetValue = String.valueOf(target.getValue());
                t.append("Date: ").append(targetDate).append(" Value: ").append(targetValue).append("     ");
            }
            return t.toString();
        }
    }
}
