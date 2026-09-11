package net.lecnam.ussi47.tp2;

import java.util.Scanner;

public class Exercice15 {

    public static void main(String[] args) {

        int x = 5;

        for (int i = 1; i <= x; i++) {
            // Espaces avant les étoiles
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            // Étoiles
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
