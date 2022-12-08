package graphing_feature;

import graph_use_case.ExampleDatabase;
import graph_use_case.GraphRequestModel;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GraphResponseModelTest {

    @Test
    public void TestResponseGetUsername() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("user", "Bodyweight");

        assertTrue(graphRequestModel.getUsername() == "user");
    }
}
