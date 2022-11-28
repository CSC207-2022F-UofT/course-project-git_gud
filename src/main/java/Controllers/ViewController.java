package Controllers;

import Entities.Targets;
import Usecases.ViewTarget;

/**
 * UI for when view Target option is clicked on the HomeTargetUI screen
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
