package graph_use_case;

import Screens.BodyweightScreen;
import Screens.ErrorScreen;

/**
 * The ResponseFormatter is the Presenter, and its job is to format the output, and then update the view.
 * However as you know I'm still trying to figure out the details of how I will make the graph at the moment,
 * so this class doesn't do much yet.
 *
 */

public class GraphResponseFormatter implements GraphPresenter{

// Need to figure out how to make the presenter do different things depending on the button clicked.
    @Override
    public GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel) {
        BodyweightScreen b = new BodyweightScreen(graphResponseModel.getBodyweightData());
        b.setVisible(true);
        return graphResponseModel;
    }

    @Override
    public GraphResponseModel prepareFailView() {

        ErrorScreen e = new ErrorScreen();
        return null;
    }
}
