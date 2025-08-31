package com.Ashish;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's reverse a number");
        int num = in.nextInt();

        int reverse = 0;
         while (num > 0){
             int rem = num % 10;
             num = num / 10;
             reverse = reverse * 10 + rem;
         }
        System.out.println(reverse);
    }
}
