package graph_use_case;

import views.BodyweightScreen;
import views.ErrorScreen;
import views.ORMScreen;
import views.VolumeScreen;

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
        if(graphResponseModel.getButtontext() == "Bodyweight") {
            BodyweightScreen b = new BodyweightScreen(graphResponseModel.getData());
            b.setVisible(true);
        }

        if(graphResponseModel.getButtontext() == "Volume"){
            VolumeScreen v = new VolumeScreen(graphResponseModel.getData());
            v.setVisible(true);

        }

        if(graphResponseModel.getButtontext() == "ORM") {
            ORMScreen o = new ORMScreen(graphResponseModel.getData());
            o.setVisible(true);
        }


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
