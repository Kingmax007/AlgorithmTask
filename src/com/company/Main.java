package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] a1 = new String[] {"a", "b", "a", "b"};
        System.out.println(wordCount(a1));
        String[] a2 = new String[] {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(a2));
        String[] a3 = new String[] {"c", "b", "a"};
        System.out.println(wordCount(a3));

        System.out.println();

        String[] b1 = new String[] {"salt", "tea", "soda", "toast"};
        System.out.println(firstCharacter(b1));
        String[] b2 = new String[] {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println(firstCharacter(b2));
        String[] b3 = new String[] {};
        System.out.println(firstCharacter(b3));

        System.out.println();

        String[] c1 = new String[] {"code", "bug"};
        System.out.println(charPairs(c1));
        String[] c2 = new String[] {"man", "moon", "main"};
        System.out.println(charPairs(c2));
        String[] c3 = new String[] {"man", "moon", "good", "night"};
        System.out.println(charPairs(c3));

    }
    //Method to Count number of occurrences for each element in the list.

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String tmp : strings) {
            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                map.put(tmp, count + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        return map;
    }
    public static Map<String, String> firstCharacter(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s: strings) {
            String key = s.charAt(0) + "";
            if (map.containsKey(key)) {
                String value = map.get(key) + s;
                map.put(key, value);
            } else
                map.put(key, s);
        }
        return map;
    }

    //Method to add its first character as a key with its last character as the value.

    public static Map<String, String> charPairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String tmp : strings) {
            String first = String.valueOf(tmp.charAt(0));
            String last = String.valueOf(tmp.charAt(tmp.length() - 1));
            map.put(first, last);
        }

        return map;
    }

}