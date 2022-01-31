package com.company;

import java.util.*;

public class HashSetProblems {
    public static void main(String[] args) {
        HashSet<String> color = HashSetProblems.createSet();

        /*iterate(color);
        count(color);
        clear(color);
        isEmpty(color);
        cloneSet(color);
        toArray(color);
        convertTreeSet(color);
        convertList(color);
        compare(color);
        retain(color);*/
    }

    /*
    * 1) Write a Java program to append the specified element to the end of a hash set.
    * */
    public static HashSet<String> createSet() {
        HashSet<String> color = new HashSet<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Green");
        return color;
    }

    /*
    * 2) Write a Java program to iterate through all elements in a hash list.
    * */
    public static void iterate(HashSet<String> color) {
        for (String s : color) {
            System.out.println(s);
        }

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /*
    * 3) Write a Java program to get the number of elements in a hash set.
    * */
    public static void count(HashSet<String> color) {
        System.out.println(color.size());
    }

    /*
    * 4) Write a Java program to empty a hash set.
    * */
    public static void clear(HashSet<String> color) {
        System.out.println(color);

        color.clear();

        System.out.println(color);
    }

    /*
    * 5) Write a Java program to test a hash set is empty or not.
    * */
    public static void isEmpty(HashSet<String> color) {
        if(color.isEmpty()){
            System.out.println("Empty");
        } else {
            System.out.println("not Empty");
        }
    }

    /*
    * 6) Write a Java program to clone a hash set to another hash set.
    * */
    public static void cloneSet(HashSet<String> color) {
        HashSet<String> result = new HashSet<>(color);
        System.out.println(result);

        HashSet<String> result2;
        result2 = (HashSet<String>)color.clone();
        System.out.println(result2);
    }

    /*
    * 7) Write a Java program to convert a hash set to an array.
    * */
    public static void toArray(HashSet<String> color) {
        String[] colorArr = new String[color.size()];

        color.toArray(colorArr);

        for (String s : colorArr) {
            System.out.println(s);
        }
    }

    /*
    * 8) Write a Java program to convert a hash set to a tree set.
    * */
    public static void convertTreeSet(HashSet<String> color) {
        TreeSet<String> colorTree = new TreeSet<>(color);
        System.out.println(colorTree);
    }

    /*
    * 9) Write a Java program to convert a hash set to a List/ArrayList.
    * */
    public static void convertList(HashSet<String> color) {
        LinkedList<String> colorList = new LinkedList<>(color);
        System.out.println(colorList);
    }

    /*
    * 10) Write a Java program to compare two hash set.
    * */
    public static void compare(HashSet<String> color) {
        System.out.println(color);

        HashSet<String> color1 = HashSetProblems.createSet();

        System.out.println(color1);

        System.out.println(color.equals(color1));
    }

    /*
    * 11) Write a Java program to compare two sets and retain elements which are same on both sets.
    * */
    public static void retain(HashSet<String> color) {
        System.out.println(color);

        HashSet<String> color1 = new HashSet<>();
        color1.add("Blue");
        color1.add("Black");
        color1.add("Purple");
        System.out.println(color1);

        color.retainAll(color1);
        System.out.println(color);
    }

}
