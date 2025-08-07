package com.javainonevideo.datatypes;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        System.out.println("Switch Statement");

        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 7: ");
        int day = scanner.nextInt();

        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);
    }
}
