package net.lecnam.ussi47.tp2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Exercice12 {

    public static void main(String[] args) {

        String phrase = "cette phrase contient 11 voyelles";
        int nbvoyelle = 0;

        for (int i = 0; i < phrase.length(); i++){
            if (phrase.charAt(i) == 'a' ||  phrase.charAt(i) == 'e' ||  phrase.charAt(i) == 'i' ||  phrase.charAt(i) == 'o' ||  phrase.charAt(i) == 'u' ||  phrase.charAt(i) == 'y') {
                nbvoyelle += 1;
            }
        }

        System.out.println(nbvoyelle);
    }
}
