package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {

        int aleatoire = ThreadLocalRandom.current().nextInt(0,101);

        if (aleatoire % 2 == 1) {
            System.out.println("Impair car " + aleatoire);
        } else {
            System.out.println("Pair car " + aleatoire);
        }

    }
}
