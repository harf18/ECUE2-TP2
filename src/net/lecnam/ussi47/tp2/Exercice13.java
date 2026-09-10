package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        byte n = (byte) ThreadLocalRandom.current().nextInt(0,9);
        int result = 1;
        for (int i = 1 ; i < n ; i++) {
            result = result * (i + 1);
        }
        System.out.println(n +"! vaut "+ result);
    }
}
