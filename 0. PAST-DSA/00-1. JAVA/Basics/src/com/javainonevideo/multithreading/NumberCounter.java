package com.javainonevideo.multithreading;

public class NumberCounter extends Thread{

    @Override
    public void run() {
        int count = 0;
        for (int j = 1; j < 50000000; j++) {
            if (j % 10 == 7){
                count++;
            }
        }
        System.out.println("Numbers ending with 7: " + count);
    }
}
