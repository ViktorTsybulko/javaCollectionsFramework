package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProblems {
    public static void main(String[] args) {
        LinkedList<String> color = LinkedListProblems.createList();

        /*iterateList(color);
        iterateList(color, 2);
        prevIterateList(color);
        insert(color, 2, "Blue");
        addFirstAndLast(color);
        insertSomeElements(color, 3);
        occurrence(color);
        position(color);
        removeElement(color, "White");
        removeFirstAndLast(color);
        clear(color);
        swapElements(color, 2, 4);
        shuffleElements(color);
        joinList(color);
        cloneList(color);
        popElement(color);
        firstElement(color);
        lastElement(color);
        check(color, "dsadsa");
        toArrayList(color);
        compare(color);
        isEmpty(color);*/
    }

    /*
    * 1) Write a Java program to append the specified element to the end of a linked list.
    * */
    public static LinkedList<String> createList() {
        LinkedList<String> color = new LinkedList<>();
        color.add("Blue");
        color.add("White");
        color.add("Black");
        color.add("Pink");
        color.add("Green");
        return color;
    }

    /*
    * 2) Write a Java program to iterate through all elements in a linked list.
    * */
    public static void iterateList(LinkedList<String> color) {

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
    * 3) Write a Java program to iterate through all elements in a linked list starting at the specified position.
    * */
    public static void iterateList(LinkedList<String> color, int from) {
        Iterator<String> p = color.listIterator(from);
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }

    /*
    * 4) Write a Java program to iterate a linked list in reverse order.
    * */
    public static void prevIterateList(LinkedList<String> color) {
        Iterator<String> p = color.descendingIterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }
    }

    /*
    * 5) Write a Java program to insert the specified element at the specified position in the linked list.
    * */
    public static void insert(LinkedList<String> color, int index, String s) {
        System.out.println(color);
        color.set(index, s);
        System.out.println(color);
    }

    /*
    * 6) Write a Java program to insert elements into the linked list at the first and last position.
    * */
    public static void addFirstAndLast(LinkedList<String> color) {
        System.out.println(color);

        color.addFirst("Yellow");
        color.addLast("Red");

        System.out.println(color);
    }

    /*
    * 7) Write a Java program to insert some elements at the specified position into a linked list.
    * */
    public static void insertSomeElements(LinkedList<String> color, int position) {
        System.out.println(color);

        List<String> color2 = new LinkedList<>();
        color2.add("1");
        color2.add("2");
        color.addAll(position, color2);

        System.out.println(color);
    }

    /*
    *  8) Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    * */
    public static void occurrence(LinkedList<String> color) {
        System.out.println("First: " + color.getFirst());
        System.out.println("Last: " + color.getLast());
    }

    /*
    * 9) Write a Java program to display the elements and their positions in a linked list.
    * */
    public static void position(LinkedList<String> color) {
        for (int i = 0; i < color.size(); i++){
            System.out.println(i + " " + color.get(i));
        }
    }

    /*
    * 10) Write a Java program to remove a specified element from a linked list.
    * */
    public static void removeElement(LinkedList<String> color, String element) {
        System.out.println(color);
        color.remove(element);
        System.out.println(color);
    }

    /*
    * 11) Write a Java program to remove first and last element from a linked list.
    * */
    public static void removeFirstAndLast(LinkedList<String> color) {
        System.out.println(color);
        color.removeFirst();
        color.removeLast();
        System.out.println(color);
    }

    /*
    * 12) Write a Java program to remove all the elements from a linked list.
    * */
    public static void clear(LinkedList<String> color) {
        System.out.println(color);
        color.clear();
        System.out.println(color);
    }

    /*
    * 13) Write a Java program of swap two elements in a linked list.
    * */
    public static void swapElements(LinkedList<String> color, int element1, int element2) {
        System.out.println(color);
        Collections.swap(color, element1, element2);
        System.out.println(color);
    }

    /*
    * 14) Write a Java program to shuffle the elements in a linked list.
    * */
    public static void shuffleElements(LinkedList<String> color) {
        System.out.println(color);
        Collections.shuffle(color);
        System.out.println(color);
    }

    /*
    * 15) Write a Java program to join two linked lists.
    * */
    public static void joinList(LinkedList<String> color) {
        LinkedList<String> color2 = LinkedListProblems.createList();
        LinkedList<String> result = new LinkedList<>();

        result.addAll(color);
        result.addAll(color2);

        System.out.println(result);
    }

    /*
    * 16) Write a Java program to clone a linked list to another linked list.
    * */
    public static void cloneList(LinkedList<String> color) {
        LinkedList<String> result = new LinkedList<>(color);
        System.out.println(result);

        LinkedList<String> result2;
        result2 = (LinkedList<String>)color.clone();
        System.out.println(result2);
    }

    /*
    * 17) Write a Java program to remove and return the first element of a linked list.
    * */
    public static void popElement(LinkedList<String> color) {
        System.out.println(color);

        System.out.println("Element: " + color.pop());

        System.out.println(color);
    }

    /*
    * 18) Write a Java program to retrieve but does not remove, the first element of a linked list. Go to the editor
    * */
    public static void firstElement(LinkedList<String> color) {
        System.out.println(color);

        System.out.println(color.peekFirst());

    }

    /*
    * 19) Write a Java program to retrieve but does not remove, the last element of a linked list.
    * */
    public static void lastElement(LinkedList<String> color) {
        System.out.println(color);

        System.out.println(color.peekLast());
    }

    /*
    * 20)  Write a Java program to check if a particular element exists in a linked list.
    * */
    public static void check(LinkedList<String> color, String s) {
        System.out.println(color.contains(s));
    }

    /*
    * 21) Write a Java program to convert a linked list to array list.
    * */
    public static void toArrayList(LinkedList<String> color) {
        List<String> result = new LinkedList<>(color);
        System.out.println(result);
    }

    /*
    * 22) Write a Java program to compare two linked lists.
    * */
    public static void compare(LinkedList<String> color) {
        List<String> color2 = LinkedListProblems.createList();

        Collections.sort(color);
        Collections.sort(color2);

        System.out.println(color.equals(color2));
    }

    /*
    * 23) Write a Java program to test a linked list is empty or not.
    * */
    public static void isEmpty(LinkedList<String> color) {
        if(color.isEmpty()){
            System.out.println("Empty");
        } else {
            System.out.println("not Empty");
        }
    }
}
