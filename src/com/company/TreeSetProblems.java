package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProblems {
    public static void main(String[] args) {
        TreeSet<String> color = createTreeSet();
        //iterate(color);
        //reverse(color);
        //getLastFirst(color);
        //clone(color);
        //length(color);
        //compare(color);
        //find(7);
        //getGreater(87);
        //retrieve(color, "Green");

    }

    /*
    * 1) Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
    * */
    public static TreeSet<String> createTreeSet() {
        TreeSet<String> color = new TreeSet<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Green");
        return color;
    }

    /*
    * 2) Write a Java program to iterate through all elements in a tree set.
    * */
    public static void iterate(TreeSet<String> color) {
        for (String s : color) {
            System.out.println(s);
        }

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /*
    * 3)  Write a Java program to create a reverse order view of the elements contained in a given tree set.
    * */
    public static void reverse(TreeSet<String> color) {
        System.out.println(color);
        Iterator<String> iterable = color.descendingIterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
    /*
    * 4) Write a Java program to get the first and last elements in a tree set.
    * */
    public static void getLastFirst(TreeSet<String> color) {
        System.out.println(color);

        System.out.println(color.first());
        System.out.println(color.last());
    }

    /*
    * 5)  Write a Java program to clone a tree set list to another tree set.
    * */
    public static void clone(TreeSet<String> color) {
        TreeSet<String> colorClone = new TreeSet<>(color);
        System.out.println(colorClone);

        TreeSet<String> colorClone2 = (TreeSet<String>)color.clone();
        System.out.println(colorClone2);
    }

    /*
    * 6)  Write a Java program to get the number of elements in a tree set.
    * */
    public static void length(TreeSet<String> color) {
        System.out.println(color.size());
    }

    /*
    * 7) Write a Java program to compare two tree sets.
    * */
    public static void compare(TreeSet<String> color) {
        System.out.println(color);

        TreeSet<String> color2 = createTreeSet();
        System.out.println(color2);

        System.out.println(color2.equals(color));
    }

    /*
    * 8) Write a Java program to find the numbers less than 7 in a tree set.
    * */
    public static void find(int i){
        TreeSet <Integer>number = new TreeSet<>();
        TreeSet <Integer>treeHeadSet = (TreeSet)number.headSet(i);

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        Iterator iterator;
        iterator = treeHeadSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

    /*
    * 9) Write a Java program to get the element in a tree set which is greater and less than or equal to the given element.
    * */
    public static void getGreater(int i){
        TreeSet<Integer> number = new TreeSet<>();

        number.add(10);
        number.add(22);
        number.add(36);
        number.add(25);
        number.add(16);
        number.add(70);
        number.add(82);
        number.add(89);
        number.add(14);

        System.out.println(number);

        System.out.println("Greater than or equal to " + i + " : " + number.ceiling(i));
        System.out.println("Less than or equal to " + i + " : " + number.floor(i));
        System.out.println("Strictly greater than " + i + " : " + number.higher(i));
        System.out.println("Strictly less than " + i + " : " + number.lower(i));

    }

    /*
    * 10) Write a Java program to retrieve and remove the first, last, given element of a tree set.
    * */
    public static void retrieve(TreeSet<String> color, String s) {
        System.out.println(color);
        color.pollFirst();

        System.out.println(color);
        color.pollLast();

        System.out.println(color);
        color.remove(s);

        System.out.println(color);
    }
}



