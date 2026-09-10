package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        byte unRadiacteurChauffeEnMettreCarre = 8 ;
        float tailleDeLaPieceEnMettreCarre = 3.40f * 4.30f * 2.30f ;
        float nombreDeRadiateurPourChaufferLaPiece = tailleDeLaPieceEnMettreCarre / unRadiacteurChauffeEnMettreCarre ;
        System.out.println("le nombre de radiateur qu'il faut pour réchauffer la pièce est " + nombreDeRadiateurPourChaufferLaPiece);
    }
}
