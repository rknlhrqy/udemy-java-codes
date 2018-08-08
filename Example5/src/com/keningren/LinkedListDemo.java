package com.keningren;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Atlanta");
        placeToVisit.add("Orlando");
        placeToVisit.add("Miami");
        placeToVisit.add("Richmong");
        placeToVisit.add("Washington");
        placeToVisit.add("New York");
        placeToVisit.add("Buffalo");
        placeToVisit.add("Summersville");
        placeToVisit.add("Duluth");
        placeToVisit.add("Seatle");

        printLinkedList(placeToVisit);

        placeToVisit.add(1, "San Diego");

        printLinkedList(placeToVisit);

        placeToVisit.remove(4);

        printLinkedList(placeToVisit);

    }

    public static void printLinkedList(LinkedList<String> placeToVisit) {
        //Iterator<String> itr = placeToVisit.iterator();
        ListIterator<String> itr = placeToVisit.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
