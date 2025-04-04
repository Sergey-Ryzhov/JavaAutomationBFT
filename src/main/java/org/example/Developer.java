package org.example;

public class Developer extends Employee{
    public Developer(String name, float salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(name +" девелоперит =) и получает за работу " + salary + " динариев");
    }
}
