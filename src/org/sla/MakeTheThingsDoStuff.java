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

        Car car1 = new Car();
        car1.carBrand = "Plymouth";
        car1.carModel = "Barracuda";
        car1.yearMade = 1971;
        car1.sizeOfEngine = "V8";
        car1.horsePower = 440;

        car1.describeCar();
        car1.carAge();

        Car car2 = new Car();
        car2.carBrand = "Dodge";
        car2.carModel = "Charger";
        car2.yearMade = 2018;
        car2.sizeOfEngine = "V8";
        car2.horsePower = 707;

        car2.describeCar();
        car2.carAge();

        Car car3 = new Car();
        car3.carBrand = "Bugatti";
        car3.carModel = "Veyron";
        car3.yearMade = 2011;
        car3.sizeOfEngine = "V16";

        Car mostPowerfulCar = car1;
        if (car2.horsePower > car1.horsePower) {
            mostPowerfulCar = car2;
        }
        if (car3.horsePower > car1.horsePower & car3.horsePower > car2.horsePower) {
            mostPowerfulCar = car3;
        }

        System.out.println("The most powerful car is " + mostPowerfulCar+ " .");
        mostPowerfulCar.describeCar();
    }
}
