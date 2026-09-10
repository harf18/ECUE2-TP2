package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        int facto = ThreadLocalRandom.current().nextInt(0,9);
        double resultat = 1;

        for (int i = 1; i <= facto; i++){
            resultat = resultat*i;
        }
        System.out.println(facto + " factorielle = " +resultat);
    }
}
