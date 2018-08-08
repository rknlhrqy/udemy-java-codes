package com.keningren.linkedlistexport;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
        addInOrder(placesToVisit, "Palm Springs");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("++++++++++++");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal. Do not add.
                System.out.println("City: " + newCity + " already exists");
                return false;
            } else if (comparison > 0) {
                // the city is after new city in English letter order, we need add the
                // new city before the city.
                // Move back to the previous city.
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else { // comparison < 0
                // the city is before new city in English letter order,, we need to add
                // the new city after the city.
                stringListIterator.add(newCity);
                return true;
            }
        }
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = false;

        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting  " + listIterator.next());
        }

        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reach the end of itinerary");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now moving back to " + listIterator.previous());
                    } else {
                        System.out.println("Reach the beginning of itinerary");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void  printMenu() {
        System.out.println("\nAvailable actions:\npress ");
        System.out.println("\n0 - to quit\n1 - go to next city\n2 - go back to previous city\n3 - print menu");
    }
}
