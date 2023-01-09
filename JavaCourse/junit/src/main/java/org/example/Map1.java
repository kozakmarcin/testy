package org.example;

import java.util.Map;

public class Map1 {


    // https://codingbat.com/prob/p197888

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && !map.get("a").isEmpty()){
            map.put("b",map.get("a"));
            map.replace("a","");
        }
        return map;
    }
}
