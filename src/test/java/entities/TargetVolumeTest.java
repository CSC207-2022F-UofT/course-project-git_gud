package entities;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TargetVolumeTest {
    @Test
    void setTargets() {
        TargetVolume targets;
        targets = new TargetVolume();
        targets.setTargets(targets);
    }

    @Test
    void setTargetList() throws ParseException {
        TargetVolume targets = new TargetVolume();
        Target target = new Target(new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"), 50F);
        ArrayList<Target> list = new ArrayList<>();
        list.add(0,target);
        targets.setTargetList(list);
        assertEquals(list, targets.targetList);
    }

    @Test
    void getInstance() {
        TargetVolume targets = new TargetVolume();
        targets.setTargets(targets);
        assertEquals(targets, Targets.getInstance());
    }

}