package controllers;

import entities.Targets;
import usecases.DeleteTarget;

/**
 * Controller to delete a target. Interacts with the UI and usecase to do so
 * @author jhalaksaraogi
 */
public class DeleteController {
    Targets targets;
    public DeleteController(Targets targets){
        this.targets = targets;
    }

    /**
     *
     * @return whether a target is deleted
     */
    public String delete(){
        DeleteTarget deleteTarget = new DeleteTarget(targets);
        if(deleteTarget.deleteTarget()){
            return "The most recently added target was deleted";
        }
        else{
            return "No such target exists";
        }
    }
}
