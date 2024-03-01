package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's learn Functions/Methods");

        // A function is a block of code that performs a specific task and may return a value
        // Let's say you want to do sum of two numbers at least once, this is how we will do it
        int num1, num2, sum;
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Sum is: " + sum);

        // But what if I say, implement the same code 100 time, we won't copy and paste this code for 100 time,
        // Instead of copying and pasting we will use Functions/Methods
    }

    /*
        Syntax of Functions/Methods
        return_type name() {
            // body
            return statement;

            <-- Refer to Greeting.java for more -->
        }
     */
}