package controllers;

import entities.Target;
import entities.TargetORM;
import entities.Targets;
import usecases.ViewTarget;

import java.util.ArrayList;
/**
 * UI for when view Target option is clicked on the HomeUI screen
 * @author jhalaksaraogi
 */
public class ViewController {
    Targets targets;

    public ViewController(Targets targets){
        this.targets = targets;
    }

    public String view(){
        ViewTarget viewTarget = new ViewTarget(targets);
        return viewTarget.view();
    }
}
