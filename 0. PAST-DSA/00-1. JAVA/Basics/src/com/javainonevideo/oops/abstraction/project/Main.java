package com.javainonevideo.oops.abstraction.project;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new Payment(500.0, "1234567812345678");       // valid
        Payment payment2 = new Payment(-20.0, "1234567812345678");       // invalid amount
        Payment payment3 = new Payment(200.0, "1111");                   // invalid card number

        PayPalValidator validator = new PayPalValidator();

        System.out.println("Payment 1 valid? " + validator.validatePayment(payment1));
        System.out.println("Payment 2 valid? " + validator.validatePayment(payment2));
        System.out.println("Payment 3 valid? " + validator.validatePayment(payment3));
    }
}
