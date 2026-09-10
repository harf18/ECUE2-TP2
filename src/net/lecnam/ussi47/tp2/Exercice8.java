package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int anneeAleatoire = ThreadLocalRandom.current().nextInt(1900,2050);
        if ((anneeAleatoire % 4 == 0 && anneeAleatoire % 100 != 0)|| anneeAleatoire % 400 == 0){
            System.out.println("L'année " + anneeAleatoire + " est bissextile");
        } else {
            System.out.println("L'année " + anneeAleatoire + " n'est pas bissextile");
        }
    }
}
