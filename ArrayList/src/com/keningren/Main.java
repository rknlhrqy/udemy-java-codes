package com.keningren;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();

        while (!quit) {
            System.out.println("Input your choice..");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\n0 - To print choice options");
        System.out.println("\n1 - To print list of grocery items");
        System.out.println("\n2 - To add an item to the list");
        System.out.println("\n3 - To modify an item in the list");
        System.out.println("\n4 - To remove an item from the list");
        System.out.println("\n5 - To search an item in the list");
        System.out.println("\n6 - To quit the application");
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        scanner.nextLine();
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Please enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    private static void removeItem() {
        System.out.print("Please enter the item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    private static void searchForItem() {
        System.out.print("Please enter the item name to search: ");
        scanner.nextLine();
        String item = scanner.nextLine();
        if (groceryList.isGroceryItemFound(item)) {
            System.out.println("Item: " + item + " is found in the grocery list");
        } else {
            System.out.println("Item: " + item + " is NOT found in the grocery list");
        }

    }
}
