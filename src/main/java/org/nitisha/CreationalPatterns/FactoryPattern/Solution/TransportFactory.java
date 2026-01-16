package org.nitisha.CreationalPatterns.FactoryPattern.Solution;

import org.nitisha.CreationalPatterns.FactoryPattern.Problem.Transport;

import java.util.Locale;

public class TransportFactory {

    public static Transport createTransport(String type) {
        switch(type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Unsupported transport type");
        }
    }
}
