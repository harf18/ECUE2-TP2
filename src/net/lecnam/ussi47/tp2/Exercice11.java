package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        String sigle = "CNAM";
        String premiereLettre = sigle.substring(0, 1).toUpperCase();
        String reste = sigle.substring(1).toLowerCase();
        String resultat = premiereLettre + reste;

        System.out.println(resultat);
    }
}