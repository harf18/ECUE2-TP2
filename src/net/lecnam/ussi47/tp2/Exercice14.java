package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {

        String phrase = "Esope reste ici et se repose";
        String phraseLower = phrase.toLowerCase();
        String phraseSansEspaces = phraseLower.replace(" ", "");

        int i = 0;
        int j = (phraseSansEspaces.length() - 1);
        boolean palindrome = true;

        while(true){
            char a = phraseSansEspaces.charAt(i);
            char b = phraseSansEspaces.charAt(j);
            if (a!=b) {

                palindrome = false;
                break;
            }
            else if (i == (phraseSansEspaces.length() - 1)) {
                break;
            }
            i++;
            j--;
        }
        if (palindrome == false)
            System.out.println("La phrase n'est pas un palimdrome.");
        else
            System.out.println("La phrase est un palimdrome.");

    }
}
