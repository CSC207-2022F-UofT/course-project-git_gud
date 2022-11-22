package graph_use_case;

/**
 * Interface that will be implemented by the GraphResponseFormatter. There are two methods that will be used
 * to update the view in a way that does not violate clean architecture principles.
 */
public interface GraphPresenter {

    GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel);

    GraphResponseModel prepareFailView(String message);

}
