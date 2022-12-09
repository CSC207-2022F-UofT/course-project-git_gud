package entities;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TargetsTest {

    @Test
    void setTargets() {
        Targets targets = new Targets();
        targets.setTargets(targets);
    }

    @Test
    void setTargetList() throws ParseException {
        Targets targets = new Targets();
        Target target = new Target(new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"), 50F);
        ArrayList<Target> list = new ArrayList<>();
        list.add(0,target);
        targets.setTargetList(list);
        assertEquals(list, targets.targetList);

    }

    @Test
    void getInstance() {
        Targets targets = new Targets();
        targets.setTargets(targets);
        assertEquals(targets, Targets.getInstance());
    }

}