package org.sla;

class MakeTheThingsDoStuff {

    public static void main(String[] args) {

        Plane plane1 = new Plane();
        plane1.modelNumber = "Boeing 747";
        plane1.vehicleType = "Aircraft";
        plane1.color = "Blue";
        plane1.fuelLoad = 48455;
        plane1.speed = 570;
        plane1.passengerCount = 524;
        plane1.cost = 24000000;
        plane1.origin = "Philadelphia";
        plane1.destination = "Los Angeles";

        plane1.describe();
    }
}
