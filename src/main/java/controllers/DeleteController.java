package controllers;

import entities.Targets;
import usecases.DeleteTarget;

public class DeleteController {
    Targets targets;
    public DeleteController(Targets targets){
        this.targets = targets;
    }

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
