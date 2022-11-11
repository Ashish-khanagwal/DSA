package com.Ashish;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float p, r, t;
        System.out.print("Enter Principal amount in Rs: ");
        p = input.nextFloat();
        System.out.print("Enter Time in year: ");
        t = input.nextFloat();
        System.out.print("Enter rate in percentage: ");
        r = input.nextFloat();
        float s = (p*r*t)/100;
        System.out.println("Value of simple interest is: " + s);
    }
}
