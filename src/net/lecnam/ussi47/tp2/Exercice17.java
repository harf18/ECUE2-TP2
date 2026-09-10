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

                    int correctionTailleSapin = nbEtoiles + ((nbEtoiles-1) % 2);

                    for (int i = 1; i < correctionTailleSapin; i += 2) {
                        if (i == 1){
                            System.out.println(" ".repeat((correctionTailleSapin - 1) / 2 - i / 2) + "*" + " ".repeat((correctionTailleSapin - 1) / 2 - i / 2));
                        } else if (i+2 == correctionTailleSapin) {
                            System.out.println(" ".repeat((correctionTailleSapin - 1)/2 - i/2) + "*".repeat(i) + " ".repeat((correctionTailleSapin - 1)/2 - i/2));
                        } else {
                            System.out.println(" ".repeat((correctionTailleSapin - 1) / 2 - i / 2) + "*" + " ".repeat(i - 2) + "*" + " ".repeat((correctionTailleSapin - 1) / 2 - i / 2));
                        }
                    }


                }
            } catch (Exception e) {
                break;
            }

            Thread.sleep(3000);

        }

    }
}
