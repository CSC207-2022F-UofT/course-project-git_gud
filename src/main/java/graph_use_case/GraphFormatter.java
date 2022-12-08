package graph_use_case;

import views.*;

import java.util.LinkedHashMap;

/**
 * The ResponseFormatter is the Presenter, and its job is to format the output, and then update the view.
 *
 */

public class GraphFormatter implements GraphPresenter{


    /**
     * This method creates the success screen to be used by the view when things go right. There is space left for
     * formatting the data, even though it's not used for much yet. For example, in the future, the data can be
     * formatted in a particular way so that the dates can be displayed.
     *
     * @param graphResponseModel this is the output from the interactor containing the data needed to plot the graph.
     * @return returns the formatted responsemodel for the view to use.
     */
    @Override
    public GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel) {

    // any formatting can be done here before the response model is returned.

        return graphResponseModel;
    }

    /**
     * Similarly this shows the error message for the view to use when there isn't any data. There is only one
     * error that can occur since the feature just draws a graph, and that error is no data being available. There
     * can't be any errors like the user not existing since to reach the graph feature you would need an account.
     *
     * @return returns a responsemodel and an error mesesage to be displayed.
     */
    @Override
    public GraphResponseModel prepareFailView() {

        ErrorScreen e = new ErrorScreen();
        e.setVisible(true);
        LinkedHashMap l = new LinkedHashMap<>();
        GraphResponseModel g = new GraphResponseModel(l, "abc");
        return g;



    }
}
