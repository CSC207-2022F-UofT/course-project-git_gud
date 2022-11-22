package graph_use_case;

import java.util.LinkedHashMap;

/**
 * This class connects the input with the output, and also gives the output to the GraphPresenter. It takes in
 * a GraphRequestModel as the input. If there is something wrong, for example no data is given in the RequestModel,
 * then it tells the GraphPresenter to give the failure view. Otherwise, it creates a GraphResponseModel object as
 * output, and tells the presenter to use it to prepare the success view.
 */

public class GraphInteractor implements GraphInputBoundary {

    final GraphPresenter graphPresenter;


    public GraphInteractor(GraphPresenter graphPresenter){
        this.graphPresenter = graphPresenter;
    }

    @Override
    public GraphResponseModel plot(GraphRequestModel requestModel) {
        if (requestModel.getBodyweightData().isEmpty()){
            return graphPresenter.prepareFailView("There is no data to display");
        }

        GraphResponseModel responseModel = new GraphResponseModel(requestModel.getBodyweightData());
        return graphPresenter.prepareSuccessView(responseModel);
    }


}
