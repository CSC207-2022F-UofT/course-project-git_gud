package graph_use_case;

/**
 * This is the interface that the interactor will implement. It tells the controller exactly what the interactor needs
 * to do its job.
 */
public interface GraphInputBoundary {

    /**
     *
     * @param requestModel this is the object with the data needed to extract desired info from the database.
     * @return this is the desired, extracted info from the database.
     */
    GraphResponseModel plot(GraphRequestModel requestModel );


}
