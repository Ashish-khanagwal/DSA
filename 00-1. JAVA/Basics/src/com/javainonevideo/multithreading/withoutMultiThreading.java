package com.javainonevideo.multithreading;

public class withoutMultiThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println(sum);

        int count = 0;
        for (int j = 1; j < 50000000; j++) {
            if (j % 10 == 7){
                count++;
            }
        }
        System.out.println("Count of numbers ending in 7: " + count);
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
