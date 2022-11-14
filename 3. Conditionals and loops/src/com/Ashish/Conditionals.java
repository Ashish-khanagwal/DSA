package com.Ashish;

public class Conditionals {
    public static void main(String[] args){

//        If - else syntax
//        if(boolean expression T or F){
//            body
//        } else {
//            do this
//        }

        int salary = 15000;
        if (salary >= 10000) {
            salary += 2000;
        } else if (salary >= 20000) {
            salary += 5000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}