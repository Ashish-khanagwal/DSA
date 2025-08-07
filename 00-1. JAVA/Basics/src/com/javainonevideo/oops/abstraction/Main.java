package com.javainonevideo.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstraction");
        Dog dog = new Dog();
        dog.sayHello();
        dog.sleep();
    }
}

abstract class Animal{
    abstract void sayHello();
    void sleep(){
        System.out.println("Sleeping peacefully");
    }
}

class Dog extends Animal{

    @Override
    void sayHello() {
        System.out.println("woof woof");
    }
}