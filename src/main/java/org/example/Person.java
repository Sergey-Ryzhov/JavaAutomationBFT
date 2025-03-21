package org.example;

public class Person {
    public String name;
    public static String lastName = "Иванов";
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson(){
        System.out.println("Name:" + name + "\nLastName:" + lastName + "\nAge:" + age);
    }
}