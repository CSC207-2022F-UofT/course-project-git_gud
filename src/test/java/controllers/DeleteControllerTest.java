package controllers;

import entities.Targets;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DeleteControllerTest {
    /**
     * test when no target exists
     */
    @Test
    public void deleteNoTargets() {
        Targets targets = Targets.getInstance();
        DeleteController deleteController = new DeleteController(targets);
        String s = deleteController.delete();
        assertEquals(0, targets.targetList.size());
        assertEquals("No such target exists", s);

    }

    /**
     * test to delete the most recently added target
     * @throws ParseException just for date
     */
    @Test
    public void deleteTarget() throws ParseException {
        Targets targets = Targets.getInstance();
        Date date =  new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022");
        AddController addController = new AddController(targets, date, (float) 25.4);
        addController.callAdd();
        assertEquals(1, targets.targetList.size()); //one Target deleted
        DeleteController deleteController = new DeleteController(targets);
        deleteController.delete();
        assertEquals(0, targets.targetList.size()); //no targets exist
    }


}