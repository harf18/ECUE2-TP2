package net.lecnam.ussi47.tp2;

import static java.lang.Math.pow;

public class Exercice2 {

    public static void main(String[] args) {
        int c_adjacent = 3;
        int c_oppose = 4;
        int hypotenuse = 5;

        boolean test_pytagore = pow(c_adjacent, 2) + pow(c_oppose, 2) == pow(hypotenuse, 2);

        if (test_pytagore) System.out.println("Le triangle est rectangle.");

    }
}
