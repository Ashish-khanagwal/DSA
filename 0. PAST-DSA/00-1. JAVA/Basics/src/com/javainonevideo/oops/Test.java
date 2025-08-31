package com.javainonevideo.oops;

public class Test {
    public static void main(String[] args) {
        System.out.println("Object Oriented Programming");

        Car car = new Car();
        car.color = "Red";
        car.model = "BMW";
        car.year = 2025;

        car.startEngine();
        System.out.println(car.color);
    }
}
