package targetTests.controllers;

import controllers.AddController;
import controllers.EditController;
import entities.Targets;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EditControllerTest {
    private static final double TOLERANCE = 0.0001; // for float values
    @Test
    public void editTargets() throws ParseException {
        Targets targets = Targets.getInstance();
        Date date =  new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022");
        AddController addController = new AddController(targets, date, (float) 25.4);
        addController.callAdd();
        EditController editController = new EditController(targets, date, 50F);
        editController.callEdit();
        assertEquals(1, targets.targetList.size());
        float valueOfExistingTarget = targets.targetList.get(0).getValue();
        assertTrue((50 - valueOfExistingTarget) < TOLERANCE); //target value has been edited
    }

}