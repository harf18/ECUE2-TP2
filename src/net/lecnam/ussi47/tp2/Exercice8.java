package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {

        int annee = ThreadLocalRandom.current().nextInt(1900,2050);

        if (annee % 4 != 0) {
            System.out.println("Non bissextile car " + annee);
        } else if (annee % 100 != 0) {
            System.out.println("Bissextile car " + annee);
        } else if (annee % 400 != 0) {
            System.out.println("Non bissextile car " + annee);
        } else {
            System.out.println("Bissextile car " + annee);
        }

    }
}
