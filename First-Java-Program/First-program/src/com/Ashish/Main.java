package com.Ashish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        This is how we get output
        System.out.println("Hello World!"); // "ln" will add a new line
//        System.out.print("My name is Ashish"); // Won't add any new line

//        Taking input in java
        System.out.print("What is your name: ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
    }
}
