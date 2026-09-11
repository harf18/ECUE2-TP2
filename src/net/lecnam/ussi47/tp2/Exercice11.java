package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {

        String mot = "CNAM";
        char premiereLettre = mot.charAt(0);
        String autresLettres = mot.substring(1);
        String autresLettresMin = autresLettres.toLowerCase();

        String motFinal = premiereLettre + autresLettresMin;

        System.out.println(motFinal);


    }
}
