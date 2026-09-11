package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {
        String phrase = "Esope reste ici et se repose";
        int milieu = 0;
        String partie1 = "";
        String partie2 = "";

        if (phrase.length() % 2 == 0) {
            milieu = phrase.length() / 2;

            partie1 = phrase.substring(0,milieu-1);
            partie2 = phrase.substring(milieu);
        } else {
            milieu = phrase.length() / 2;

            partie1 = phrase.substring(0,milieu);
            partie2 = phrase.substring(milieu+1);
        }

        String inverse = new StringBuilder(partie2).reverse().toString();
        System.out.println(milieu);
        System.out.println(inverse);
        System.out.println(partie1);

        if(inverse.replaceAll("\\s+", "").equalsIgnoreCase(partie1.replaceAll("\\s+", ""))) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("PAS PALINDROME");
        }
    }
}
