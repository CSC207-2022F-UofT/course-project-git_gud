package targetTests.controllers;

import controllers.AddController;
import controllers.ViewController;
import entities.Targets;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ViewControllerTest {
    @Test
    public void viewTargets() throws ParseException {
        Targets targets = Targets.getInstance();
        Date date =  new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022");
        AddController addController = new AddController(targets, date, (float) 25.4);
        addController.callAdd();
        assertEquals(1, targets.targetList.size());
        AddController addController1 = new AddController(targets, date, (float) 100);
        addController1.callAdd();
        ViewController viewController = new ViewController(targets);
        String s = viewController.view();
        assertEquals("Targets are: Date: Mon Dec 12 00:00:00 EST 2022 Value: 25.4   " +
                        "  Date: Mon Dec 12 00:00:00 EST 2022 Value: 100.0     "
                , s);
    }

}