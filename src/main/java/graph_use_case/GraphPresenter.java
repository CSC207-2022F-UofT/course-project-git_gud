package graph_use_case;

public interface GraphPresenter {

    GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel);

    GraphResponseModel prepareFailView(String message);

}
