package com.Ashish;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int n = num;
        int sum = 0;
        while (num > 0){
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num / 10;
        }
        if (n == sum){
            System.out.println(n + " is an Armstrong number");
        }
        else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
