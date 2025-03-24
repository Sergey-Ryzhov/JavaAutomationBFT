package org.example;

public class Car {
    public String model;
    public int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void makeBeBe(int year) {
        if (year <= 1985) {
            System.out.println(model + "- Гудит громко");
        } else if (year > 1999) {
            System.out.println(model + "- Не гудит");
        } else {
            System.out.println(model + "- Гудит тихо");
        }

    }
}

