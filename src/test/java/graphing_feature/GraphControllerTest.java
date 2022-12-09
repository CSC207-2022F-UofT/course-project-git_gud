package graphing_feature;
import controllers.GraphController;
import graph_use_case.*;
import org.junit.*;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.Assert.*;

public class GraphControllerTest {


//    GraphController controller;
//    ExampleDatabase data;


//    @Before
//    public void setup(){
//        this.data = new ExampleDatabase();
//        GraphPresenter presenter = new GraphFormatter();
//        GraphInteractor interactor = new GraphInteractor(presenter);
//        this.controller = new GraphController(interactor);
//    }

    @Test
    public void TestControllerPlotValuesTrue(){
        ExampleDatabase data = new ExampleDatabase();
        GraphPresenter presenter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(presenter);
        GraphController controller = new GraphController(interactor);
        GraphResponseModel result = controller.plot("abc", "Bodyweight");

        assertTrue(result.getData().values().contains(200.0F));
        assertTrue(result.getData().values().contains(190.0F));
        assertTrue(result.getData().values().contains(180.0F));
        assertTrue(result.getData().values().contains(170.3F));
        assertTrue(result.getData().values().contains(160.0F));



    }

    @Test
    public void TestControllerPlotValuesFalse(){
        ExampleDatabase data = new ExampleDatabase();
        GraphPresenter presenter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(presenter);
        GraphController controller = new GraphController(interactor);
        GraphResponseModel result = controller.plot("abc", "Bodyweight");

        assertFalse(result.getData().values().contains(28.0F));
        assertFalse(result.getData().values().contains(108.0F));
        assertFalse(result.getData().values().contains(333.3F));
    }

    @Test
    public void TestEquality(){
        int x = 5;
        assertEquals(5, x);
    }

    @Test
    public void TestControllerNoUserData(){

        ExampleDatabase data = new ExampleDatabase();
        GraphPresenter presenter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(presenter);
        GraphController controller = new GraphController(interactor);
        GraphResponseModel result = controller.plot("newusername", "Bodyweight");

        assertFalse(result.getData().values().contains(200.0F));
        assertFalse(result.getData().values().contains(190.0F));

    }
}
