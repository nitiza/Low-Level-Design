package org.nitisha.Basics.OOPS;

public class Client {

    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("NitishaDebitCard", new DebitCard("1234", "Nitisha Agarwal"));
        ps.addPaymentMethod("NitishaCreditCard", new CreditCard("5678", "Nitisha Agarwal"));
        ps.addPaymentMethod("NitishaUPI", new UPI("nitisha22"));
        ps.addPaymentMethod("NitishaWallet", new Wallet());

        ps.makePayment("NitishaUPI");

        ps.makePayment("NitishaWallet");
    }
}
