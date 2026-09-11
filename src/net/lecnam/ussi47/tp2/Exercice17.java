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

                    for (int i = 0; i < nbEtoiles; i++) {
                        for (int j = 0; j < nbEtoiles - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < (2 * i + 1); k++) {
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
