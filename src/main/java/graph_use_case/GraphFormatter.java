package graph_use_case;

import views.*;

import java.util.LinkedHashMap;

/**
 * The ResponseFormatter is the Presenter, and its job is to format the output, and then update the view.
 * However as you know I'm still trying to figure out the details of how I will make the graph at the moment,
 * so this class doesn't do much yet.
 *
 */

public class GraphFormatter implements GraphPresenter{

// Need to figure out how to make the presenter do different things depending on the button clicked.
    @Override
    public GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel) {

    // any formatting can be done here before the response model is returned.

        return graphResponseModel;
    }

    @Override
    public GraphResponseModel prepareFailView() {

        ErrorScreen e = new ErrorScreen();
        e.setVisible(true);
        LinkedHashMap l = new LinkedHashMap<>();
        GraphResponseModel g = new GraphResponseModel(l, "abc");
        return g;



    }
}
