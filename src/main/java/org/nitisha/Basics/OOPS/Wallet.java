package org.nitisha.Basics.OOPS;

public class Wallet implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment via a wallet");
    }
}
