package com.Ashish;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WHILE Loop");
        /*
            Syntax of While Loop
            The while loop repeats a block of code as long as a specified condition is true.

            initialisation
            while(condition){
                body
                increment/decrement
            }
         */
        // Example
        int i = 1;
        while (i <= 5){
            System.out.println("Iteration: " + i);
            i++;
        }

        // Let's try a complex example.
        // Keep taking input from a user till the user does not press 'x' or 'X'.

        while (true){
            System.out.print("Enter a character or (Press x or X to exit): ");
            String input = in.next();
            char inputChar = input.charAt(0);

            if (inputChar == 'x' || inputChar == 'X'){
                System.out.println("Exiting....");
                break;
            } else {
                System.out.println("You entered: " + inputChar);
            }
        }

        // Do while loop --> This loop is going to execute at least once
        /*
            Syntax of do while loop
            do {
                body
            } while(condition)
         */

        int n = 1;
        do {
            System.out.println("Hello world");
        } while (n != 1); // See this will execute hello world first and then check the condition.
    }
}
