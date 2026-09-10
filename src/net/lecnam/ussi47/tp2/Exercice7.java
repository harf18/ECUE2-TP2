package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int nombrePairOuImpair = ThreadLocalRandom.current().nextInt(1,101);

        if (nombrePairOuImpair % 2 == 0 ) {
            /*Si le chiffre est pair*/
            System.out.println("Le nombre " + nombrePairOuImpair + " est pair");
        } else {
            /*Si le chiffre est impair*/
            System.out.println("Le nombre " + nombrePairOuImpair + " est impair");
        }

    }
}
