package graph_use_case;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ExampleDatabase {


    HashMap<String, LinkedHashMap> bodyweightdata = new LinkedHashMap<>();
    HashMap<String, LinkedHashMap> volumedata = new LinkedHashMap<>();

    HashMap<String, LinkedHashMap> ormdata = new LinkedHashMap<>();

    HashMap<String, LinkedHashMap> targetbodyweightdata = new LinkedHashMap<>();
    HashMap<String, LinkedHashMap> targetvolumedata = new LinkedHashMap<>();

    HashMap<String, LinkedHashMap> targetormdata = new LinkedHashMap<>();




    LinkedHashMap<Date, Float> b = new LinkedHashMap<Date, Float>();
    LinkedHashMap<Date, Float> v = new LinkedHashMap<Date, Float>();

    LinkedHashMap<Date, Float> o = new LinkedHashMap<Date, Float>();
    LinkedHashMap<Date, Float> tb = new LinkedHashMap<Date, Float>();
    LinkedHashMap<Date, Float> tv = new LinkedHashMap<Date, Float>();

    LinkedHashMap<Date, Float> to = new LinkedHashMap<Date, Float>();

    Date d1 = new Date(2022, 10,2);
    Date d2 = new Date(2022, 19,2);
    Date d3 = new Date(2022, 18,2);
    Date d4 = new Date(2022, 10,3);
    Date d5 = new Date(2022, 11,3);

    public ExampleDatabase(){
        b.put(d1, 200.0F);
        b.put(d2, 190.0F);
        b.put(d3, 180.0F);
        b.put(d4, 170.3F);
        b.put(d5, 160.0F);

        v.put(d1, 100.0F);
        v.put(d2, 150.0F);
        v.put(d3, 200.0F);
        v.put(d4, 250.3F);
        v.put(d5, 300.0F);

        o.put(d1, 100.5F);
        o.put(d2, 200.6F);
        o.put(d3, 300.7F);
        o.put(d4, 400.8F);
        o.put(d5, 450.9F);

        tb.put(d1, 300.0F);
        tb.put(d2, 300.0F);
        tb.put(d3, 300.0F);
        tb.put(d4, 300.0F);
        tb.put(d5, 300.0F);

        tv.put(d1, 100.0F);
        tv.put(d2, 100.0F);
        tv.put(d3, 100.0F);
        tv.put(d4, 200.3F);
        tv.put(d5, 30.0F);

        to.put(d1, 100.0F);
        to.put(d2, 150.0F);
        to.put(d3, 200.0F);
        to.put(d4, 250.3F);
        to.put(d5, 300.0F);


        bodyweightdata.put("abc", b);
        volumedata.put("abc", v);
        ormdata.put("abc", o);
        targetbodyweightdata.put("abc", tb);
        targetvolumedata.put("abc", tv);
        targetormdata.put("abcdddd", to);

    }





}
