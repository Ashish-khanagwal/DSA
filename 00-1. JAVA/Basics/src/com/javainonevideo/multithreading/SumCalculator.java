package com.javainonevideo.multithreading;

public class SumCalculator implements Runnable{
    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
