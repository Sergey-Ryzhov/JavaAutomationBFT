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


