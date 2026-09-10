package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {

        String chaine = "CNAM";

        String resultat = chaine.substring(0, 1) + chaine.substring(1).toLowerCase();

        System.out.println(resultat);
    }
}