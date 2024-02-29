package com.Ashish;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops");
        Scanner in = new Scanner(System.in);
        System.out.println("FOR Loop");
        /*
            Syntax of for loop:
            for (initialisation; condition; increment/decrement){
                body of program
            }
         */
        // Example
        for (int num = 1; num <= 5; num++){
            System.out.println("Iteration " + num);
        }

        // Advanced Example with some sort of complexity
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age >= 18 && age <= 25) {
            if (age <= 20) {
                for (int rep = 1; rep <= 50; rep++ ){
                    System.out.println("Weightlifting rep 🏋️: " + rep);
                }
            } else {
                for (int rep = 1; rep <= 100; rep++ ){
                    System.out.println("Weightlifting rep 🏋️: " + rep);
                }
            }
        } else if (age > 25) {
            for (int rep = 1; rep <= 150; rep++){
                System.out.println("Heavy weightlifting rep 🏋️‍♂️: " + rep);
            }
        } else {
            System.out.println("Hey buddy, We've different set of reps for you 😎");
        }
    }
}
