package com.Ashish;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)");
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter second number: ");
            int num2 = in.nextInt();
            System.out.print("Choose any operator from '+', '-', '*', '/', '%' to continue tha calculation you want to made: ");
            char op = in.next().trim().charAt(0);

            if (op != 'x' && op != '-' && op != '*' && op != '/' && op != '%') {
                System.out.println("Invalid operator");
            }
            if (op == '+'){
                ans = num1 + num2;
                System.out.println(ans);
            }
            if (op == '-'){
                ans = num1 - num2;
                System.out.println(ans);
            }
            if (op == '*'){
                ans = num1 *  num2;
                System.out.println(ans);
            }
            if (op == '/'){
                if (num2 == 0){
                    System.out.println("Not valid!");
                } else {
                    ans = num1 / num2;
                    System.out.println(ans);
                }
            }
            if (op == '%') {
                ans = num1 % num2;
                System.out.println(ans);
            }
        }
    }
}
