package controllers;

import usecases.DeleteTargetORM;
import usecases.DeleteTargetVolume;

public class DeleteVolumeController {
    public String delete(){
        DeleteTargetVolume deleteTargetVolume = new DeleteTargetVolume();
        if(deleteTargetVolume.deleteTargetVolume()){
            return "The most recently added Volume target was deleted";
        }
        else{
            return "No Volume target exists";
        }
    }
}
