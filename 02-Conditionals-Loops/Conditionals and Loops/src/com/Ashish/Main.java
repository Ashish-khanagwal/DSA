package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conditionals");

        // If-else statements: Syntax
        // if (true) {
        //  Do this
        // } else {
        //  otherwise do this
        // }

        // This is how simple if-else statement works

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = in.nextInt();
        if (salary > 30000) {
            salary += 2500;
        } else {
            salary += 1000;
        }
        System.out.println("Your salary with diwali bonus is: " + salary);

        // Multiple if-else statement

        System.out.print("Enter your Mathematics marks: ");
        int marks = in.nextInt();

        if (marks >= 90) {
            System.out.println("you scored A+");
        } else if ((marks < 90) && (marks >= 75)) {
            System.out.println("you scored B+");
        } else {
            System.out.println("You scored C, work hard!");
        }
    }
}