package org.example;

public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Инструмент играет и использует " + Instruments.Strings.GUITAR.count + " струн");
    }
}
