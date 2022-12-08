package graphing_feature;

import controllers.GraphController;
import graph_use_case.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GraphRequestModelTest {


    @Test
    public void TestRequestGetUsername() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("user", "Bodyweight");

        assertTrue(graphRequestModel.getUsername() == "user");
    }

    @Test
    public void TestRequestGetButtontext() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("user", "Bodyweight");

        assertTrue(graphRequestModel.getButtontext() == "Bodyweight");
    }


    @Test
    public void TestRequestSetUsername() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("user", "Bodyweight");
        graphRequestModel.setUsername("johncena");

        assertTrue(graphRequestModel.getUsername() == "johncena");
    }



}
