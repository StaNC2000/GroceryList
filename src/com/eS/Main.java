package com.eS;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Grocery groceryList = new Grocery();

    public static void main(String[] args) {
        // write your code here
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printInstructions();
                    break;
                ;
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
                    quit = false;
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
        groceryList.addGroceryItem(item);
    }

    public static void modifyItem() {
        System.out.println("Please select item number to modify: ");
        int intNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(intNumber-1, newItem);
    }

}
