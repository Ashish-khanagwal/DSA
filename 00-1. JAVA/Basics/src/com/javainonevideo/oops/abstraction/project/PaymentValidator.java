package com.javainonevideo.oops.abstraction.project;

    interface PaymentValidator {
        boolean validatePayment(Payment payment);

        // Static utility method - checks if credit card number is exactly 16 digits
        static boolean isValidCreditCard(String cardNumber) {
            // Simple check (not real Luhn algorithm)
            return cardNumber != null && cardNumber.length() == 16;
        }

        // Static utility method - checks if amount is between 0 and 1,000,000
        static boolean isValidAmount(double amount) {
            return amount > 0 && amount < 1000000;
        }
    }