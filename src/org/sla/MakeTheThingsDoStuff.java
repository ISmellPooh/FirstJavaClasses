package org.sla;

class MakeTheThingsDoStuff {

    public static void main(String[] args) {

        //Plane plane1 = new Plane();
        //plane1.range = 7260;
        //plane1.fuelLoad = 48445;
        //plane1.passengerCount = 524;
        //plane1.cost = 24000000;
        //plane1.speed = 570;
        //plane1.origin = "Philadelphia";
        //plane1.destination = "Los Angeles";
        //plane1.travelDistance = 2396;
        //plane1.model = "Boeing 747";
        //plane1.vehicleType = "aircraft";
        //plane1.color = "blue";

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Plane(7260, 48445, 524, 24000000,
                570, "Philadelphia", "Los Angeles", 2396,
                "Boeing 747", "aircraft", "blue");

        vehicle[1] = new Plane(1740, 838, 2, 14600000,
                1500, "Boston", "Seattle", 2486,
                "F-16","aircraft", "silver");

        System.out.println();

        for (int i = 0; i < 2; i++) {
            vehicles[i].describe();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            vehicles[i].tripStatus();
        }
        System.out.println();

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
        car3.horsePower = 1200;

        car3.describeCar();
        car3.carAge();

        Car mostPowerfulCar = car1;
        if (car2.horsePower > car1.horsePower) {
            mostPowerfulCar = car2;
        }
        if (car3.horsePower > car1.horsePower & car3.horsePower > car2.horsePower) {
            mostPowerfulCar = car3;
        }

        System.out.println("The most powerful car is the " + mostPowerfulCar.yearMade + " " + mostPowerfulCar.carBrand + " " + mostPowerfulCar.carModel + " with " + mostPowerfulCar.horsePower + " horsepower.");
    }
}
