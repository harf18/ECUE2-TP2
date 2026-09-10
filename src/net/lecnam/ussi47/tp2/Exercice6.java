package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {
        byte randomNumber= (byte) ThreadLocalRandom.current().nextInt(0,2);
        if (randomNumber == 0) {
            System.out.println(randomNumber + " : " + false);
        } else if (randomNumber == 1) {
            System.out.println(randomNumber + " : " + true);
        }
    }
}
