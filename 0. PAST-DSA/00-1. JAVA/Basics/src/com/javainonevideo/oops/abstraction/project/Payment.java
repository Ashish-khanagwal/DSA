package com.javainonevideo.oops.abstraction.project;

// Payment.java
    public class Payment {
        private double amount;
        private String creditCardNumber;

        // Constructor
        public Payment(double amount, String creditCardNumber) {
            this.amount = amount;
            this.creditCardNumber = creditCardNumber;
        }

        // Getters and Setters
        public double getAmount() {
            return amount;
        }

        public String getCreditCardNumber() {
            return creditCardNumber;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setCreditCardNumber(String creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
        }
    }