package targetTests.usecases;

import entities.Targets;
import org.junit.jupiter.api.Test;
import usecases.AddTarget;
import usecases.ViewTarget;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ViewTargetTest {
    Targets targets = Targets.getInstance();
    @Test
    public void viewTest() throws ParseException {
        assertEquals(0, targets.targetList.size());
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022");
        AddTarget addTarget = new AddTarget(date, (float) 25.4, targets);
        addTarget.addTarget();
        AddTarget addTarget1 = new AddTarget(date, (float) 50, targets);
        addTarget1.addTarget();
        ViewTarget viewTarget = new ViewTarget(targets);
        assertEquals("Targets are: Date: Mon Dec 12 00:00:00 EST 2022 Value: 25.4     " +
                        "Date: Mon Dec 12 00:00:00 EST 2022 Value: 50.0     " ,
                viewTarget.view());
    }


}