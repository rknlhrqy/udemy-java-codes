package com.keningren;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        if (groceryList.size() == 0) {
            System.out.println("No item in the Grocery list");
            return;
        }
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item at " + position +" is replaced with " + newItem);
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Grocery Item at " + position + ": " + theItem + " is removed");
    }

    public boolean isGroceryItemFound(String searchItem) {
        return groceryList.contains(searchItem);
    }

    public String getGroceryItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        if (position != -1) {
            return groceryList.get(position);
        }
        return null;
    }
}
