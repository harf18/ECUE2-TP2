package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {

        //Un jardinier amateur veut créer 4 carrés jardin de 1,25m x 1,25m.
        // Il peut planter 9 plantes par carré.
        // Ecrire un programme qui affiche la surface cultivée, le nombre plantes cultivables
        // et la surface par plante.


        // valeurs de base
        byte nbJardins = 4;
        float coteJardins = 1.25f;
        byte nbPlantesParJardins = 9;

        // valeurs calculées
        double surfaceJardins = Math.pow(coteJardins, 2);
        double surfaceCultivee = nbJardins * surfaceJardins;
        int nbPlantesCaltivables = nbJardins * nbPlantesParJardins;
        double surfaceParPlante = surfaceCultivee / nbPlantesCaltivables;

        System.out.println("surface cultivee : " + surfaceCultivee);
        System.out.println("nombre de plantes cultivables : " + nbPlantesCaltivables);
        System.out.println("surface par plante : " + surfaceParPlante);

    }
}
