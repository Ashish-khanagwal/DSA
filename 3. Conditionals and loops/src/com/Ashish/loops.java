package com.Ashish;

import java.util.Scanner;

public class loops {
    public static void main(String[] args){

//        If you're told to print numbers from 1 to 1000, you won't follow that way mentioned below
//        System.out.println("1") <-- and writing same line of code thousand times.

        // To tackle this, we use loops (For loop, While loop, and Do while loop)

        // Syntax of For loop
        /*
        for(initialisation; condition; increment/decrement){
            body
        }
         */

//        Print numbers from 1 to 100
        for(int num = 1; num <= 100; num++){
            System.out.println(num + ", ");
        }

//        Print numbers form 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }

        // Syntax of While loop
        /*
        initialization
        while(condition) {
            body
            increment/decrement
        }
         */

        int a = 1;
        while(a <= 5){
            System.out.print(a);
            a++;
        }

//        When to use for loop and while loop?
        // When you know the exact numbers loop will gonna run then use for loop otherwise use while loop.

        // Syntax of Do-while loop
        /*
            do {
                body
            } while(condition)
         */
        int b = 1;
        do {
            System.out.print(b);
            b++;
        } while(b <= 10);
        // Do-while loop runs at-least once, because it will check condition after program's implementation once then if the condition inside while is true, it'll execute again.

        int c = 1;
        do {
            System.out.println("Hello world");
        } while (c != 1);
        // above program print hello world once and then it will check the condition then proceed further.
    }
}
