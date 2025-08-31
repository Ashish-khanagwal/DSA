package com.javainonevideo.multithreading;

public class withMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();

        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
