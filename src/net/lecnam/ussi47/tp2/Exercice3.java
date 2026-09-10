package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        int nbCarre = 4;
        float surfaceCarre = 1.25f * 1.25f;
        int nbPlantesParCarre = 9;

        float surfaceTotale = nbCarre * surfaceCarre;
        float nbPlantesTotales = nbCarre * nbPlantesParCarre;
        float surfaceParPlantes = surfaceTotale / nbPlantesTotales;

        System.out.println(surfaceTotale);
        System.out.println(nbPlantesTotales);
        System.out.println(surfaceParPlantes);
    }
}
