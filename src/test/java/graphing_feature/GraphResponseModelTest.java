package graphing_feature;

import graph_use_case.ExampleDatabase;
import graph_use_case.GraphRequestModel;
import graph_use_case.GraphResponseModel;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphResponseModelTest {

    @Test
    public void TestResponseGetDataTrue() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Bodyweight");
        GraphResponseModel graphResponseModel = new GraphResponseModel(data.bodyweightdata.get("abc"),
                graphRequestModel.getButtontext());

        assertTrue(graphResponseModel.getData().values().contains(200.0F));
        assertTrue(graphResponseModel.getData().values().contains(190.0F));
        assertTrue(graphResponseModel.getData().values().contains(170.3F));
    }

    @Test
    public void TestResponseGetDataFalse() {
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Bodyweight");
        GraphResponseModel graphResponseModel = new GraphResponseModel(data.bodyweightdata.get("abc"),
                graphRequestModel.getButtontext());

        assertFalse(graphResponseModel.getData().values().contains(205.0F));
        assertFalse(graphResponseModel.getData().values().contains(1900.0F));
        assertFalse(graphResponseModel.getData().values().contains(171.3F));

    }


    @Test
    public void TestResponseGetButtontext(){

        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Teemo");
        GraphResponseModel graphResponseModel = new GraphResponseModel(data.bodyweightdata.get("abc"),
                graphRequestModel.getButtontext());

        assertTrue(graphResponseModel.getButtontext() == "Teemo");

    }
}
