package targetTests.usecases;

import entities.Targets;
import org.junit.jupiter.api.Test;
import usecases.AddTarget;
import usecases.EditTarget;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class EditTargetTest {
    Targets targets = Targets.getInstance();
    private static final double TOLERANCE = 0.00001;
    @Test
    public void editTargetEmptyTargetList() {
        assertEquals(0, targets.targetList.size());
        EditTarget editTarget = new EditTarget(targets, new Date(), (float) 25.4);
        editTarget.makeEdit();
        assertEquals(1, targets.targetList.size()); //asserts that one target is added to the target list
        // when Edit is called and no target exists
    }
    @Test
    public void editFirstTarget() {
        assertEquals(0, targets.targetList.size());
        AddTarget addTarget = new AddTarget(new Date(), (float) 50.4, targets);
        addTarget.addTarget();
        EditTarget editTarget = new EditTarget(targets, new Date(), (float) 25.4);
        editTarget.makeEdit();
        float valueOfExistingTarget = targets.targetList.get(0).getValue();
        assertTrue((25.4 - valueOfExistingTarget) < TOLERANCE); //asserts that the target's value
        // has been changed to 25.4
    }

}