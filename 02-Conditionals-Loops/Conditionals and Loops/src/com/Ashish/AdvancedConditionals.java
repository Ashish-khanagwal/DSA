package com.Ashish;

import java.util.Scanner;

public class AdvancedConditionals {
    public static void main(String[] args) {
        System.out.println("Here we will learn some advanced concepts in conditionals");
        Scanner in = new Scanner(System.in);
        System.out.println("Nested Conditionals");

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // This is how Nested conditionals works
        if (age >= 18){
            if (age >= 20) {
                System.out.println("you can watch Animal");
            } else {
                System.out.println("You can't watch Animal");
            }
        } else {
            System.out.println("Go and watch POGO!😂");
        }

        // Ternary Operator
        // The ternary operator (? :) provides a compact way to write simple conditional statements.
        String movie = (age >= 18) ? "You can watch Animal" : "Go and watch POGO!😂";
        System.out.println("SO, " + movie);
    }
}
