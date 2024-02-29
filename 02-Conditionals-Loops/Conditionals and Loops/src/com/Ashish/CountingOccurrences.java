package com.Ashish;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's count occurrence of a given number by user");

        System.out.print("Enter any integer that includes '3' multiple times: ");
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 3){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
