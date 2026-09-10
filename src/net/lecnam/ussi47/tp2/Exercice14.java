package net.lecnam.ussi47.tp2;

import java.util.Locale;

public class Exercice14 {

    public static void main(String[] args) {
        String phrase = "Esope reste ici et se repose";
        String phraseMinuscule = phrase.toLowerCase();
        String phraseSansEspace = phraseMinuscule.replaceAll("\\s","");
        String phraseSansEspaceALEnvere = "";

        for(int i = phraseSansEspace.length()-1; i>=0; i--){
            phraseSansEspaceALEnvere = phraseSansEspaceALEnvere + phraseSansEspace.charAt(i);
        }

        String PhraseInverser =  new String (phraseSansEspaceALEnvere) ;

        if (phraseSansEspace.equals(PhraseInverser)){
            System.out.println("La phrase est un palindrome");
        } else {
            System.out.println("La phrase n'est pas un palindrome");
        }
    }
}
