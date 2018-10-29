package org.sla;

class Vehicle {
    private String model;
    private String vehicleType;

     Vehicle(String theModel, String theVehicleType) {

         model = theModel;
         vehicleType = theVehicleType;
     }

     String getModel() {return model; }
     String getVehicleType() {return vehicleType; }

     void describe() {System.out.println("Yo");}
     void tripStatus() {System.out.println("Yo2");}
}