package graphing_feature;

import graph_use_case.Bodyweight;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GraphBodyweightTest {


    @Test
    public void TestBodyweightGetCurrent(){
        Bodyweight b = new Bodyweight(100.0F);
        assertTrue(b.getCurrent() == 100.0F);
    }


    @Test
    public void TestBodyweightSetCurrent(){
        Bodyweight b = new Bodyweight(100.0F);
        b.setCurrent(150.0F);
        assertTrue(b.getCurrent() == 150.0F);
    }


}
