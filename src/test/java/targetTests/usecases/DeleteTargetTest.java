package targetTests.usecases;

import entities.Targets;
import org.junit.jupiter.api.Test;
import usecases.AddTarget;
import usecases.DeleteTarget;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DeleteTargetTest {
    private static final double TOLERANCE = 0.00001;
        Targets targets = Targets.getInstance();
        @Test
        public void deleteOneTarget() {
            assertEquals(0, targets.targetList.size());
            AddTarget addTarget = new AddTarget(new Date(), (float) 25.4, targets);
            addTarget.addTarget();
            assertEquals(1, targets.targetList.size()); //One target was added
            DeleteTarget deleteTarget = new DeleteTarget(targets);
            deleteTarget.deleteTarget();
            assertEquals(0, targets.targetList.size()); //The existing target was deleted
        }
        @Test
        public void deleteSecondTarget(){
            assertEquals(0, targets.targetList.size());
            AddTarget addTarget = new AddTarget(new Date(), (float) 25.4, targets);
            addTarget.addTarget();
            assertEquals(1, targets.targetList.size()); //One target was added
            AddTarget addTarget2 = new AddTarget(new Date(), (float) 50, targets);
            addTarget2.addTarget();  //second target was added
            DeleteTarget deleteTarget = new DeleteTarget(targets);
            deleteTarget.deleteTarget();
            float valueOfExistingTarget = targets.targetList.get(0).getValue();
            assertEquals(1, targets.targetList.size()); // there is only one target in the list
            assertTrue((25.4 - valueOfExistingTarget) < TOLERANCE); //the most recently added target was deleted and the
            // old target still exists in the target list

        }



}
