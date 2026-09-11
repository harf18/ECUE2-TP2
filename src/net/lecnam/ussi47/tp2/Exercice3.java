package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        int nbcarrejardin = 4;
        float longueurjardin = 1.25f;
        float largeurjardin = 1.25f;
        int fleurparcarre = 9;

        float surfacecultivee = longueurjardin * largeurjardin * nbcarrejardin;
        float nbplantecultivable = fleurparcarre * nbcarrejardin;
        float surfaceparplante = surfacecultivee / nbplantecultivable;

        System.out.println("La surface cultivée est de " + surfacecultivee + " m²");
        System.out.println("Le nombre de plantes cultivables est de " + nbplantecultivable);
        System.out.println("La surface par plante est de " + surfaceparplante + " m²");

    }
}
