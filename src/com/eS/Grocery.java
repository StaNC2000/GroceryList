package com.eS;

import java.util.ArrayList;

public class Grocery {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item.toUpperCase());
        System.out.println("Grocery item " + (position + 1) + " has been modified");

    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        System.out.println("Grocery item " + (position + 1) + "has been removed");
    }

    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem.toUpperCase());
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }
}
