package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String sentence = "cette phrase contient 11 voyelles";
        int count = 0;
        char actChar;

        for (int j = 0; j < sentence.length();j++)
        {
            actChar = sentence.charAt(j);
            switch (actChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    count++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(count + " voyelle(s)");
        }
    }

