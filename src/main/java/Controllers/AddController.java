package Controllers;

import Entities.Targets;
import Usecases.AddTarget;

import java.util.Date;

/**
 * Controller to add a target. Interacts with the UI and usecase to do so
 * @author jhalaksaraogi
 */
public class AddController {
    Targets targets;
    Date date;
    Float value;

    /**
     * @param targets the instance of targets to which  a target is added
     * @param date the date of the target
     * @param value  value of the target
     */
    public AddController(Targets targets, Date date, Float value){
        this.date = date;
        this.value = value;
        this.targets = targets;
    }

    public void callAdd(){
        AddTarget addTarget = new AddTarget(date, value, targets); // calls the usecase to add the target
        addTarget.addTarget();
    }
}
