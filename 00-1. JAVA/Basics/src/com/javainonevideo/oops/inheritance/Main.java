package com.javainonevideo.oops.inheritance;

class Animal {
    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance\n");

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println("\n");
        ElectricCar tesla = new ElectricCar();
        tesla.starts(); // Vehicle
        tesla.drives(); // Car
        tesla.charges(); // Self
    }
}

class Vehicle{
    void starts(){
        System.out.println("Vehicle started...");
    }
}

class Car extends Vehicle{
    void drives(){
        System.out.println("Car Drives...");
    }
}

class ElectricCar extends Car{
    void charges(){
        System.out.println("Charging electric car");
    }
}