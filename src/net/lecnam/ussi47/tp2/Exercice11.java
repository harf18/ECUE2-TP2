package net.lecnam.ussi47.tp2;

import java.util.Locale;

public class Exercice11 {

    public static void main(String[] args) {
        String texte = "DGAC";
        char premiereLettre = texte.charAt(0);
        String finDuMot = texte.substring(1, texte.length()).toLowerCase();

        System.out.println(premiereLettre + finDuMot);

    }
}
