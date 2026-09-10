package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int val = ThreadLocalRandom.current().nextInt(1,101);
        if (val % 2 == 0) {
            System.out.println("le chiffre (" + val + ") est pair.");
        } else {
            System.out.println("le chiffre (" + val + ") est impair.");
        }

    }
}
