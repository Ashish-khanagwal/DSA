package com.javainonevideo.oops.polymorphism;

class Animal {
    void sound(){
        System.out.println("Animal makes sound..");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks...");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows...");
    }
}

public class runtimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Runtime polymorphism");
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
