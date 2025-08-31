package com.Ashish;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose Category of item between 1-3: ");
        int itemCategory = in.nextInt();
        System.out.print("Choose item number from 1-3: ");
        int itemNumber = in.nextInt();
        String itemName;

        switch (itemCategory) {
            case 1:
                itemName = switch (itemNumber) {
                    case 1 -> "Book";
                    case 2 -> "Pen";
                    case 3 -> "Laptop";
                    default -> "Invalid item";
                };
                break;
            case 2:
                itemName = switch (itemNumber) {
                    case 1 -> "Shirt";
                    case 2 -> "Jeans";
                    case 3 -> "Belt";
                    default -> "Invalid item";
                };
                break;
            case 3:
                itemName = switch (itemNumber) {
                    case 1 -> "bed";
                    case 2 -> "Fan";
                    case 3 -> "Painting";
                    default -> "Invalid item";
                };
                break;
            default:
                itemName = "Invalid Category";
        }
        System.out.println("Item is: " + itemName);
    }
}
