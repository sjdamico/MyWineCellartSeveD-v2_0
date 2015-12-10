/* My Own Wine Cellar Inventory App
Created by Steve D'Amico
Fall or 2015
++++ Copyright 2015 ++++ */

package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class WineList {

    // Variables declaration
    private String wineType;
    private String vendorName;
    private String wineDescription;
    private String bottleType;
    private int numberOfBottles;
    private String wineRack;

    // Object construct for wineList
    public WineList(String type, String vendor, String description, String size, int quantity, String location) {
        wineType = type;
        vendorName = vendor;
        wineDescription = description;
        bottleType = size;
        numberOfBottles = quantity;
        wineRack = location;
    }

    // Get and set methods for object variables
    public String getType() {
        return wineType;
    }
    public String getVendor() {
        return vendorName;
    }
    public String getDescription() {
        return wineDescription;
    }
    public String getSize() {
        return bottleType;
    }
    public int getQuantity() {
        return numberOfBottles;
    }
    public String getLocation() {
        return wineRack;
    }
    public void setType(String type) {
        wineType = type;
    }
    public void setVendor(String vendor) {
        vendorName = vendor;
    }
    public void setDescription(String description) {
        wineDescription = description;
    }
    public void setSize(String size) {bottleType = size; }
//    public void setQuantity() {numberOfBottles = quantity;}
    public void setLocation(String location) {
        wineRack = location;
    }

    // Query user's choices function
    public static void queryChoice() {
        System.out.println();
        System.out.println("Do you wish to try another selection?");
        System.out.println("Type y for yes, n for no.");
        System.out.println();
        Scanner another = new Scanner(System.in);
        String anotherChoice = another.nextLine();
        if (anotherChoice.equals("n")) {
            System.out.println("Good Bye.");
            System.exit(0);
            // Provide wine type options and respective selections
        } else if (anotherChoice.equals("y")) {
            System.out.println("Let's begin.");
        }
    }

    /*
        // List available Wine Types with user selection function
        public static void typeListing(int n1, int n2, String[] n3, String[] n4) {
            // Print list of Wine Types less duplicates
            System.out.println("This is a list of the available wine types:");
            for(int i = 0; i < n1; i++) {
                if (i == 0)
                    System.out.println((i + 1) + " -> " + n3[i]);
                else if (n3[i] != n3[i - 1])
                    System.out.println((i + 1) + " -> " + n3[i]);
            }
            // Get user's wine type input
            System.out.println();
            System.out.println("Please enter the number of your wine type here: ");
            Scanner typeInput = new Scanner(System.in);
            int input = typeInput.nextInt() - 1;
            System.out.println("You selected "+ n3[input] + " wine.");
            System.out.println();

            // Create Array of wine choice indices
            //int[] choiceArray = new int[n3.length()];

            // Display user's wine selection(s)
            System.out.println("Here are the wines you have selected: ");
            for(int k = 0; k < n1; k++) {
                // Create variable for output of selections
                String selection = " -> a " + n4[k].getType() + " by " + n4[k].getVendor() + " which is a " + n4[k].getDescription() + " in a " + n4[k].getSize() + " bottle with " + n4[k].getQuantity() + " on hand and located at " + n4[k].getLocation();
                if (n3[k] == n3[input])
                    System.out.println((k + 1) + selection);
                //choiceArray[k] = k;
            }
        }
    */
    public static void main(String[] args) throws IOException {
        String wineType;
        String vendorName;

        WineList[] ourCellar = new WineList[14]; // Allocate memory for 14 element array

        // Initialize array elements
        ourCellar[0] = new WineList("Merlot", "Arbor Mist", "Merry Berry Wine", "750 ml", 11, "01 abcd");
        ourCellar[1] = new WineList("Muscat", "Simon Creek", "Golden Wine", "750 ml", 2, "Box #3");
        ourCellar[2] = new WineList("Port", "Simon Creek", "Jackson Port", "750 ml", 4, "Box #4");
        ourCellar[3] = new WineList("Port", "Valentino", "Fortified Wine", "750 ml", 2, "Box 4");
        ourCellar[4] = new WineList("Red", "Galena Cellars", "Country Wine", "750 ml", 1, "08 a");
        ourCellar[5] = new WineList("Red", "Simon Creek", "Speakeasy Wine", "750 ml", 2, "08 cd");
        ourCellar[6] = new WineList("Red", "Simon Creek", "Untouchable Wine", "750 ml", 1, "08 b");
        ourCellar[7] = new WineList("Riesling", "Galena Cellars", "Daffodil Wine", "750 ml", 1, "15 b");
        ourCellar[8] = new WineList("Riesling", "Galena Cellars", "Late Harvest Wine", "750 ml", 2, "13 cd");
        ourCellar[9] = new WineList("Riesling", "Cedar Creek", "Waterfall Wine", "750 ml", 3, "12 bcd");
        ourCellar[10] = new WineList("Rose", "Galena Cellars", "Country Wine", "750 ml", 1, "10 a");
        ourCellar[11] = new WineList("White", "Galena Cellars", "Octoberfest Wine", "750 ml", 1, "15 a");
        ourCellar[12] = new WineList("White", "Door Peninsula", "Christmas Wine", "750 ml", 3, "14 bcd");
        ourCellar[13] = new WineList("Zinfandel", "Beringer", "White Wine", "750 ml", 2, "Box 11");

        // Create ArrayList ourCellar
        // Use generics to link WineList
        ArrayList<WineList> ourCellarList = new ArrayList<WineList>();
    /*    ourCellarList.add(WineList("Merlot", "Arbor Mist", "Merry Berry Wine", "750 ml", 11, "01 abcd"));
        ourCellarList.add(WineList("Muscat", "Simon Creek", "Golden Wine", "750 ml", 2, "Box #3"));
        ourCellarList.add(WineList("Port", "Simon Creek", "Jackson Port", "750 ml", 4, "Box #4"));
        ourCellarList.add(WineList("Port", "Valentino", "Fortified Wine", "750 ml", 2, "Box 4"));
        ourCellarList.add(WineList("Red", "Galena Cellars", "Country Wine", "750 ml", 1, "08 a"));
        ourCellarList.add(WineList("Red", "Simon Creek", "Speakeasy Wine", "750 ml", 2, "08 cd"));
        ourCellarList.add(WineList("Red", "Simon Creek", "Untouchable Wine", "750 ml", 1, "08 b"));
        ourCellarList.add(WineList("Riesling", "Galena Cellars", "Daffodil Wine", "750 ml", 1, "15 b"));
        ourCellarList.add(WineList("Riesling", "Galena Cellars", "Late Harvest Wine", "750 ml", 2, "13 cd"));
        ourCellarList.add(WineList("Riesling", "Cedar Creek", "Waterfall Wine", "750 ml", 3, "12 bcd"));
        ourCellarList.add(WineList("Rose", "Galena Cellars", "Country Wine", "750 ml", 1, "10 a"));
        ourCellarList.add(WineList("White", "Galena Cellars", "Octoberfest Wine", "750 ml", 1, "15 a"));
        ourCellarList.add(WineList("White", "Door Peninsula", "Christmas Wine", "750 ml", 3, "14 bcd"));
        ourCellarList.add(WineList("Zinfandel", "Beringer", "White Wine", "750 ml", 2, "Box 11"));
    */

        // Convert ourCellar array to an ArrayList
        Collections.addAll(ourCellarList, ourCellar);

        // Create array of types (type can be repeated in ourCellar)
        String[] typeArray = new String[ourCellarList.size()];

        for (int j = 0; j < ourCellarList.size(); j++) {
            typeArray[j] = ourCellarList.get(j).getType();
        }
        // Sort typeArray
        Arrays.sort(typeArray);

        // Entry point for repeat in while loop
        String anotherChoice = "y";
        while (anotherChoice.equals("y")) {

            // Print list of Wine Types less duplicates
            System.out.println("This is a list of the available wine types:");
            for (int i = 0; i < ourCellarList.size(); i++) {
                if (i == 0)
                    System.out.println((i + 1) + " -> " + typeArray[i]);
                else if (typeArray[i] != typeArray[i - 1])
                    System.out.println((i + 1) + " -> " + typeArray[i]);
            }
            // Get user's wine type input
            System.out.println();
            System.out.println("Please enter the number of your wine type here: ");
            Scanner typeInput = new Scanner(System.in);
            int input = typeInput.nextInt() - 1;
            System.out.println();
            System.out.println("You selected " + typeArray[input] + " wine.");
            System.out.println();

            // Display user's wine selection(s)
            System.out.println("Here are the wines you have selected: ");
            for (int k = 0; k < ourCellarList.size(); k++) {

                // Create variable for output of selections
                String selection = " -> a " + ourCellarList.get(k).getType() + " by " + ourCellarList.get(k).getVendor() + " which is a " + ourCellarList.get(k).getDescription() + " in a " + ourCellarList.get(k).getSize() + " bottle with " + ourCellarList.get(k).getQuantity() + " on hand and located at " + ourCellarList.get(k).getLocation();
                if (typeArray[k] == typeArray[input])
                    System.out.println((k + 1) + selection);
            }

            // User requested to make a choice
            System.out.println();
            System.out.println("Are you interested in any of these?");
            System.out.println("If no, please enter 0, otherwise enter the number of your wine type here: ");

            // Get user's wine type input
            Scanner choiceInput = new Scanner(System.in);
            int choice = choiceInput.nextInt();
            System.out.println();
            if (choice >= 1) {
                System.out.println("You selected " + choice);
                System.out.println();

                // Set user's choice printout variable
                String choiceSelection = " -> a " + ourCellarList.get(choice - 1).getType() + " by " + ourCellarList.get(choice - 1).getVendor() + " which is a " + ourCellarList.get(choice - 1).getDescription() + " in a " + ourCellarList.get(choice - 1).getSize() + " bottle with " + ourCellarList.get(choice - 1).getQuantity() + " on hand and located at " + ourCellarList.get(choice - 1).getLocation();

                // Print out user's choice
                System.out.println(choiceSelection);

                // Update quantity
                System.out.println("Do you wish to keep this choice?");
                System.out.println("Type y for yes, n for no.");

                // Get user's choice confirmation
                Scanner confirm = new Scanner(System.in);
                String confirmChoice = confirm.nextLine();
                System.out.println();
                if (confirmChoice.equals("y")) {
                    if (ourCellarList.get(choice - 1).getQuantity() == 0) {
                        System.out.println("This selection's quantity is currently 0!");
                        System.out.println();
                        // Update arrayList quantity
                    } else {
                        int newQuantity = (ourCellarList.get(choice - 1).getQuantity() - 1);
//                        ourCellarList.get(choice - 1).setQuantity() = newQuantity;
                        System.out.println("Inventory quantity has been update.");
                        System.out.println("New quantity is " + newQuantity);
                    }
                }
            }
            queryChoice();
        }
    }
}

/* Future Development will target converting the variables and constants to more genric form.
    Additional development will be to provide default files with user oriented variables
     such as Wine Type for Wine Inventory or Beer Type for Beer Inventory. An additional
     feature is to add the capability of creating user derived variables. */


