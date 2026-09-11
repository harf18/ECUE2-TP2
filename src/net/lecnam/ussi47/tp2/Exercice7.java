package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int resultat = ThreadLocalRandom.current().nextInt(1,101);

        if (resultat % 2 == 0) {
            System.out.println(resultat + " est pair");
        } else {
            System.out.println(resultat + " est impair");
        }
    }
}
