package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {

        int nombre = ThreadLocalRandom.current().nextInt(1, 101);

        if (nombre % 2 == 0)
            System.out.println("Le nombre " + nombre + " est Pair");
        else
            System.out.println("Le nombre " + nombre + " est Impair");
    }
}