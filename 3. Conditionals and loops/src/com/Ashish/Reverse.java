package com.Ashish;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rev = 0;
        int rem;
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            rem = n % 10 ;
            n /=  10;
            rev = rev*10 + rem;
        }
        System.out.println(rev);
    }
}
