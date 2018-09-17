package org.sla;

class Plane {
    int fuelLoad;
    int passengerCount;
    int cost;
    String vehicleType;
    String color;
    String origin;
    String destination;

    void describeThing() {
        System.out.println("This " + vehicleType + " has a gorgeous " + color + " paint job.");
        System.out.println("It has a max fuel load of " + fuelLoad + " gallons.");
        System.out.println("It has a passenger capacity of " + passengerCount + ".");
        System.out.println("Finally, it costs $" + cost + ".");
    }

    void tripStatus() {}
}
