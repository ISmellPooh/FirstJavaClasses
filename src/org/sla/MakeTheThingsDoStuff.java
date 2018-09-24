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

        Plane plane2 = new Plane();
        plane2.modelNumber = "F 16";
        plane2.vehicleType = "aircraft";
        plane2.color = "grey";
        plane2.fuelLoad = 840;
        plane2.range = 1740;
        plane2.speed = 1500;
        plane2.passengerCount = 2;
        plane2.cost = 14600000;
        plane2.origin = "New York";
        plane2.destination = "Miami";
        plane2.travelDistance = 1094;

        System.out.println();
        plane1.describe();
        System.out.println();
        plane1.tripStatus();
        System.out.println();
        plane1.makePlane();
        System.out.println();
        plane2.describe();
        System.out.println();
        plane2.tripStatus();
        System.out.println();
        plane2.makePlane();
    }
}
