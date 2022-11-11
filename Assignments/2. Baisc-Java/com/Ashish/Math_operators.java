package com.Ashish;

import java.util.Scanner;

public class Math_operators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter first number: ");
        num1= input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Choose one operator among +, -, *, /: ");
        char op = input.next().charAt(0);
        if(op == '+'){
            System.out.println("Sum of two numbers is: " + (num1 + num2));
        }
        else if (op == '-'){
            System.out.println("Difference of two numbers is: " + (num1 - num2));
        }
        else if (op == '*'){
            System.out.println("Product of two numbers is: " + (num1*num2));
        }
        else if (op == '/'){
            System.out.println("Division of two numbers is: " + (num1/num2));
        }
        else {
            System.out.println("Please choose a valid operator");
        }
    }
}
