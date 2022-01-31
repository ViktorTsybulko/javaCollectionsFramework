package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProblems {
    public static void main(String[] args) {
        PriorityQueue<String> color = createQueue();

        //iterate(color);
        //add(color);
        //remove(color);
        //length(color);
        //retrieve(color);
        //retrieveAndRemove(color);
        //toArray(color);
        //converToString(color);

    }

    /*
     * 1) Write a Java program to create a new priority queue, add some colors (string).
     * */
    public static PriorityQueue<String> createQueue() {
        PriorityQueue<String> color = new PriorityQueue<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Green");
        return color;
    }

    /*
     * 2) Write a Java program to iterate through all elements in priority queue.
     * */
    public static void iterate(PriorityQueue<String> color) {
        for (String element : color) {
            System.out.println(element);
        }

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
     * 3) Write a Java program to add all the elements of a priority queue to another priority queue.
     * */
    public static void add(PriorityQueue<String> color) {
        PriorityQueue result = createQueue();

        result.addAll(color);
        System.out.println(result);
    }

    /*
     * 4) Write a Java program to remove all the elements from a priority queue.
     * */
    public static void remove(PriorityQueue<String> color) {
        System.out.println(color);

        color.clear();
        System.out.println(color);
    }

    /*
     * 5) Write a Java program to count the number of elements in a priority queue.
     * */
    public static void length(PriorityQueue<String> color) {
        System.out.println(color.size());
    }

    /*
     * 6) Write a Java program to retrieve the first element of the priority queue.
     * */
    public static void retrieve(PriorityQueue<String> color) {
        System.out.println(color.peek());
    }

    /*
     * 7) Write a Java program to retrieve and remove the first element.
     * */
    public static void retrieveAndRemove(PriorityQueue<String> color) {
        System.out.println(color.poll());
    }

    /*
     * 8) Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
     * */
    public static void toArray(PriorityQueue<String> color) {
        Object[] array = color.toArray();

        System.out.println(Arrays.toString(array));
    }

    /*
     * 9) Write a Java program to convert a Priority Queue elements to a string representation.
     * */
    public static void converToString(PriorityQueue<String> color) {
        String str = color.toString();
        System.out.println(str);
    }
}