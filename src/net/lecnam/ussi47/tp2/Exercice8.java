package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int annee = ThreadLocalRandom.current().nextInt(1900,2050);

        /*
        Sachant qu'une année est bissextile si :
        - si elle est divisible par 4 et non divisible par 100, ou
        - si elle est divisible par 400.
        */
        boolean estBissextile = (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);

        if (estBissextile) {
            System.out.println("L'année " + annee + " est une année bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas une année bissextile.");
        }
    }
}
