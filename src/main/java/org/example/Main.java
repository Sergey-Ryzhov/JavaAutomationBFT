package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mercedes", 1985);
        Car car2 = new Car("BMW", 1999);
        car.makeBeBe(1985);
        car2.makeBeBe(1999);
        car2.model = "Volkswagen";
        car2.makeBeBe(2010);

//        Person person1 = new Person("Иван",20);
//        person1.printPerson();
//        person1.name="Семен";
//        person1.age=30;
//        person1.printPerson();
    }
}