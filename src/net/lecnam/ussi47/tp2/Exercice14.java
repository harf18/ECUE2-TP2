package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {

        String phrase = "Esope reste ici et se repose";
        String phraseLower = phrase.toLowerCase().replace(" ", "");
        int longueurPhrase = phraseLower.length();
        boolean palindrome = true;

        for (int i = 0; i < longueurPhrase; i++) {

            if (!phraseLower.substring(i, i+1).equals(phraseLower.substring(longueurPhrase-i-1, longueurPhrase-i))) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("La phrase \"" + phrase + "\" est un palindrome");
        } else {
            System.out.println("La phrase \"" + phrase + "\" n'est pas un palindrome");
        }


    }
}
