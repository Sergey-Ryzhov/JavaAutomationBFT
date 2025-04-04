package org.example;

public class Manager extends Employee {
    public Manager(String name, float salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(name + " менеджирует =) и получает за работу " + salary + " шекелей");
    }
}

