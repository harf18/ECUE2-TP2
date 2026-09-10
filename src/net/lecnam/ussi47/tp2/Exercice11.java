package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        String word = "CNAM";
        String firstLetter = word.substring(0, 1);
        String restWord = word.substring(1);

        String capitalizeWord = firstLetter.toUpperCase() + restWord.toLowerCase();

        System.out.println(capitalizeWord);
    }
}
