package com.Ashish;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
    }
}
