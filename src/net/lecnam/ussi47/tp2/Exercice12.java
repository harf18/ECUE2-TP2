package net.lecnam.ussi47.tp2;

import java.util.*;

public class Exercice12 {

    public static void main(String[] args) {

        String phrase = "cette phrase contient 11 voyelles";

        // Liste des voyelles
        List<Character> voyelles = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

        // Liste des consonnes
        List<Character> consonnes = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z');

        int i = 0;

        int nbVoyelles = 0;

        while (i < phrase.length()) {
            char lettre = phrase.charAt(i);

            if (voyelles.contains(lettre)) {
                nbVoyelles++;
            }



            //System.out.println(lettre);
            i++;
        }
        System.out.println("nombre de voyelles : " + nbVoyelles);

    }
}
