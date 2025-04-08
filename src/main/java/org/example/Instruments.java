package org.example;

public class Instruments {
    public enum Strings {
        GUITAR(6),
        PIANO(230);

        Strings(int count) {
            this.count = count;
        }

        int count;


    }
}
