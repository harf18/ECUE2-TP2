package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice6 {

    public static void main(String[] args) {

        int test = ThreadLocalRandom.current().nextInt(0,2);
        boolean unOuZero;


        if (test == 0)
            unOuZero = false;
        else
            unOuZero = true;


        System.out.println(unOuZero);
    }
}
