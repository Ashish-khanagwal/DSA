package com.Ashish;

import java.util.Scanner;

public class Currency_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rupees, USD;
        System.out.print("Entre currency in rupees: ");
        rupees = input.nextInt();
        USD = (int)(rupees * 79.8635);
        System.out.println("Your amount in USD is: " + USD);
    }
}
