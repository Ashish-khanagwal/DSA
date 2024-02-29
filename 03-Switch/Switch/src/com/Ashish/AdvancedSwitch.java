package com.Ashish;

import java.util.Scanner;

public class AdvancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any number between 0 - 9");
        int num = in.nextInt();

        switch (num){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Fall between 0-5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Fall between 6-9");
                break;
        }

        // These both code statements serves exactly the same purpose but with different code structure.

        switch (num) {
            case 0, 1, 2, 3, 4, 5 -> System.out.println("Fall between 0-5");
            case 6, 7, 8, 9 -> System.out.println("Fall between 6-9");
        }
    }
}
