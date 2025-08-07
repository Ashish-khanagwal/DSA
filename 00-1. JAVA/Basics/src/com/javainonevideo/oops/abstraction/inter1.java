package com.javainonevideo.oops.abstraction;

public class inter1 {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance");
        Smartphone phone = new Smartphone();
        phone.makeCall();
        phone.playMusic();
        System.out.println(Mobile.numberOfBatteries);
    }
}

interface Mobile{
    int numberOfBatteries = 1;
    void makeCall();
}

interface MusicPlayer{
    void playMusic();
}

class Smartphone implements Mobile, MusicPlayer{
    @Override
    public void makeCall() {
        System.out.println("Making call...");
    }

    @Override
    public void playMusic() {
        System.out.println("Staring a song...");
    }
}
