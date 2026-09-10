package net.lecnam.ussi47.tp2;

public class Exercice14 {

    public static void main(String[] args) {
        String sentenceReceived = "Esope reste ici et se repose";
        String normaliseSentence = sentenceReceived.trim().toLowerCase().replace(" ","");
        byte sentenceSize =(byte) normaliseSentence.length();
        byte midSentence;
        boolean isPalindrome = true;
        if (sentenceSize % 2 == 0) {
            midSentence =(byte) (sentenceSize/2);
        } else {
            midSentence =(byte) ((sentenceSize-1)/2);
        }
        for (byte i = 0 ; i < midSentence && isPalindrome; i++) {
                String leftLetter = normaliseSentence.substring(i, i + 1);
                String rightLetter = normaliseSentence.substring(sentenceSize - 1 - i, sentenceSize -i);
                if (leftLetter.equals(rightLetter)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }
        if (isPalindrome) {
            System.out.println("La phrase \"" + sentenceReceived + "\" est un palindrome");
        } else {
            System.out.println("La phrase \"" + sentenceReceived + "\" n'est un palindrome");
        }
    }
}
