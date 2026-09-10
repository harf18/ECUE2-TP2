package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {

        int surfaceChauffee = 8;
        float longueurPiece = 3.4f;
        float largeurPiece = 4.3f;
        float hauteurPiece = 2.3f;

        float surfacePiece = longueurPiece*largeurPiece*hauteurPiece;

        int nbRadiateursRequis = (int) Math.ceil(surfacePiece / surfaceChauffee);

        System.out.println("Il faut " + nbRadiateursRequis + " radiateurs pour chauffer la pièce");
    }
}
