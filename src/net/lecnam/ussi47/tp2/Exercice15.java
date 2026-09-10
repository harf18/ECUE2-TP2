package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {

        int tailleSapin = 11;
        int correctionTailleSapin = tailleSapin + ((tailleSapin-1) % 2);

        for (int i = 1; i < correctionTailleSapin; i += 2) {
            System.out.println(" ".repeat((correctionTailleSapin - 1)/2 - i/2) + "*".repeat(i) + " ".repeat((correctionTailleSapin - 1)/2 - i/2));
        }

    }
}
