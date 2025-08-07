package com.javainonevideo.oops.encapsulation;

class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 18){
            this.age = age;
        } else {
            System.out.println("Enter a valid age...");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ashish");
        person.setAge(24);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
