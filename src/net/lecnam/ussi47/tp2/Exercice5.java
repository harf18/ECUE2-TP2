package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {

        //Un radiateur de 500W chauffe 8m3,
        // combien faut-il de radiateurs pour chauffer une pièce de 3,40 x 4,30 x 2,30

        int puissanceRadiateur = 500;
        float volumePourUnRadiateur = 8.3f;

        float dimensionPiece1 = 3.4f;
        float dimensionPiece2 = 4.3f;
        float dimensionPiece3 = 2.3f;

        //calculs
        float volumePiece = dimensionPiece1 * dimensionPiece2 * dimensionPiece3;
        float nbRadiateurPourLaPiece = volumePiece / volumePourUnRadiateur;
        int arrondiNbRadiateurPourLaPiece = Math.round(nbRadiateurPourLaPiece);

        System.out.println("Nombre de radiateurs nécessaires pour la pièce de " + volumePiece + " m3 : " + arrondiNbRadiateurPourLaPiece);


    }
}
