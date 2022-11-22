package graph_use_case;

/**
 * The ResponseFormatter is the Presenter, and its job is to format the output, and then update the view.
 * However as you know I'm still trying to figure out the details of how I will make the graph at the moment,
 * so this class doesn't do much yet.
 *
 */

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
