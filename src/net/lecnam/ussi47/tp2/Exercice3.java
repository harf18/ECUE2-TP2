package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {

            double tailleCarre = 1.25;
            int nbCarre = 4;
            int nbPlanteParCarre = 9;
            double surface = tailleCarre * tailleCarre * nbCarre;
            int nbPlantesTot = nbCarre * nbPlanteParCarre;

            System.out.println("Surface cultivable : " + surface + "m²");
            System.out.println("Nombre de plantes cultivables : " + nbPlantesTot);
            System.out.println("Surface par plantes : " + surface/nbPlantesTot + "m²/plante");

    }
}
