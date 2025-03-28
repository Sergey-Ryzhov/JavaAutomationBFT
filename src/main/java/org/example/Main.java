package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        int sum = scan.nextInt();
        if (sum <= 0) {
            System.out.println("Вы ввели неверную сумму вклада: " + sum);
            scan.remove();
        } else {
            System.out.println("Вы ввели сумму вклада: " + sum);
        }

        System.out.print("Введите срок вклада: ");
        int month = scan.nextInt();
        if (month <= 0) {
            System.out.println("Вы ввели неверный срок вклада: " + month);
            scan.remove();
        } else {
            System.out.println("Вы ввели срок вклада: " + month);
        }

        float percent = 0.07f;
        float result = sum;

        for (int depositTerm = 1; depositTerm <= month; depositTerm++) {
            result = result + (result * percent);
            System.out.println("После " + depositTerm + " месяцев сумма вклада составит " + result);
        }


//        Car car = new Car("Mercedes", 1985);
//        Car car2 = new Car("BMW", 1999);
//        car.makeBeBe(1985);
//        car2.makeBeBe(1999);
//        car2.model = "Volkswagen";
//        car2.makeBeBe(2010);

//        Person person1 = new Person("Иван",20);
//        person1.printPerson();
//        person1.name="Семен";
//        person1.age=30;
//        person1.printPerson();
    }
}