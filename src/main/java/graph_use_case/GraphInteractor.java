package graph_use_case;

public class GraphInteractor implements GraphInputBoundary {

    final GraphPresenter graphPresenter;


    public GraphInteractor(GraphPresenter graphPresenter){
        this.graphPresenter = graphPresenter;
    }

    @Override
    public GraphResponseModel plot(GraphRequestModel requestModel) {
        if (requestModel.getBodyweightData().isEmpty()){
            return graphPresenter.prepareFailView(String "There is no data to display");
        }
    }


}
