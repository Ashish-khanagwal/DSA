package com.Ashish;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println( num1 +  " is greater than " + num2);
        }
        else if (num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }
        else {
            System.out.println(num1 + " is equals to " + num2);
        }
    }
}
