package entities;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TargetTest {
    private static final double TOLERANCE = 0.00001;

    @Test
    void setDate() throws ParseException {
        Target target = new Target(new Date(), 25F);
        target.setDate(new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"));
        assertEquals(target.getDate(), new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022")); //tests
        // this changes the date
    }

    @Test
    void setValue() {
        Target target = new Target(new Date(), 25F);
        target.setValue(500F);
        assertTrue((500F - target.getValue())< TOLERANCE);

    }

    @Test
    void getDate() throws ParseException {
        Target target = new Target(new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"), 25F);
        assertEquals(target.getDate(), new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022"));
    }

    @Test
    void getValue() {
        Target target = new Target(new Date(), 500F);
        assertTrue((500F - target.getValue())< TOLERANCE);
    }
}