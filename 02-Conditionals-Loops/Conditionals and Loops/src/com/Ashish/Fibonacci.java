package com.Ashish;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's print fibonacci series for a given number");
        // Fibonacci series -> 0, 1, 1, 2, 3, 5, 7, 13, 20,.... (sum of previous two numbers = next number)
        System.out.print("Enter the value for which fibonacci number is required: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
