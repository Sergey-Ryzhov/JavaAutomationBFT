package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван",20);
        person1.printPerson();
        person1.name="Семен";
        person1.age=30;
        person1.printPerson();
    }
}