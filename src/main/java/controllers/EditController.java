package controllers;

import entities.Targets;
import usecases.EditTarget;

import java.util.Date;
/**
 * Controller to edit a target. Interacts with the UI and usecase to do so
 * @author jhalaksaraogi
 */
public class EditController {
    Targets targets;
    Date date;
    Float value;

    /**
     * @param targets the instance of targets for which  a target is edited
     * @param date the date of the target
     * @param value  value of the target
     */
    public EditController(Targets targets, Date date, Float value){
        this.date = date;
        this.value = value;
        this.targets = targets;
    }

    public void callEdit(){
        EditTarget editTarget = new EditTarget(targets, date, value); // calls the usecase to edit the target
        editTarget.makeEdit();
    }

}
