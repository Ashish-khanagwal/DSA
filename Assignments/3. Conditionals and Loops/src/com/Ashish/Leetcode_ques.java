package com.Ashish;

import java.util.Scanner;

public class Leetcode_ques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 0, n;
        int sum = 0, result =0;
        System.out.print("Enter the number: ");
        n = in.nextInt();
        
        for(int i=0; i < n.length; i++){
            product *= n[i];
            sum *= n[i];
            result = product + sum;
        }
        System.out.println(result);
    }
}
