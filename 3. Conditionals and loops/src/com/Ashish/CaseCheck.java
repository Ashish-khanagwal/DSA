package com.Ashish;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        // trim() <-- It will remove the extra space from the beginning and from the end of the string.
        // charAt() <-- here, we are taking input as a string so, it will help us to returning character from a specific index.

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
