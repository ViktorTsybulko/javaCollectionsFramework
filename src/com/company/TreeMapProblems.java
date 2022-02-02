package com.company;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapProblems {
    public static void main(String[] args) {
        TreeMap<Integer, String> color = createMap();
        //copy(color);
        //searchKey(color, 2);
        //searchValue(color, "Blue");
        //getKeys(color);
        //deleteMap(color);
        //sortKey();
        //getFirstAndLastKeyValue(color);
        //getFirstAndLastKey(color);
        //reverse(color);
        //keyValueLessOrEqual(color, 3);
        //keyLessOrEqual(color, 2);
        //keyLess(color, 3);
        //keyGreater(color,2);
        //getNavigableSet(color);
    }

    /*
    * 1) Write a Java program to associate the specified value with the specified key in a Tree Map.
     * */
    public static TreeMap<Integer, String> createMap() {
        TreeMap<Integer, String> color = new TreeMap<>();
        color.put(1, "Blue");
        color.put(2, "White");
        color.put(3, "Black");
        color.put(4, "Pink");
        color.put(5, "Green");
        return color;
    }

    /*
    * 2) Write a Java program to copy a Tree Map content to another Tree Map.
    * */
    public static void copy(TreeMap<Integer, String> color) {
        TreeMap<Integer, String> result = createMap();
        result.putAll(color);
        System.out.println(result);
    }

    /*
    * 3) Write a Java program to search a key in a Tree Map.
    * */
    public static void searchKey(TreeMap<Integer, String> color, int key) {
        System.out.println(color.containsKey(key));
    }

    /*
    * 4) Write a Java program to search a value in a Tree Map
    * */
    public static void searchValue(TreeMap<Integer, String> color, String s) {
        System.out.println(color.containsValue(s));
    }

    /*
    * 5) Write a Java program to get all keys from the given a Tree Map.
     * */
    public static void getKeys(TreeMap<Integer, String> color) {
        System.out.println(color.keySet());
    }

    /*
    * 6) Write a Java program to delete all elements from a given Tree Map.
    * */
    public static void deleteMap(TreeMap<Integer, String> color) {
        System.out.println(color);
        color.clear();
        System.out.println(color);
    }

    /*
    * 7) Write a Java program to sort keys in Tree Map by using comparator.
    * */
    public static void sortKey() {
        TreeMap<String, String> color = new TreeMap<>(new sortKey());
        color.put("5", "Red");
        color.put("2", "Green");
        color.put("3", "Black");
        color.put("4", "White");
        System.out.println(color);
    }

    static class sortKey implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }

    /*
    * 8) Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
    * */
    public static void getFirstAndLastKeyValue(TreeMap<Integer, String> color) {
        System.out.println(color);
        System.out.println(color.firstEntry());
        System.out.println(color.lastEntry());
    }

    /*
    * 9) Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
    * */
    public static void getFirstAndLastKey(TreeMap<Integer, String> color) {
        System.out.println(color);
        System.out.println(color.firstKey());
        System.out.println(color.lastKey());
    }

    /*
    * 10) Write a Java program to get a reverse order view of the keys contained in a given map.
     * */
    public static void reverse(TreeMap<Integer, String> color) {
        System.out.println(color);
        System.out.println(color.descendingKeySet());
    }

    /*
    * 11) Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
    * */
    public static void keyValueLessOrEqual(TreeMap<Integer, String> color, int i) {
        System.out.println(color.floorEntry(i));
    }

    /*
    * 12) Write a Java program to get the greatest key less than or equal to the given key.
     * */
    public static void keyLessOrEqual(TreeMap<Integer, String> color, int i) {
        System.out.println(color.floorKey(i));
    }

    /*
    * 13) Write a Java program to get the portion of a map whose keys are strictly less than a given key.
    * */
    public static void keyLess(TreeMap<Integer, String> color, int i) {
        System.out.println(color.headMap(i));
    }

    /*
    * 14) Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
     * */
    public static void keyGreater(TreeMap<Integer, String> color, int i) {
        System.out.println(color.higherEntry(i));
    }

    /*
    * 15) Write a Java program to get NavigableSet view of the keys contained in a map.
    * */
    public static void getNavigableSet(TreeMap<Integer, String> color) {
        System.out.println(color.navigableKeySet());
    }
}
