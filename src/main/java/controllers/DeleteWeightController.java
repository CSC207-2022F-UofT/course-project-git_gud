package controllers;
import usecases.DeleteTargetWeight;

/**
 * Controller that interacts with both the view model and the respective delete usecase.
 * @author jhalaksaraogi
 */
public class DeleteWeightController {
    public String delete(){
        DeleteTargetWeight deleteTargetWeight = new DeleteTargetWeight();
        if(deleteTargetWeight.deleteTargetWeight()){
            return "The most recently added Weight target was deleted";
        }
        else{
            return "No Weight target exists";
        }
    }
}
