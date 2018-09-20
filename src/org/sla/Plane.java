package org.sla;

class Plane {
    int fuelLoad;
    int passengerCount;
    int cost;
    int speed;
    int range;
    String modelNumber;
    String vehicleType;
    String color;
    String origin;
    String destination;
    int travelDistance;
    double milesPerGallon;

    void describe() {
        System.out.println("This " + modelNumber + " " + vehicleType + " has a gorgeous " + color + " paint job.");
        System.out.println("It has a max fuel load of " + fuelLoad + " gallons and a range of " + range + " nautical miles.");
        System.out.println("It has a maximum speed of " + speed + " miles per hour.");
        System.out.println("It has a passenger capacity of " + passengerCount + " people.");
        System.out.println("Finally, it costs $" + cost + ".");
    }

    void tripStatus() {
        System.out.println("Today, this " + vehicleType + " is traveling from " + origin + " to " + destination + ".");
        milesPerGallon = (float)range/(float)fuelLoad;
        double milesPerGallon2 = Math.round(milesPerGallon*100.0)/100.0;
        System.out.println("With its range and fuel capacity, this " + vehicleType + " has " + milesPerGallon2 + " miles per gallon.");
        System.out.println("If the distance from " + origin + " to " + destination + " is " + travelDistance + " miles, then how much of its fuel capacity will be used?");
    }
}
