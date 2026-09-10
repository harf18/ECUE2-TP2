package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        int nombre = ThreadLocalRandom.current().nextInt(0, 2);

        if (nombre == 1) {
            System.out.println("True");
        }
        if (nombre == 0) {
            System.out.println("False");
        }
    }
}
