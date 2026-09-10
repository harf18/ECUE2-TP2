package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {

        int nbVoyelles = 0;
        String phrase = "cette phrase contient 11 voyelles";
        int lengthPhrase = phrase.length();

        for (int i = 0; i < lengthPhrase; i++) {
            if (phrase.substring(i, i+1).equals("a") || phrase.substring(i, i+1).equals("e") || phrase.substring(i, i+1).equals("i") || phrase.substring(i, i+1).equals("o") || phrase.substring(i, i+1).equals("u") || phrase.substring(i, i+1).equals("y")) {
                nbVoyelles += 1;
            }
        }

        System.out.println("La phrase possède " + nbVoyelles + " voyelles");

    }
}
