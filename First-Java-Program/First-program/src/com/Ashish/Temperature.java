package com.Ashish;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion program from Celsius to Fahrenheit");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + tempF);
    }
}
