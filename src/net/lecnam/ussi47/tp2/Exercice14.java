package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {
        String sentence = "Esope reste ici et se repose";
        String sentenceTemp = sentence.toLowerCase().replaceAll("\\s+", "");
        String sentenceTempReverse = "";

        for (int i = sentenceTemp.length() - 1 ; i >= 0;i--)
        {
            sentenceTempReverse += sentenceTemp.charAt(i);
        }

        if (sentenceTemp.equals(sentenceTempReverse)) {
            System.out.println("La phrase \"" + sentence + "\" est un palindrome.");
        }


    }
}
