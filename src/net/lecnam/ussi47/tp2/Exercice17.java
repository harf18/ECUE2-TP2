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

                    String ligne = "";
                    int i = 1 ;
                    int a = 1;

                    for (i = nbEtoiles ; i > 0; i--){
                        String espace = " ";
                        String etoile = "*";
                        String nombreEspace = espace.repeat(i-1);
                        String nombreEtoile = etoile.repeat(a);
                        System.out.println(nombreEspace + nombreEtoile + nombreEspace);
                        a = a + 2 ;
                    }


                }
            } catch (Exception e) {
                break;
            }

            Thread.sleep(3000);

        }

    }
}
