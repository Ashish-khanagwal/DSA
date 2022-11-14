package com.Ashish;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c = 0;
        a = 0;
        b = 1;
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        // To return fibonacci series.
        System.out.print("Fibonacci series till " + n + " terms: ");
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ,");
            c = a + b;
            a = b;
            b = c;
        }

        // To return fibonacci number at particular position
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
