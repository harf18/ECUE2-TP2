package net.lecnam.ussi47.tp2;

import java.util.Locale;

public class Exercice11 {

    public static void main(String[] args) {
        String chaine = "CNAM" ;
        String premiereLettre = chaine.substring(0, 1);
        String reste = chaine.substring(1, 4);
        String minReste = reste.toLowerCase();
        System.out.println(premiereLettre + minReste);
    }
}
