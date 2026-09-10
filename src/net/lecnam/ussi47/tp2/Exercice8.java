package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int randYear = ThreadLocalRandom.current().nextInt(1900,2050);

        // Fist way
        if (((randYear % 4 == 0) && (randYear % 100 != 0)) || (randYear % 400 == 0)) {
            System.out.println(randYear + " est une année bissextile.");
        } else {
            System.out.println(randYear + " n'est pas une année bissextile");
        }
    }
}
