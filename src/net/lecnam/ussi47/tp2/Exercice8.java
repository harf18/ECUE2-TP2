package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int nombre = ThreadLocalRandom.current().nextInt(1900,2050 );
        System.out.println(nombre);
        if ((nombre % 4 == 0 && nombre % 100 != 0) || (nombre % 400 == 0)) {
            System.out.println("L'année est bissextile");
        } else {
            System.out.println("L'année n'est pas bissextile");
        }
    }
}
