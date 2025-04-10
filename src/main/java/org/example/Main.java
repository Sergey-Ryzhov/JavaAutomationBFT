package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        System.out.println("Случайное число от 0 до 2: " + randomNumber);

        String[] array1 = new String[3];
        array1[0] = "привет";
        array1[1] = "ПОКА";
        array1[2] = "гипербола";
        switch (randomNumber) {
            case 0:
                System.out.println("Слово из массива: " + array1[0]);
                break;
            case 1:
                System.out.println("Слово из массива: " + array1[1]);
                break;
            case 2:
                System.out.println("Слово из массива: " + array1[2]);
                break;
        }

    }
}