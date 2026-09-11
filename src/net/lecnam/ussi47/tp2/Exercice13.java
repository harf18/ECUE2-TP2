package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {

        int nombre = ThreadLocalRandom.current().nextInt(0,9);
        int i = 1;
        int calcul = 1;

        while (true) {
            calcul = calcul * nombre;
            nombre--;
            if (nombre == 0) {
                break;
            }
        }
        System.out.println(calcul);
    }
}
