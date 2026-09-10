package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {

        int nbJardin = 4;
        float longueurLargeurJardin = 1.25f;
        int nbPlantesParJardin =9;

        float surfaceJardin = longueurLargeurJardin * longueurLargeurJardin;
        int nbPlantes = nbJardin * nbPlantesParJardin;
        float surfParPlante = surfaceJardin / nbPlantesParJardin;
        float surfaceCultivee = surfaceJardin * nbJardin;

        System.out.println("La surface totale cultivée est de " + surfaceCultivee + "m²");
        System.out.println(nbPlantes + " plantes sont cultivables dans ce jardin");
        System.out.println("Chaque plante a un espace de " + surfParPlante + " pour grandir");

    }
}
