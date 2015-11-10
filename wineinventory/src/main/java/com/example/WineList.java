package com.example;

import java.util.Scanner;

public class WineList {

    // Variables declaration
    private String wineType;
    private  String vendorName;
    private String wineDescription;
    private  String bottleType;
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
    public String getType(){return wineType;}
    public String getVendor(){return vendorName;}
    public String getDescription(){return wineDescription;}
    public String getSize(){return  bottleType;}
    public int getQuantity(){return numberOfBottles;}
    public String getLocation(){return  wineRack;}

    public void setType(String type){wineType = type;}
    public void setVendor(String vendor){vendorName = vendor;}
    public void setDescription(String description){wineDescription = description;}
    public void setSize(String size){bottleType = size;}
    public void setQuantity(int quantity){numberOfBottles = quantity;}
    public void setLocation(String location){wineRack = location;}

    public static void main(String[] args) {
        String wineType;
        String vendorName;

        WineList[]ourCellar = new WineList[14];     // Allocate memory for 14 element array

        // Initialize array elements
        ourCellar[0] = new WineList("Merlot", "Arbor Mist", "Merry Berry", "750 ml", 11, "01 abcd");
        ourCellar[1] = new WineList("Muscat", "Simon Creek", "Golden", "750 ml", 2, "Box #3");
        ourCellar[2] = new WineList("Port", "Simon Creek", "Jackson", "750 ml", 4, "Box #4");
        ourCellar[3] = new WineList("Port", "Valentino", "Fortified Wine", "750 ml", 2, "Box 4");
        ourCellar[4] = new WineList("Red", "Galena Cellars", "Country", "750 ml", 1, "08 a");
        ourCellar[5] = new WineList("Red", "Simon Creek", "Speakeasy", "750 ml", 2, "08 cd");
        ourCellar[6] = new WineList("Red", "Simon Creek", "Untouchable", "750 ml", 1, "08 b");
        ourCellar[7] = new WineList("Riesling", "Galena Cellars", "Daffodil", "750 ml", 1, "15 b");
        ourCellar[8] = new WineList("Riesling", "Galena Cellars", "Late Harvest", "750 ml", 2, "13 cd");
        ourCellar[9] = new WineList("Riesling", "Cedar Creek", "Waterfall", "750 ml", 3, "12 bcd");
        ourCellar[10] = new WineList("Rose", "Galena Cellars", "Country", "750 ml", 1, "10 a");
        ourCellar[11] = new WineList("White", "Galena Cellars", "Octoberfest", "750 ml", 1, "15 a");
        ourCellar[12] = new WineList("White", "Door Peninsula", "Christmas", "750 ml", 3, "14 bcd");
        ourCellar[13] = new WineList("Zinfandel", "Beringer", "White", "750 ml", 2, "Box 11");

//        vendorName = questionVendor();

        // Print list of Wine Types
        System.out.println("This is a list of the available wine types:");
        for (int i = 0; i < ourCellar.length; i++) {
            if (i == 0)
                System.out.println(ourCellar[i].getType());
            else if (ourCellar[i].getType() != ourCellar[i - 1].getType())
                System.out.println(ourCellar[i].getType());
        }
        System.out.println();
        System.out.println("Please enter your wine type here: ");
        Scanner typeInput = new Scanner(System.in);
        String input = typeInput.nextLine();
        System.out.println(input);





    }

}
