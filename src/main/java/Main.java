import controllers.GraphController;
import graph_use_case.GraphFormatter;
import graph_use_case.GraphInteractor;
import views.GraphMenu;
import views.ViewLoginPage;

public class Main{

    public static void main(String[] args) {
//        ViewLoginPage login = new ViewLoginPage();



        GraphFormatter presenter = new GraphFormatter();
        GraphInteractor interactor = new GraphInteractor(presenter);
        GraphController controller = new GraphController(interactor);
        GraphMenu g = new GraphMenu(controller, "abc");

    }
}




