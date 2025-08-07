package com.javainonevideo.oops.abstraction;

public class inter {
    public static void main(String[] args) {
        System.out.println("Interface");
        Dogs dogs = new Dogs();
        dogs.makeSound();
        dogs.sleep();
        Animals.info();
        System.out.println(Animals.Age);
    }
}

interface Animals{
    void makeSound();
    default void sleep(){ // Belongs to instances of implementing classes (like a regular method).
        System.out.println("zzzzz...");
    }
    static void info(){ // Belongs to the interface itself, not to implementing classes or to objects.
        System.out.println("Animal Info");
    }
    int Age = 5;
}

class Dogs implements Animals{
    @Override
    public void makeSound() {
        System.out.println("Dog barks...woof woof woof");
    }
    // sleep() can be used as-is, or overridden
}
