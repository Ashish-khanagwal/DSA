package com.Ashish;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in celsius: ");
    float c = input.nextFloat();
    float far = (c * 9/5) + 32;
    System.out.println("Temperature in Fahrenheit is: " + far);
    }
}
