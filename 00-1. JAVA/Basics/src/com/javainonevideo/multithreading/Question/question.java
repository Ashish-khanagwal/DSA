package com.javainonevideo.multithreading.Question;

class printNumbers extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);  // pause for 100 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class question {
    public static void main(String[] args) {
        printNumbers thread1 = new printNumbers();
        thread1.setName("Thread-1");

        printNumbers thread2 = new printNumbers();
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Threads finished");
    }
}
