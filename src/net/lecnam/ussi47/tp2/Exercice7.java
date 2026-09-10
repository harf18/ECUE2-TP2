package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice7 {

    public static void main(String[] args) {
        byte randomNumber= (byte) ThreadLocalRandom.current().nextInt(0,101);
        if (randomNumber % 2 == 0) {
            System.out.println("Le nombre " + randomNumber + " est pair.");
        } else {
            System.out.println("Le nombre " + randomNumber + " est impair.");
        }
    }
}
