package org.sla;

public class Car extends Vehicle{
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

    void carAge() {
        age = 2018 - yearMade;
        System.out.println("This car is " + age + " years old.");
        if(age >= 50) {
            System.out.println("This car is pretty old.");
        } else {
            System.out.println("This car is fairly new.");
        }
    }
}
}
