package org.example;

import com.mifmif.common.regex.util.Iterable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Box> boxCollection = new ArrayList<>();

        boxCollection.add(new Box(31, 24, 38));
        boxCollection.add(new Box(19, 17, 12));
        boxCollection.add(new Box(30.1, 10, 47));

        List<Box> smallBoxes = new ArrayList<>();
        List<Box> bigBoxes = new ArrayList<>();

        Iterator<Box> iterator = boxCollection.iterator();
        while(iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30) {
                bigBoxes.add(box);
            } else {
                smallBoxes.add(box);
            }
        }

        System.out.println("Маленькие коробки:");
        for (Box box : smallBoxes) {
            System.out.println(box);
        }

        System.out.println("\nБольшие коробки:");
        for (Box box : bigBoxes) {
            System.out.println(box);
        }
    }
}