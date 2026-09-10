package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {

        // démontrer le theoreme de pythagore

        byte a = 3;
        byte b = 4;
        byte c = 5;

        int carreA;
        int carreB;
        int carreC;

        int sommeCote;

        carreA = a * a;
        carreB = b * b;
        carreC = c * c;

        sommeCote = carreA + carreB;

        if(sommeCote == carreC)
            System.out.println("theoreme valide.");

    }
}
