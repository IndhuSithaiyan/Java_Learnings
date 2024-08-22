package com.java.collectionsframework.collectionInterface.listInterface.linkedList;

import java.util.LinkedList;

public class LinkedList_ {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Red Banana");
        linkedList.add("Grapes");
        System.out.println(linkedList);

        // adding an element in the specified position in the linkedlist
        linkedList.add(1,"Mango");
        System.out.println(linkedList);

        // adding an element at the beginning of the linkedlist
        linkedList.addFirst("Red banana");
        System.out.println(linkedList);

        // adding an element at the end of the linkedlist
        linkedList.addLast("Popcorn");
        System.out.println(linkedList);

        //Note: addFirst(), addLast() methods are come from Deque Interface

        // Retrieve elements from the LinkedLists
        // getting the first element from the linkedlist
        System.out.println(linkedList.getFirst());

        // getting the last element from the linkedlist
        System.out.println(linkedList.getLast());

        // getting the element at the given position from the linkedlist
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.contains("Banana"));
        // find the index of first occurrence of an element in the linkedlist
        System.out.println(linkedList.indexOf("Popcorn"));

        // find the index of last occurrence of an element in the linkedlist
        System.out.println(linkedList.lastIndexOf("Banana"));

        // Remove elements from the Linkedlist
        // remove first element
        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.remove("Mango");
        System.out.println(linkedList);

        linkedList.clear();
        System.out.println(linkedList);
    }
}
