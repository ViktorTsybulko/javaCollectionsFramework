package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProblems {
    public static void main(String[] args) {
        ArrayList<String> color = ArrayListProblems.createList();

        /*createList();
        addColor(color);
        iterateList(color);
        getIndex(color, 3);
        update(color, 3, "Green");
        delete(color, 4);
        search(color, "Green");
        sortList(color);
        copy(color);
        shuffleElements(color);
        reverse(color);
        extract(color, 0 , 4);
        compare(color);
        swapElements(color, 2, 3);
        join(color);
        clone(color);
        empty(color);
        isEmpty(color);
        trim(color);
        ensure(color);
        setElement(color, "Green", 2);*/
    }

    /*
     * 1) Write a Java program to create a new array list, add some colors (string) and print out the collection.
     * */
    public static ArrayList<String> createList() {
        ArrayList<String> color = new ArrayList<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Green");
        return color;
    }

    /*
     * 2) Write a Java program to create a new array list, add some colors (string) and print out the collection.
     * */
    public static void addColor(ArrayList<String> color) {
        System.out.println(color);
    }

    /*
     * 3) Write a Java program to iterate through all elements in an array list.
     * */
    public static void iterateList(ArrayList<String> color) {

        System.out.println("-----for-----");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        System.out.println("-----while-----");
        int i = 0;
        while (i < color.size()) {
            System.out.println(color.get(i));
            i++;
        }

        System.out.println("-----for-each-----");
        for (String element : color) {
            System.out.println(element);
        }
    }

    /*
     * 4) Write a Java program to retrieve an element (at a specified index) from a given array list
     * */
    public static void getIndex(ArrayList<String> color, int index) {
        System.out.println(color.get(index));
    }

    /*
     * 5) Write a Java program to update specific array element by given element
     * */
    public static void update(ArrayList<String> color, int index, String s) {
        System.out.println(color);

        color.set(index, s);

        System.out.println(color);
    }

    /*
     * 6) Write a Java program to remove the third element from an array list.
     * */
    public static void delete(ArrayList<String> color, int index) {
        System.out.println(color);

        color.remove(index);

        System.out.println(color);
    }

    /*
     * 7) Write a Java program to search an element in an array list.
     * */
    public static void search(ArrayList<String> color, String s) {
        if (color.contains(s)) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }

    /*
     * 8)Write a Java program to sort a given array list.
     * */
    public static void sortList(ArrayList<String> color) {
        System.out.println(color);

        Collections.sort(color);

        System.out.println(color);
    }

    /*
     * 9) Write a Java program to copy one array list into another.
     * */
    public static void copy(ArrayList<String> color) {
        System.out.println(color);
        ArrayList<String> color2 = new ArrayList<>();
        color2.add("1");
        color2.add("2");
        color2.add("3");
        color2.add("4");
        color2.add("5");
        System.out.println(color2);

        Collections.copy(color2, color);

        System.out.println("result " + color);
    }

    /*
     * 10) Write a Java program to shuffle elements in an array list.
     * */
    public static void shuffleElements(ArrayList<String> color) {
        System.out.println(color);

        Collections.shuffle(color);

        System.out.println(color);
    }

    /*
     * 11) Write a Java program to reverse elements in an array list.
     * */
    public static void reverse(ArrayList<String> color) {
        System.out.println(color);

        Collections.reverse(color);

        System.out.println(color);
    }

    /*
     * 12) Write a Java program to extract a portion of an array list.
     * */
    public static void extract(ArrayList<String> color, int from, int to) {
        System.out.println(color);
        List<String> extract = color.subList(from, to);
        System.out.println(extract);
    }

    /*
     * 13) Write a Java program to compare two array lists.
     * */
    public static void compare(ArrayList<String> color) {
        ArrayList<String> color2 = ArrayListProblems.createList();
        Collections.sort(color);
        Collections.sort(color2);
        System.out.println(color.equals(color2));
    }

    /*
     * 14) Write a Java program of swap two elements in an array list.
     * */
    public static void swapElements(ArrayList<String> color, int element1, int element2) {
        System.out.println(color);

        Collections.swap(color, element1, element2);

        System.out.println(color);
    }

    /*
     * 15) Write a Java program to join two array lists.
     * */
    public static void join(ArrayList<String> color) {
        ArrayList<String> color2 = ArrayListProblems.createList();
        ArrayList<String> result = new ArrayList<>();

        result.addAll(color);
        result.addAll(color2);

        System.out.println(result);
    }

    /*
     * 16) Write a Java program to clone an array list to another array list.
     * */
    public static void clone(ArrayList<String> color) {
        ArrayList<String> result = (ArrayList<String>)color.clone();
        System.out.println(result);
    }

    /*
     * 17) Write a Java program to empty an array list.
     * */
    public static void empty(ArrayList<String> color) {
        color.clear();
        System.out.println(color);
    }

    /*
     * 18) Write a Java program to test an array list is empty or not.
     * */
    public static void isEmpty(ArrayList<String> color) {
        System.out.println(color.isEmpty());
    }

    /*
     * 19)  Write a Java program to trim the capacity of an array list the current list size.
     * */
    public static void trim(ArrayList<String> color) {
        color.trimToSize();
    }

    /*
     * 20) Write a Java program to increase the size of an array list
     * */
    public static void ensure(ArrayList<String> color) {
        color.ensureCapacity(10);

        ArrayList<String> color2 = ArrayListProblems.createList();
        color.addAll(color2);

        System.out.println(color);
    }

    /*
     * 21) Write a Java program to replace the second element of a ArrayList with the specified element.
     * */
    public static void setElement(ArrayList<String> color, String element, int i) {
        System.out.println(color);

        color.set(i, element);

        System.out.println(color);
    }
}