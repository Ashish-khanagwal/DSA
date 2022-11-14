package com.Ashish;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        Q: Find the largest number from three numbers

        int a, b, c;
        System.out.println("Enter three numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int max = a;

        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max + " is the largest");

        // There are always multiple ways to solve an problem
        // We can use Math.max property

        // It will give maximum value among a and b
//        int high = Math.max(a, b);
        // It will give maximum value from c and max value of a and b
        int high = Math.max(c, (Math.max(a, b)));
        System.out.println(high);
    }
}
