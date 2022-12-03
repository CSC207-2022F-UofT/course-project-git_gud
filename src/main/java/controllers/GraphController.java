package controllers;

import graph_use_case.GraphInputBoundary;
import graph_use_case.GraphRequestModel;
import graph_use_case.GraphResponseModel;

/**
 *When an action is performed on the GraphMenu screen, the controller, GraphController will be called. This class then
 * hands off control to the use case interactor, which implements the GraphInputBoundary.
 */
public class GraphController {


    final GraphInputBoundary interactor;


    public GraphController(GraphInputBoundary inputBoundary){
        this.interactor = inputBoundary;

    }

    public GraphResponseModel plot(String username, String buttondata){
        GraphRequestModel requestModel = new GraphRequestModel(username, buttondata);

        return interactor.plot(requestModel);

    }







}
