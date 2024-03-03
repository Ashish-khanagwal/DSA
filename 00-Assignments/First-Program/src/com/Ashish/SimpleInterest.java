package com.Ashish;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.");
        // S.I = (principle * rate * time)/100
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle value: ");
        float p = in.nextFloat();
        System.out.print("Enter rate in %: ");
        int r = in.nextInt();
        System.out.print("Enter time in years: ");
        int t = in.nextInt();

        float S = (p * r * t)/100;
        System.out.println("Value of simple interest is: " + S);
    }
}
