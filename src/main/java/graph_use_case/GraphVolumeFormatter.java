//not in use at the moment


package graph_use_case;
import views.BodyweightScreen;
import views.ErrorScreen;
import views.VolumeScreen;

import java.util.LinkedHashMap;

public class GraphVolumeFormatter implements GraphPresenter{

    @Override
    public GraphResponseModel prepareSuccessView(GraphResponseModel graphResponseModel) {

        VolumeScreen v = new VolumeScreen(graphResponseModel.getData());
        v.setVisible(true);



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
