package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        int i,fact = 1;
        int nombreAleatoire = ThreadLocalRandom.current().nextInt(0,9);

        for (i = 1 ; i <= nombreAleatoire ; i++ ){
            fact = fact * i;
        }
        System.out.println("Le factorielle de " + nombreAleatoire + " est : " + fact);
    }
}
