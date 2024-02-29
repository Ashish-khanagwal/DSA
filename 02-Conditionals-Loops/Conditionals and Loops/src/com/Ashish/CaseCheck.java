package com.Ashish;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's check if the entered alphabet is uppercase or lowercase");

        System.out.print("Enter any alphabet: ");
        String input = in.next();
        char ch = input.charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Your entered alphabet is Lowercase: " + ch);
        } else {
            System.out.println("Your entered alphabet is Uppercase: " + ch);
        }
    }
}
