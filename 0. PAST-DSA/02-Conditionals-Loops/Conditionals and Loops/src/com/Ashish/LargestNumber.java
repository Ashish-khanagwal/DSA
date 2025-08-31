package com.Ashish;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In order to get the largest number from three numbers");

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        // Condition to check the largest number among them.
        if (a == b && b == c ) {
            System.out.println("All are equal");
        } else if (a > b) {
            if (a > c) {
                System.out.println(a + " is the largest number among all of them");
            } else {
                System.out.println(c + " is the largest number among all of them");
            }
        } else if (b > c) {
            System.out.println(b + " is the largest number among all of them");
        } else {
            System.out.println(c + " is the largest number among all of them");
        }

        // Another method
        int max = a;
        if (b > max) {
            max = b;
            if (c > max){
                max = c;
                System.out.println(c + " is the largest number among all of them");
            } else {
            System.out.println(b + " is the largest number among all of them");
            }
        } else {
        System.out.println(a + " is the largest number among all of them");
        }
    }
}
