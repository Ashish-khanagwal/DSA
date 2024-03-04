package com.Ashish;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        /*
            ArrayList<ArrayList<DataType>> name = new ArrayList<>();
        */

        ArrayList<ArrayList<Integer>> multiDimArrayList = new ArrayList<>();

        // Add some ArrayLists to the multidimensional ArrayList
        multiDimArrayList.add(new ArrayList<>());
        multiDimArrayList.add(new ArrayList<>());
        multiDimArrayList.add(new ArrayList<>());

        // Add elements to the inner ArrayLists
        multiDimArrayList.get(0).add(1);
        multiDimArrayList.get(0).add(2);
        multiDimArrayList.get(1).add(3);
        multiDimArrayList.get(1).add(4);
        multiDimArrayList.get(2).add(5);
        multiDimArrayList.get(2).add(6);

        for (ArrayList<Integer> innerArrayList : multiDimArrayList) {
            System.out.println(innerArrayList);
        }
    }
}
