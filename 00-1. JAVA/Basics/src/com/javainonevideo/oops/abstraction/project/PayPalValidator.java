package com.javainonevideo.oops.abstraction.project;

class PayPalValidator implements PaymentValidator {
    @Override
    public boolean validatePayment(Payment payment) {
        // Check if the amount is valid
        if (!PaymentValidator.isValidAmount(payment.getAmount())) {
            System.out.println("Amount invalid!");
            return false;
        }
        // Check if the credit card number is valid
        if (!PaymentValidator.isValidCreditCard(payment.getCreditCardNumber())) {
            System.out.println("Credit card invalid!");
            return false;
        }
        // Add more PayPal-specific checks here if needed

        // If all checks pass
        return true;
    }
}