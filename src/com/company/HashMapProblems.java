package com.company;

import java.util.HashMap;

public class HashMapProblems {
    public static void main(String[] args) {
        HashMap<Integer, String> color = createMap();

        //count(color);
        //copy(color);
        //remove(color);
        //empty(color);
        //shallowCopy(color);
        //containsKey(color, 3);
        //containsValue(color,"White");
        //setView(color);
        //get(color, 3);
        //keyValues(color);

    }

    /*
    * 1) Write a Java program to associate the specified value with the specified key in a HashMap.
    * */
    public static HashMap<Integer, String> createMap() {
        HashMap<Integer, String> color = new HashMap<>();
        color.put(1, "Blue");
        color.put(2, "White");
        color.put(3, "Black");
        color.put(4, "Pink");
        color.put(5, "Green");
        return color;
    }

    /*
    * 2) Write a Java program to count the number of key-value (size) mappings in a map.
    * */
    public static void count(HashMap<Integer, String> color) {
        System.out.println(color.size());
    }

    /*
    * 3)  Write a Java program to copy all the mappings from the specified map to another map.
    * */
    public static void copy(HashMap<Integer, String> color) {
        HashMap<Integer, String> color2 = createMap();
        color2.putAll(color);
        System.out.println(color2);
    }

    /*
    * 4) Write a Java program to remove all the mappings from a map.
    * */
    public static void remove(HashMap<Integer, String> color) {
        System.out.println(color);

        color.clear();

        System.out.println(color);
    }

    /*
    * 5) Write a Java program to check whether a map contains key-value mappings (empty) or not.
    * */
    public static void empty(HashMap<Integer, String> color) {
        System.out.println(color.isEmpty());
    }

    /*
    * 6) Write a Java program to get a shallow copy of a HashMap instance.
    * */
    public static void shallowCopy(HashMap<Integer, String> color) {
        HashMap<Integer,String> newColor;
        newColor = (HashMap<Integer, String>)color.clone();
        System.out.println(newColor);
    }

    /*
    * 7) Write a Java program to test if a map contains a mapping for the specified key.
    * */
    public static void containsKey(HashMap<Integer, String> color, int key ) {
        System.out.println(color.containsKey(key));
    }

    /*
    * 8) Write a Java program to test if a map contains a mapping for the specified value.
    * */
    public static void containsValue(HashMap<Integer, String> color, String value) {
        System.out.println(color.containsValue(value));
    }

    /*
    * 9) Write a Java program to create a set view of the mappings contained in a map.
    * */
    public static void setView(HashMap<Integer, String> color) {
        System.out.println(color.entrySet());
    }

    /*
    * 10) Write a Java program to get the value of a specified key in a map.
    * */
    public static void get(HashMap<Integer, String> color, int key) {
        String s = color.get(key);
        System.out.println(s);
    }

    /*
    * 11) Write a Java program to get a set view of the keys and values contained in this map.
    * */
    public static void keyValues(HashMap<Integer, String> color) {
        System.out.println(color.keySet());
        System.out.println(color.values());
    }
}