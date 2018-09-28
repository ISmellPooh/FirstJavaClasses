package org.sla;

class Vehicle {
    //private int range;
    //private int fuelLoad;
    private int passengerCount;
    private int cost;
    private int speed;
    //private String origin;
    //private String destination;
    //private int travelDistance;
    private String model;
    private String vehicleType;
    private String color;

     Vehicle(int thePassengerCount, int theCost, int theSpeed, String theModel, String theVehicleType,
             String theColor) {

         passengerCount = thePassengerCount;
         cost = theCost;
         speed = theSpeed;
         model = theModel;
         vehicleType = theVehicleType;
         color = theColor;
     }

     int getPassengerCount() {return passengerCount; }
     int getCost() {return cost; }
     int getSpeed() {return speed;}
     String getModel() {return model; }
     String getVehicleType() {return vehicleType; }
     String getColor() {return color; }

     void describe() {System.out.println("Yo");}
     void tripStatus() {System.out.println("Yo2");}
}