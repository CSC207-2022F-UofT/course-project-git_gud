package graph_use_case;

/**
 * Allows the use case interactor to talk to the presenter in a clean way so that there isn't outward dependency.
 */
public interface GraphInputBoundary {
    GraphResponseModel plot(GraphRequestModel requestModel );


}
