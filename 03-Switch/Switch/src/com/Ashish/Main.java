package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's learn about Switch statement");
        Scanner in = new Scanner(System.in);

        /*
            Syntax fof Switch Statement
            switch(expression) {
                case value1:
                    code block
                    break; --> Important
                case value2:
                    code block
                    break;
                more cases...
                default:   --> If nothing fits it, then it will be executed.
                    code block
            }
         */

        // Example
        System.out.print("Enter any fruit of your choice: ");
        String fruit = in.next();

        // Simple
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A red juicy fruit");
                break;
            case "grapes":
                System.out.println("Small green juicy fruit");
                break;
            default:
                System.out.println("Enter some other fruit");
        }

        // Enhanced Syntax
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A red juicy fruit");
            case "grapes" -> System.out.println("Small green juicy fruit");
            default -> System.out.println("Enter some other fruit");
        }

        // Week Days
        System.out.print("Enter number of week day: ");
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

    }
}