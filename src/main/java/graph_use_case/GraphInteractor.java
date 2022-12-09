package graph_use_case;

import java.util.LinkedHashMap;

/**
 * This class connects the input with the output, and also gives the output to the GraphPresenter.
 *
 * THIS CODE USES AN EXAMPLE DATABASE. THIS IS BECAUSE THE PERSON RESPONSIBLE FOR SAVING USER INPUT AND MAKING IT
 * ACCESSIBLE DID NOT DO SO, AND THUS THIS CLASS HAS NOWHERE TO GET THE DATA FROM. BUT IT DOES WORK PERFECTLY USING SOME
 * ARBITRARY DATA.
 *
 * Also, this plot method has a code smell. It's a bloater, but I was running out of time and didn't get to clean it up.
 *
 */

public class GraphInteractor implements GraphInputBoundary {

    final GraphPresenter graphPresenter;


    public GraphInteractor(GraphPresenter graphPresenter){
        this.graphPresenter = graphPresenter;
    }





    /**The plot method takes in a GraphRequestModel as the input. If there is something wrong, for example no data is given
     * in the RequestModel,
     * then it tells the GraphPresenter to give the failure view. Otherwise, it creates a GraphResponseModel object as
     * output, and tells the presenter to use it to prepare the success view.
     *
     * @param requestModel this is an object containing all the information that the interactor needs to
     *                     find the right output in the database
     *
     * @return returns a responsemodel, which has the required data that has been retrieved from the database.
     */
    @Override
    public GraphResponseModel plot(GraphRequestModel requestModel) {
// if buttontext== bodyweight, we get the bodyweight Hashmap from the database
// if buttontext== volume, we get volume Hashmap etc...

//        GraphResponseModel responseModel = new GraphResponseModel( the required LinkedHashmap from the database goes here);
//        return graphPresenter.prepareSuccessView(responseModel);



// below is not the actual code... its just to test using an example database called ExampleDatabase
        ExampleDatabase database = new ExampleDatabase();

        if (requestModel.getButtontext() == "Bodyweight"){
            GraphResponseModel responseModel = new GraphResponseModel(database.bodyweightdata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            if(database.bodyweightdata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }


        if (requestModel.getButtontext() == "Volume") {
            GraphResponseModel responseModel = new GraphResponseModel(database.volumedata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            if(database.volumedata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }

        if (requestModel.getButtontext() == "ORM"){
                GraphResponseModel responseModel = new GraphResponseModel(database.ormdata.get(requestModel.getUsername()),
                        requestModel.getButtontext());
            if(database.ormdata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }




        if (requestModel.getButtontext() == "TargetBodyweight"){
            GraphResponseModel responseModel = new GraphResponseModel(database.targetbodyweightdata.get
                    (requestModel.getUsername()), requestModel.getButtontext());
            if(database.targetbodyweightdata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }
        if (requestModel.getButtontext() == "TargetVolume"){
            GraphResponseModel responseModel = new GraphResponseModel(database.targetvolumedata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            if(database.targetvolumedata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }
        if (requestModel.getButtontext() == "TargetORM"){
            GraphResponseModel responseModel = new GraphResponseModel(database.targetormdata.get(requestModel.getUsername()),
                    requestModel.getButtontext());
            if(database.targetormdata.containsKey(requestModel.getUsername())) {
                return graphPresenter.prepareSuccessView(responseModel);
            }else{
                return graphPresenter.prepareFailView();
            }
        }

        //Try reducing all the if statements by just using the buttontext directly to look up in the database


        return graphPresenter.prepareFailView();
    }


}
