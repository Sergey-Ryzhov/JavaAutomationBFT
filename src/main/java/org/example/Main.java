package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array1 = new String[3];
        array1[0] = "привет";
        array1[1] = "ПОКА";
        array1[2] = "гипербола";

        System.out.println(array1[0].toUpperCase());
        System.out.println(array1[1].toLowerCase());
        System.out.println(array1[2]);

        StringBuilder stbuild = new StringBuilder();
        for (int i = 0; i < array1.length; i++) {
            String word = array1[i];
            if (word.contains("О")) {
                stbuild.append(word);
                stbuild.insert(1, ' ');
                stbuild.insert(3, ' ');
            }
        }
        System.out.println(stbuild);

    }
}


//    String[] array1 = new String[3];
//
//        array1[0]= "привет";
//                array1[1]= "ПОКА";
//                array1[2]= "гипербола";
//
//                System.out.println(array1[0].toUpperCase());
//                System.out.println(array1[1].toLowerCase());
//                System.out.println(array1[2]);
//                StringBuilder stbuild = new StringBuilder(array1[1]);
//                stbuild.insert(1,' ');
//                stbuild.insert(3,' ');
//                System.out.println(stbuild);
//    Scanner scan = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//    float sum = scan.nextInt();
//        if (sum <= 0) {
//        System.out.println("Вы ввели неверную сумму вклада: " + sum);
//        scan.remove();
//    } else {
//        System.out.println("Вы ввели сумму вклада: " + sum);
//    }
//
//        System.out.print("Введите срок вклада: ");
//    int month = scan.nextInt();
//        if (month <= 0) {
//        System.out.println("Вы ввели неверный срок вклада: " + month);
//        scan.remove();
//    } else {
//        System.out.println("Вы ввели срок вклада: " + month);
//    }
//
//    float percent = 0.07f;
//    float result = sum;
//    // Расчет с использованием for
//        System.out.println("\nРасчет с использованием for:");
//        for (int depositTerm = 1; depositTerm <= month; depositTerm++) {
//        result = result + (result * percent);
//        System.out.println("После " + depositTerm + " месяцев сумма вклада составит " + result);
//    }
//    // Расчет с использованием while
//    result = sum;
//    int depositTerm = 1;
//        System.out.println("\nРасчет с использованием while:");
//        while (depositTerm <= month) {
//        result = result + (result * percent);
//        System.out.println("После " + depositTerm + " месяцев сумма вклада составит " + result);
//        depositTerm++;

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