package org.nitisha.SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if(paymentMethod.equals("Credit Card")) {
            System.out.println("Making payment via Credit Card : " + amount);
        } else if(paymentMethod.equals("Debit Card")) {
            System.out.println("Making payment via Debit Card : " + amount);
        } else if(paymentMethod.equals("Paypal")) {
            System.out.println("Making payment via Paypal : " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}
