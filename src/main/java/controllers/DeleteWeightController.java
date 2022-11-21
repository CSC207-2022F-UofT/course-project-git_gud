package controllers;

import usecases.DeleteTargetORM;
import usecases.DeleteTargetWeight;

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
