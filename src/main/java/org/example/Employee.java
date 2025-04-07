package org.example;

public class Employee {
    String name;
    float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
}

//class Manager extends Employee {
//    public Manager(String name, float salary) {
//        super(name, salary);
//    }
//
//    public void work(){
//        System.out.println("Менеджирует =)");
//    }
//}

//class Developer extends Employee {
//    public Developer(String name, float salary) {
//        super(name, salary);
//    }
//
//    public void work(){
//        System.out.println("Девелоперит =)");
//    }
//}