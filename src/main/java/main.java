import Screens.GraphMenu;
import controllers.GraphController;
import graph_use_case.GraphInteractor;
import graph_use_case.GraphResponseFormatter;

import java.text.ParseException;

public class main {


    public static void main(String[] args) throws ParseException {

//        Date d1 = new Date(2022, 10,2);
//        Date d2 = new Date(2022, 19,2);
//        Date d3 = new Date(2022, 18,2);
//        Date d4 = new Date(2022, 10,3);
//        Date d5 = new Date(2022, 11,3);
//        Date d = new SimpleDateFormat("dd/MM/yyyy").parse("09/09/2056");
//
//
//        LinkedHashMap<Date, Float> l = new LinkedHashMap<Date, Float>();
//        l.put(d1, 27.0F);
//        l.put(d2, 316.0F);
//        l.put(d3, 5.0F);
//        l.put(d4, 34.3F);
//        l.put(d5, 101.0F);
//        l.put(d, 200.0F);
//
//        BodyweightScreen b = new BodyweightScreen(l);
//        b.setVisible(true);

        GraphResponseFormatter presenter = new GraphResponseFormatter();
        GraphInteractor interactor = new GraphInteractor(presenter);
        GraphController controller = new GraphController(interactor);
        GraphMenu g = new GraphMenu(controller, "abc");
    }
}
