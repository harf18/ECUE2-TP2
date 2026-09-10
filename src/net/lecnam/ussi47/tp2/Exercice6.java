package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        int trueOrFalse = ThreadLocalRandom.current().nextInt(0,2);

        System.out.println("Le résultat est : " + trueOrFalse);
        if (trueOrFalse == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
