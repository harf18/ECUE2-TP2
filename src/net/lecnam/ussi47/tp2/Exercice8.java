package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        short randomYear = (short) ThreadLocalRandom.current().nextInt(1900,2050);
        if (((randomYear % 4 == 0) && (randomYear % 100 != 0)) || (randomYear % 400 == 0)) {
            System.out.println("L'année : " + randomYear + " est bissextile");
        } else {
            System.out.println("L'année : " + randomYear + " n'est pas bissextile");
        }
    }
}
