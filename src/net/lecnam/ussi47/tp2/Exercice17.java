package net.lecnam.ussi47.tp2;

import java.util.Scanner;

public class Exercice17 {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            System.out.println("Veuillez sélectionner le nombre d'étoile dans la base du sapin (entre 1 et 20) :");
            System.out.println("Pour quitter, taper une lettre");
            Scanner sc = new Scanner(System.in);
            try {
                int nbEtoiles = Integer.parseInt(sc.nextLine());
                if (nbEtoiles > 0 && nbEtoiles < 21) {
                    System.out.println("Dessin du sapin avec une base de " + nbEtoiles);

                    // Saisir votre code ici
                    for (int i = 1; i <= nbEtoiles; i++) {
                        // Espaces avant les étoiles
                        for (int j = 0; j < nbEtoiles - i; j++) {
                            System.out.print(" ");
                        }
                        // Étoiles
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                }
            } catch (Exception e) {
                break;
            }

            Thread.sleep(3000);

        }

    }
}