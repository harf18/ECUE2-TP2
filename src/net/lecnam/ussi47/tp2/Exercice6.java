package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        int resultat = ThreadLocalRandom.current().nextInt(0,2);
        if (resultat == 1) {
            System.out.println("True car " + resultat);
        } else {
            System.out.println("False car " + resultat);
        }

    }
}
