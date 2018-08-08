package com.keningren;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList;

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void addGrocery(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        if (groceryList.size() == 0) {
            System.out.println("Grocery list is empty");
        } else {
            for(int i = 0; i < groceryList.size(); i++) {
                System.out.println(groceryList.get(i));
            }
        }
    }

    public void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
    }

    public void removeGroceryItem(int position) {
        try {
            String item = groceryList.get(position);
            groceryList.remove(position);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Boolean isGroceryItemFound(String item) {
        return groceryList.contains(item);
    }

    public String getGroceryItem(String item) {
        int position = groceryList.indexOf(item);
        if (position != -1) {
            return groceryList.get(position);
        } else {
            return null;
        }
    }
}
