package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {

        int nbAleatoire = ThreadLocalRandom.current().nextInt(0,9);
        int resultat = 1;

        for (int i = 1; i <= nbAleatoire; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de " + nbAleatoire + " est " + resultat);

    }
}
