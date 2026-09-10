package net.lecnam.ussi47.tp2;

import java.util.Arrays;
import java.util.List;

public class Exercice12 {

    public static void main(String[] args) {
        List<String> voyelles = Arrays.asList("a", "e", "i", "o", "u", "y");
        String phraseAComparer = "cette phrase contient 11 voyelles";
        int compteur = 0;

        for (int i = 0 ; i < phraseAComparer.length() ;i++ ){
            String lettre = String.valueOf(phraseAComparer.charAt(i));
            if (voyelles.contains(lettre)){
                compteur++;
            }
        }
        System.out.println("le nombre de voyelle dans la phrase est : " + compteur);
    }
}
