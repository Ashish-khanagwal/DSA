package com.Ashish;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your good name");
        String name = input.nextLine();
        System.out.println("Hello, " + name + " you're doing great work. Keep going!");
    }
}
