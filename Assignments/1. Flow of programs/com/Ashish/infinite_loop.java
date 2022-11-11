package com.Ashish;

import java.util.Scanner;

public class infinite_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0, sum = 0, count = 0;
        String choice = "";

        while(!choice.equals("x")){
            System.out.print("Enter a number or x to exit: ");
            choice = input.next();

            if(!choice.equals("x")){
                num = Integer.parseInt(choice);
//                This method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.
                sum = sum + num;
            }
            count++;
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
