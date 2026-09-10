package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u','y'};
        String sentenceReceived = "cette phrase contient 11 voyelles";
        byte sentenceSize =(byte) sentenceReceived.length();
        short nbVowels = 0;
        for (byte i = 0 ; i < sentenceSize; i++) {
            for (char vowel : vowels) {
                if (sentenceReceived.charAt(i) == vowel) {
                    nbVowels += 1;
                    break;
                }
            }
        }
        System.out.println("Le nombre de voyelles dans la phrase \""+ sentenceReceived + "\" est de : "+ nbVowels);
    }
}
