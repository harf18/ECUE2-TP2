package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        int nbCarres = 4;
        double coteCarre = 1.25;
        int plantesParCarre = 9;

        double surfaceUnCarre = coteCarre * coteCarre;
        double surfaceTotale = surfaceUnCarre * (double) nbCarres;
        int nbPlantesTotal = plantesParCarre * nbCarres;
        double surfaceParPlante = surfaceTotale / nbPlantesTotal;

        System.out.printf("surfaceTotale : %.2f m2 %n",surfaceTotale);
        System.out.printf("Surface d'un carré : %.4f m2%n", surfaceUnCarre);
        System.out.println("Nombre total de plantes cultivables:  " + nbPlantesTotal);
        System.out.printf("Surface disponible par plante : %.2f m2 %n" ,surfaceParPlante);

    }

}
