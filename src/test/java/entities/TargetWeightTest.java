package entities;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TargetWeightTest {
    @Test
    void setTargets() {
        TargetWeight targets;
        targets = new TargetWeight();
        targets.setTargets(targets);
    }

    @Test
    void setTargetList() throws ParseException {
        TargetWeight targets = new TargetWeight();
        Target target = new Target(new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"), 50F);
        ArrayList<Target> list = new ArrayList<>();
        list.add(0,target);
        targets.setTargetList(list);
        assertEquals(list, targets.targetList);
    }

    @Test
    void getInstance() {
        TargetWeight targets = new TargetWeight();
        targets.setTargets(targets);
        assertEquals(targets, Targets.getInstance());
    }


}