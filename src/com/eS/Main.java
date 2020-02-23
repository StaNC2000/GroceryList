package com.eS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Grocery groceryList = new Grocery();

    public static void main(String[] args) {
        // write your code here
        boolean run = true;
        int choice = 0;

        while (run) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                case 2:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    removeItem();
                    break;
                case 6:
                    searchItem();
                    break;
                case 0:
                    run = false;
                    System.out.println("Bye, Bye");
                    break;

            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 1 To print choice options.");
        System.out.println("\t 2 To print the list of grocery items.");
        System.out.println("\t 3 To add new item.");
        System.out.println("\t 4 To modify item.");
        System.out.println("\t 5 To remove item.");
        System.out.println("\t 6 To search for item");
        System.out.println("\t 0 To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        String item = scanner.nextLine();
        groceryList.addGroceryItem(item.toUpperCase());
    }

    public static void modifyItem() {
        System.out.println("Please select item name to modify: ");
        String itemNumber = scanner.nextLine().toUpperCase();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine().toUpperCase();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem() {
        System.out.println("Please enter name item to remove: ");
        String itemNumber = scanner.nextLine().toUpperCase();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchItem() {
        System.out.println("Please enter item to search for: ");
        String searchItem = scanner.nextLine().toUpperCase();
        if (groceryList.onFile(searchItem.toUpperCase())) {
            System.out.println("Found " + searchItem + " in our grocery list.");
        }
        else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList()); // another version

    }
}
