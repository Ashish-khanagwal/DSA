package com.Ashish;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        System.out.println("Methods with parameters");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String greeting = greet(name);
        System.out.println(greeting);

        System.out.print("enter first number: ");
        int a = in.nextInt();
        System.out.print("enter second number: ");
        int b = in.nextInt();
        int ans = sum(a, b);
        System.out.println("Your desired answer is: " + ans);
    }

    static String greet(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
