package com.Ashish;

import java.util.Scanner;

public class searchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = in.next();
        System.out.println("Your entered string is: " + str);
        System.out.print("Enter the character you're looking for in the string: ");
        char ch = in.next().trim().charAt(0);
        System.out.println("Your entered character you're searching for is: " + ch);
        boolean ans = search(str, ch);
        System.out.println(ans);
    }

    static boolean search(String str, char target){
        if (str.isEmpty()) {     // str.length() == 0' can be replaced with 'str.isEmpty()
            return false;
        }

        for (int index = 0; index < str.length() ; index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }
}
