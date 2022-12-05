package usecases;

import entities.Targets;
import org.junit.jupiter.api.Test;


import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  Test class to test the AddTarget usecase. Checking if the target is being added to the target list
 *  * @author jhalaksaraogi
 */
class AddTargetTest {
    Targets targets = Targets.getInstance();

    @Test
    public void addFourTargets() {
        assertEquals(0, targets.targetList.size());
        AddTarget addTarget = new AddTarget(new Date(), (float) 25.4, targets);
        addTarget.addTarget();
        assertEquals(1, targets.targetList.size()); //asserts that one target is added to the ORM target list.
        AddTarget addTarget1 = new AddTarget(new Date(), (float) 50, targets);
        addTarget1.addTarget();
        assertEquals(2, targets.targetList.size()); //asserts that 2 targets are now added to the ORM target list.
        AddTarget addTarget2 = new AddTarget(new Date(), (float) 60, targets);
        addTarget2.addTarget();
        assertEquals(3, targets.targetList.size()); //asserts that 3 targets are now added to the ORM target list.
        List<Object> listThreeTargets = List.copyOf(targets.targetList);
        AddTarget addTarget3 = new AddTarget(new Date(), (float) 70, targets);
        addTarget3.addTarget();
        assertEquals(3, targets.targetList.size()); //asserts that 1 target is deleted and the newest target is
        // added and the length of the list is still 3
        assertNotEquals(targets.targetList, listThreeTargets); //assert that the list with the fourth added
        // target is not the same as the list before the new target was added, despite their same size

    }
}