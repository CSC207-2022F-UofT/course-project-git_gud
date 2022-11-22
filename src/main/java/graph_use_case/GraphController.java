package graph_use_case;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 *When an action is performed on the GraphMenu screen, the controller, GraphController will be called. This class then
 * hands off control to the use case interactor, which implements the GraphInputBoundary.
 */
public class GraphController {


    final GraphInputBoundary interactor;
//This is the Graph Interactor



    public GraphController(GraphInputBoundary inputBoundary){
        this.interactor = inputBoundary;

    }

    GraphResponseModel plot(String name, LinkedHashMap<Date, Float> bodyweightdata, LinkedHashMap<Date, Float> volumedata){
        GraphRequestModel requestModel = new GraphRequestModel(name, bodyweightdata, volumedata );

        return interactor.plot(requestModel);

    }







}
