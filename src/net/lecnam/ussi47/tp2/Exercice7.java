package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {

        int test = ThreadLocalRandom.current().nextInt(1,101);

        if (test % 2 == 0) {
            System.out.println("Le chiffre " + test + " est pair.");
        }
        else
            System.out.println("Le chiffre " + test + " est impair.");

    }
}
