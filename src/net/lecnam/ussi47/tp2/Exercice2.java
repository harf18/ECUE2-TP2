package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {

        int coteAB = 3;
        int coteBC = 4;
        int coteAC = 5;

        if ((coteAC * coteAC) == (coteBC * coteBC) + (coteAB * coteAB)) {
            System.out.println("Théorème validé");
        } else {
            System.out.println("Théorème refusé");
        }

    }
}
