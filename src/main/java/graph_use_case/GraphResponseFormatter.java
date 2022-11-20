package graph_use_case;

public class GraphResponseFormatter implements GraphPresenter{

    @Override
    public GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel) {
        return null;
    }

    @Override
    public GraphResponseModel prepareFailView(String message) {
        return null;
    }
}
