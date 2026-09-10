package net.lecnam.ussi47.tp2;

import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int annee = ThreadLocalRandom.current().nextInt(1900,2050);

         if (annee % 4 == 0 & annee % 100 != 0) {
             System.out.println(annee + " est une année bissextile");
         } else if (annee % 400 == 0) {
             System.out.println(annee + " est une année bissextile");
         } else {
             System.out.println(annee + " n'est pas une année bissextile");
         }
    }
}
