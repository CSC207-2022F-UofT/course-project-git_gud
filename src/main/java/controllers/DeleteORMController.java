package controllers;

import usecases.DeleteTargetORM;

public class DeleteORMController {
    public String delete(){
        DeleteTargetORM deleteTargetORM = new DeleteTargetORM();
        if(deleteTargetORM.deleteTargetORM()){
            return "The most recently added ORM target was deleted";
        }
        else{
            return "No ORM target exists";
        }
    }

}
