package controllers;

import entities.Targets;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AddControllerTest {

    @Test
    public void addTargets() throws ParseException {
        Targets targets = Targets.getInstance();
        Date date =  new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2022");
        AddController addController = new AddController(targets, date, (float) 25.4);
        addController.callAdd();
        assertEquals(1, targets.targetList.size());
    }


}