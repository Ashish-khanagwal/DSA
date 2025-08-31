package com.Ashish;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int [] arr = {1, 4, 65, 67, 89};
        change(arr);
        System.out.printf(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // here, we are making direct changes to the object via reference variable so the original object will also be changed.
    }
}
