package com.Ashish;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, i;
        a = 0;
        b = 1;
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (i = 1; i <= n; ++i){
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
