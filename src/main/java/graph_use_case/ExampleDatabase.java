package graph_use_case;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ExampleDatabase {


    HashMap<String, LinkedHashMap> bodyweightdata = new LinkedHashMap<>();
    HashMap<String, LinkedHashMap> volumedata = new LinkedHashMap<>();

    LinkedHashMap<Date, Float> b = new LinkedHashMap<Date, Float>();
    LinkedHashMap<Date, Float> v = new LinkedHashMap<Date, Float>();

    Date d1 = new Date(2022, 10,2);
    Date d2 = new Date(2022, 19,2);
    Date d3 = new Date(2022, 18,2);
    Date d4 = new Date(2022, 10,3);
    Date d5 = new Date(2022, 11,3);

    public ExampleDatabase(){
        b.put(d1, 27.0F);
        b.put(d2, 316.0F);
        b.put(d3, 5.0F);
        b.put(d4, 34.3F);
        b.put(d5, 101.0F);

        v.put(d1, 100.0F);
        v.put(d2, 150.0F);
        v.put(d3, 150.0F);
        v.put(d4, 250.3F);
        v.put(d5, 101.0F);

        bodyweightdata.put("abc", b);
        volumedata.put("abc", v);

    }





}
