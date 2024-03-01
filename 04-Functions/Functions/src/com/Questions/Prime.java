package com.Questions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Check whether the given numbers is prime or not");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
