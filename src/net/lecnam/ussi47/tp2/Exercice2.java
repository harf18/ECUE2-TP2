package net.lecnam.ussi47.tp2;

import static java.lang.Math.pow;

public class Exercice2 {

    public static void main(String[] args) {
        int cAdjacent = 3;
        int cOppose = 4;
        int hypotenuse = 5;

        boolean test_pytagore = pow(cAdjacent, 2) + pow(cOppose, 2) == pow(hypotenuse, 2);

        if (test_pytagore) System.out.println("Le triangle est rectangle.");

    }
}
