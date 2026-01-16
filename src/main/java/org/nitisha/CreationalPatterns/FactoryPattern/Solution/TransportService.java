package org.nitisha.CreationalPatterns.FactoryPattern.Solution;

import org.nitisha.CreationalPatterns.FactoryPattern.Problem.Transport;

public class TransportService {

    public static void main(String[] args) {

        Transport vehicle = TransportFactory.createTransport("bike");
        vehicle.deliver();
    }
}
