package controllers;
import usecases.DeleteTargetORM;

/**
 * Controller that interacts with both the view model and the respective delete usecase.
 * @author jhalaksaraogi
 */
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
