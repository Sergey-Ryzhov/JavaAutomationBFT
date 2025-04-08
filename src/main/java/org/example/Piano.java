package org.example;

public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Инструмент играет и использует " + Instruments.Strings.PIANO.count + " струн");
    }
}
