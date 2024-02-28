package com.Ashish;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number: ");
        int rollNo = input.nextInt();
        System.out.print("Your roll number is: " + rollNo + "\n");

        System.out.print("What is your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.print("Good morning " + name);
    }
}
