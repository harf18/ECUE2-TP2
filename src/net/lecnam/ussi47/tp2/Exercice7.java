package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        int nombreAleatoire = ThreadLocalRandom.current().nextInt(1,101);
        if (nombreAleatoire % 2 == 0){
            System.out.println("Le nombre aléatoire " + nombreAleatoire + " est pair");
        } else {
            System.out.println("Le nombre aléatoire " + nombreAleatoire + " est impair");
        }
    }
}
