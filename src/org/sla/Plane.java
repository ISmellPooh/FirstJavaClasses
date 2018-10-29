package org.sla;

class Plane extends Vehicle{
    private int range;
    private int fuelLoad;
    private String origin;
    private String destination;
    private int travelDistance;
    private String color;
    private double speed;
    private int passengerCount;
    private int cost;
    private double time;
    private double milesPerGallon;
    private double fuelUsed;
    private double fuelLeft;
    private double fillUpPrice;
    private float fuelPrice = (float)2.85;

    Plane(int theRange, int theFuelLoad, int thePassengerCount, int theCost, int theSpeed, String theOrigin,
          String theDestination, int theTravelDistance, String theModel, String theVehicleType, String theColor) {
        super(theModel, "Plane");
        range = theRange;
        fuelLoad = theFuelLoad;
        origin = theOrigin;
        destination = theDestination;
        travelDistance = theTravelDistance;
    }



    void describe() {
        System.out.println("This " + getModel() + " " + getVehicleType() + " has a gorgeous " + color + " paint job.");
        System.out.println("It has a max fuel load of " + fuelLoad + " gallons and a range of " + range + " nautical miles.");
        System.out.println("It has a maximum speed of " + speed + " miles per hour.");
        System.out.println("It has a passenger capacity of " + passengerCount + " people.");
        System.out.println("Finally, it costs $" + cost + ".");
    }

    void tripStatus() {
        System.out.println("Today, this " + getVehicleType() + " is traveling from " + origin + " to " + destination + ".");
        time = (float)travelDistance/(float)speed;
        double time2 = Math.round(time*100.0)/100.0;
        System.out.println("At a constant speed of " + speed + " miles per hour, the trip will take " + time2 + " hours.");
        milesPerGallon = (float)range/(float)fuelLoad;
        double milesPerGallon2 = Math.round(milesPerGallon*100.0)/100.0;
        System.out.println("With its range and fuel capacity, this " + getVehicleType() + " has " + milesPerGallon2 + " miles per gallon.");
        System.out.println("If the distance from " + origin + " to " + destination + " is " + travelDistance + " miles, then how much fuel will be used?");
        fuelUsed = ((float)travelDistance/(float)range)*(float)fuelLoad;
        fuelLeft = (float)fuelLoad-(float)fuelUsed;
        double fuelUsed2 = Math.round(fuelUsed*100.0)/100.0;
        double fuelLeft2 = Math.round(fuelLeft*100.0)/100.0;
        System.out.println("After its trip to " + destination + " this " + getVehicleType() + " will have " + fuelLeft2 + " gallons left over.");
        System.out.println("The " + getVehicleType() + " will need to be given " + fuelUsed2 + " gallons to replenish its lost fuel.");
        fillUpPrice = fuelPrice*(float)fuelUsed;
        double fillUpPrice2 = Math.round(fillUpPrice*100.00)/100.00;
        System.out.println("With the current price of gasoline, it will cost $" + fillUpPrice2 + " to refill on gasoline.");
    }
}
