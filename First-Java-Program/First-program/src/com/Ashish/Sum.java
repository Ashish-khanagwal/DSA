package com.Ashish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Adding two numbers that are purely integers. If we enter float as values then it will give error.
        System.out.println("Now we will be adding two number");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of entered numbers is: " + sum);

        // Adding two numbers that are float as per requirement, but we will enter integers as values.
        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();

        float sum2 = number1 + number2;
        System.out.print("Sum of entered numbers is: " + sum2);
    }
}
