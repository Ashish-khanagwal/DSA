package com.Ashish;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if(year%4 == 0){
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is Not a leap year");
        }
    }
}
