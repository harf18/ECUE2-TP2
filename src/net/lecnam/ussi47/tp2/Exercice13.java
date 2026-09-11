package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice13 {

    public static void main(String[] args) {
        int val = ThreadLocalRandom.current().nextInt(0,9);
        int factorielleVal = 1;

        for (int i = val; i > 0;i--)
        {
            factorielleVal *= i;
        }

        System.out.println(val + "! = " + factorielleVal);
    }
}
