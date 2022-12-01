package graph_use_case;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ExampleDatabase {


    HashMap<String, LinkedHashMap> data = new LinkedHashMap<>();
    LinkedHashMap<Date, Float> l = new LinkedHashMap<Date, Float>();

    Date d1 = new Date(2022, 10,2);
    Date d2 = new Date(2022, 19,2);
    Date d3 = new Date(2022, 18,2);
    Date d4 = new Date(2022, 10,3);
    Date d5 = new Date(2022, 11,3);

    public ExampleDatabase(){
        l.put(d1, 27.0F);
        l.put(d2, 316.0F);
        l.put(d3, 5.0F);
        l.put(d4, 34.3F);
        l.put(d5, 101.0F);

        data.put("abc", l);

    }



}
