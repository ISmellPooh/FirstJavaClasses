package org.sla;

class MakeTheThingsDoStuff {

    public static void main(String[] args) {

        Plane plane1 = new Plane();
        plane1.modelNumber = "Boeing 747";
        plane1.vehicleType = "aircraft";
        plane1.color = "blue";
        plane1.fuelLoad = 48445;
        plane1.range = 7260;
        plane1.speed = 570;
        plane1.passengerCount = 524;
        plane1.cost = 24000000;
        plane1.origin = "Philadelphia";
        plane1.destination = "Los Angeles";
        plane1.travelDistance = 2396;

        System.out.println();
        plane1.describe();
        System.out.println();
        plane1.tripStatus();
        System.out.println();
        plane1.makePlane();
    }
}
