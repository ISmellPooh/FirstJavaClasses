package org.sla;

public class Car {
    int yearMade;
    int horsePower;
    String carBrand;
    String carModel;
    String sizeOfEngine;

    void describeCar() {
        System.out.println("This is a" + carBrand + carModel + " .");
        System.out.println("It was made in" + yearMade + " .");
        System.out.println("It has a" + horsePower + " horsepower" + sizeOfEngine + " engine.");
    }
}
