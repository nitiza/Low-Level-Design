package org.nitisha.CreationalPatterns.FactoryPattern;

interface Logistics {
    void send();
}

class Road implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending by road logic");

    }
}

class Air implements Logistics {

    @Override
    public void send() {
        System.out.println("Sending by air logic");

    }
}

class LogisticsFactory {
    public static Logistics getLogistics(String mode) {
        if (mode == "Air") {
            return new Air();
        }
        return new Road();
    }
}

class LogisticsService {
    public void send(String mode) {
        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();
    }
}

public class FactoryPatternTUF {

    public static void main(String[] args) {
        LogisticsService service = new LogisticsService();
        service.send("Air");
    }
}
