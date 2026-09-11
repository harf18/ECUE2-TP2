package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {

        int annee = ThreadLocalRandom.current().nextInt(1900,2050);

        if(annee % 400 == 0)
            System.out.println("L'année " + annee + " est divisible par 400 donc elle est bisextile.");
        else if((annee % 4 == 0) && (annee % 100 != 0))
            System.out.println("L'année " + annee + " est divisible par 4 et non divisible par 100 donc elle est bisextile.");
        else
            System.out.println("L'année " + annee + " n'est pas bisextile.");

    }
}
