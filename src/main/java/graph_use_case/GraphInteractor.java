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


    //will need to check for the corresponding LinkedHashmap that is saved in our database that corresp. to username.
    @Override
    public GraphResponseModel plot(GraphRequestModel requestModel) {
//        if (we check and the requestModel.getbuttontext is empty for the user in the database)
//            return graphPresenter.prepareFailView("There is no data to display");
//        }

// if buttontext== bodyweight, we get the bodyweight Hashmap from the database
// if buttontext== volume, we get volume Hashmap etc...

//        GraphResponseModel responseModel = new GraphResponseModel( the required LinkedHashmap from the database goes here);
//        return graphPresenter.prepareSuccessView(responseModel);


// below is not the actual code... its just to test using an example database called ExampleDatabase
// but the actual code must do the same thing, just from the real database
        ExampleDatabase database = new ExampleDatabase();

        if (!database.bodyweightdata.containsKey(requestModel.getUsername())){
            return graphPresenter.prepareFailView();
        }

        if (requestModel.getButtontext() == "Bodyweight"){
            GraphResponseModel responseModel = new GraphResponseModel(database.bodyweightdata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            return graphPresenter.prepareSuccessView(responseModel);
        }

        if (requestModel.getButtontext() == "Volume") {
            GraphResponseModel responseModel = new GraphResponseModel(database.volumedata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            return graphPresenter.prepareSuccessView(responseModel);
        }

            if (requestModel.getButtontext() == "ORM"){
                GraphResponseModel responseModel = new GraphResponseModel(database.ormdata.get(requestModel.getUsername()),
                        requestModel.getButtontext());
                return graphPresenter.prepareSuccessView(responseModel);


        }
        return graphPresenter.prepareFailView();
    }


}
