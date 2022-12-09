package graphing_feature;

import graph_use_case.ExampleDatabase;
import graph_use_case.GraphFormatter;
import graph_use_case.GraphRequestModel;
import graph_use_case.GraphResponseModel;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class GraphFormatterTest {


    // This test doesn't do much, since the presenter essentially doesn't make any changes to the response model yet.
    // But in the future it could be used for formatting the data in a nicer way for it to be graphed.
    @Test
    public void TestGraphFormatterSuccess(){
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Bodyweight");
        GraphResponseModel graphResponseModel = new GraphResponseModel(data.bodyweightdata.get("abc"),
                graphRequestModel.getButtontext());
        GraphFormatter graphFormatter = new GraphFormatter();

        assertTrue(graphFormatter.prepareSuccessView(graphResponseModel) ==graphResponseModel);
    }

    @Test
    public void TestGraphFormatterFailure(){
        ExampleDatabase data = new ExampleDatabase();
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Bodyweight");
        GraphResponseModel graphResponseModel = new GraphResponseModel(data.bodyweightdata.get("abc"),
                graphRequestModel.getButtontext());
        GraphFormatter graphFormatter = new GraphFormatter();

        assertTrue(graphFormatter.prepareFailView().getData().size() == 0);
    }
}
