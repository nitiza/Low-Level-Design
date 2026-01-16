package org.nitisha.CreationalPatterns.FactoryPattern.Solution;

import org.nitisha.CreationalPatterns.FactoryPattern.Problem.Transport;

public class Car implements Transport {

    @Override
    public void deliver() {
        System.out.println("Deliver by car");
    }
}
