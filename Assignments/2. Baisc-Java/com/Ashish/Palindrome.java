package com.Ashish;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String pal, rev = "";
        char ch;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string: ");
        pal = input.next();
        for(i = 0; i < pal.length(); i++){
            ch = pal.charAt(i);
            rev = ch + rev;
        }
        System.out.println("Reverse of word " + pal + " is " + rev);
        if (pal.equals(rev.toString())){
            System.out.println("Entered String is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
