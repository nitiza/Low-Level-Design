package org.nitisha.Basics.OOPS;

import java.util.HashMap;

public class PaymentService {
    //storing + making payments
    private HashMap<String, PaymentMethod> paymentMethods;

    PaymentService() {
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod paymentMethod) {
        paymentMethods.put(name, paymentMethod);
    }

    public void makePayment(String name) {
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay(); // run time polymorphism
    }



}
