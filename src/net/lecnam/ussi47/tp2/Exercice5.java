package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        double surfacePiece = 3.4 * 4.3 * 2.3;
        System.out.println(surfacePiece);

        double nombreDeRadiateurTotal = (surfacePiece * 1) / 8;
        System.out.println("Il faut " + Math.ceil(nombreDeRadiateurTotal) + " radiateurs");

    }
}
