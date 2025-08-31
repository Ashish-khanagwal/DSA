package com.Ashish;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculator Program");
        int ans = 0;
        while (true) {
            System.out.println("enter any operator among +, -, *, /, %");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter second number: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0){
                    ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Exiting..");
                break;
            } else {
                System.out.println("Not a valid operation..");
            }
        System.out.println("Your desired answer is: " + ans);
        }
    }
}
