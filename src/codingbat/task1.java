package codingbat;

import java.util.HashMap;
import java.util.Map;

public class task1 {

    public static void main(String[] args) {

        HashMap<String,String> map= new HashMap<>();

        map.put("b","xyz");
        map.put("c","ccc");

        System.out.println(mapShare(map));

/*
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}*/
    }

    public static Map<String, String> mapShare(Map<String, String> map) {

if(map.keySet().contains("a") && map.keySet().contains("b"))
{
    map.put("ab",map.get("a")+map.get("b"));
}



    return map;
    }
}
