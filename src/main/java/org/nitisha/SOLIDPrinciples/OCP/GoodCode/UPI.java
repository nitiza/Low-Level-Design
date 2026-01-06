package org.nitisha.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment via a UPI");
    }
}
