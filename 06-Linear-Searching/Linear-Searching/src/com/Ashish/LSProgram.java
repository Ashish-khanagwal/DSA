package com.Ashish;

import java.util.Arrays;
import java.util.Scanner;

public class LSProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array of length 10");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("Enter the target element you want to search for: ");
        int target = in.nextInt();
        int ans = LinearSearch(nums, target);

        if (ans == -1) {
            System.out.println("Sorry, element you looking for is not found in the array");
            System.out.println(ans);
        } else {
            System.out.println("Your desired element is at index: " + ans);
        }

    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
