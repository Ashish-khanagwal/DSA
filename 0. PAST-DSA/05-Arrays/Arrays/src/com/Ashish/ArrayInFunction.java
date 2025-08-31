package com.Ashish;

import java.util.Arrays;

public class ArrayInFunction {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));

        // Changed array
        change(num);
        System.out.println(Arrays.toString(num));
    }
     static void change(int[] arr){
        arr[2] = 99;
    }
}
