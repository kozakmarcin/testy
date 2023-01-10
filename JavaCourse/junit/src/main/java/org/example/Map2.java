package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    // https://codingbat.com/prob/p117630

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
//        Arrays.stream(strings).forEach(e -> map.put(e,e.)
    }

    // https://codingbat.com/prob/p126332

    public Map<String, String> pairs(String[] strings) {
        Map<String,String> map = new HashMap<>();
        Arrays.stream(strings).forEach(e -> map.put(e.substring(0,1),e.substring(e.length()-1,e.length())));
        return map;
    }

    // https://codingbat.com/prob/p125327

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String,Integer> wordWithLength = new HashMap<>();
        Arrays.stream(strings).forEach(e ->wordWithLength.put(e,e.length()));
        return wordWithLength;
    }



    // https://codingbat.com/prob/p152303

    public Map<String, Integer> word0(String[] strings) {
        Map<String,Integer> word0map =new HashMap<>();
        Arrays.stream(strings).forEach(e-> word0map.put(e,0));
        return word0map;
    }
}
