package com.Ashish;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args){
        System.out.println("HCF of two numbers");
//        HCF of two numbers
        Scanner input = new Scanner(System.in);
        int a, b, h = 0;
        System.out.print("Enter first number: ");
        a = input.nextInt();
        System.out.print("Enter second number: ");
        b = input.nextInt();
        for(int i = 1; i <= a || i <= b; i++){
            if(a % i == 0 && b % i == 0){
                h = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is " + h);

        System.out.println("LCM of tow numbers");
//        LCM of two numbers
        int l, n1, n2;
        System.out.print("Enter n1: ");
        n1 =  input.nextInt();
        System.out.print("Enter n2: ");
        n2 = input.nextInt();

//        To find out maximum of two numbers which will be store in l
        l = Math.max(n1, n2);

        while(true){
            if( l % n1 == 0 && l % n2 == 0){
                System.out.println("LCM of numbers " + n1 + " and " + n2 + " is " + l);
                break;
            }
        l++;
        }
    }
}
