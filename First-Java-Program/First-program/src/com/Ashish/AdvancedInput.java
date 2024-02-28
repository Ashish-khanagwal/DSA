package com.Ashish;

import java.util.Scanner;

public class AdvancedInput {
    public static void main(String[] args) {
        System.out.println("This is how we take multiple inputs by using scanner.close() at end");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your percentile: ");
        float percentile = scanner.nextFloat();

        System.out.println("your age is: " + age);
        System.out.println("your name is: " + name);
        System.out.println("your percentile score is: " + percentile);

        scanner.close();
    }
}
