package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {

        int aleatoire = ThreadLocalRandom.current().nextInt(0,2);

        if (aleatoire == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
