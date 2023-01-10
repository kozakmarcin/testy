package org.example;

import java.util.Map;

public class Map1 {
    // https://codingbat.com/prob/p136950

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length() == (map.get("b")).length()) {
                map.replace("a","");
                map.replace("b","");
            } else if(map.get("a").length()>map.get("b").length()) map.put("c",map.get("a"));
            else map.put("c",map.get("b"));
        }
        return map;
    }

    // https://codingbat.com/prob/p115012

    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("b")) map.putIfAbsent("a",map.get("b"));
        if (map.containsKey("a")) map.putIfAbsent("b",map.get("a"));
        return map;
    }

    // https://codingbat.com/prob/p115011

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")
                && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    // https://codingbat.com/prob/p128461

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) map.put("fries", map.get("potato"));
        if (map.containsKey("salad")) map.put("spinach",map.get("salad"));
        return map;
    }

    // https://codingbat.com/prob/p196458

    public Map<String, String> topping2(Map<String, String> map) {
        if(map.containsKey("ice cream")) map.put("yogurt",map.get("ice cream"));
        if(map.containsKey("spinach")) map.replace("spinach","nuts");
        return map;
    }

    // https://codingbat.com/prob/p182712
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread","butter");
        if(map.containsKey("ice cream")) map.put("ice cream", "cherry");
        return map;
    }

    // https://codingbat.com/prob/p107259

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) map.put("ab", map.get("a")+ map.get("b"));
        return map;
    }


    // https://codingbat.com/prob/p148813

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if(map.containsKey("a")) map.put("b",map.get("a"));
        return map;
    }

    // https://codingbat.com/prob/p197888

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a") && !map.get("a").isEmpty()){
            map.put("b",map.get("a"));
            map.replace("a","");
        }
        return map;
    }
}
