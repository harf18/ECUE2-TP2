package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {

        int x = 5;

        for (int i = 1; i <= x; i++) {
            // Espaces avant les étoiles
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            // Dernière ligne : que des étoiles (la base)
            if (i == x) {
                for (int k = 0; k < 2 * i - 1; k++) {
                    System.out.print("*");
                }
            } else {
                // Les autres lignes : une étoile, des espaces, une étoile (sauf la 1ère ligne)
                System.out.print("*");
                if (i > 1) {
                    for (int k = 0; k < 2 * i - 3; k++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
