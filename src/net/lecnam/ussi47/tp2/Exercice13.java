package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        int nombre = ThreadLocalRandom.current().nextInt(0,9);
        int factorielle = 1;

        System.out.println("Le nombre est " + nombre);

        for (int i = 1 ; i <= nombre ; i++) {
            factorielle *= i;
        }

        System.out.println("Le factorielle de " + nombre + " est " + factorielle);

    }
}
