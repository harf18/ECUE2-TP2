package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {

        int annee = ThreadLocalRandom.current().nextInt(1900, 2050);

        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0)
            System.out.println("L'année " + annee + " est bissextile");
        else
            System.out.println("L'année " + annee + " n'est pas bissextile");
    }
}
