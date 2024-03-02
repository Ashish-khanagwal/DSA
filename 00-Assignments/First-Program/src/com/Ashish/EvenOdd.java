package com.Ashish;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Write a program to print whether a number is even or odd, also take input from the user");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given number " + num + " is even");
        } else {
            System.out.println("Given number " + num + " is odd");
        }
    }
}