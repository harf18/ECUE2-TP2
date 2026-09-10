package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        if (ThreadLocalRandom.current().nextInt(0,2) == 1) {
            boolean resultat = true ;
            System.out.println(resultat);
        } else {
            boolean resultat = false ;
            System.out.println(resultat);
        }
    }
}
