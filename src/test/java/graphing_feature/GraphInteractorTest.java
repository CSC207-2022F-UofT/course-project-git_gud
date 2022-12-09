package graphing_feature;

import graph_use_case.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GraphInteractorTest {

    @Test
    public void TestGraphInteractorBodyweightTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Bodyweight");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(200.0F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(190.0F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(170.3F));
    }


    @Test
    public void TestGraphInteractorVolumeTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "Volume");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(100.0F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(150.0F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(200.0F));
    }


    @Test
    public void TestGraphInteractorORMTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "ORM");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(100.5F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(200.6F));
        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(300.7F));
    }

    @Test
    public void TestGraphInteractorTargetBodyweightTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "TargetBodyweight");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(300.0F));

    }

    @Test
    public void TestGraphInteractorTargetVolumeTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abc", "TargetVolume");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(100.0F));

    }


    @Test
    public void TestGraphInteractorTargetORMTrue(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abcd", "TargetORM");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertTrue(interactor.plot(graphRequestModel).getData().values().contains(250.3F));

    }

    @Test
    public void TestGraphInteractorFalse(){
        GraphRequestModel graphRequestModel = new GraphRequestModel("abcd", "TargetORM");
        GraphFormatter graphFormatter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(graphFormatter);


        assertFalse(interactor.plot(graphRequestModel).getData().values().contains(2500.3F));

    }



}
