package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {

        //Les parachutistes sautent souvent à 4000 mètres.
        // Afficher le facture de conversion et calculer et afficher la hauteur en "pieds" ?

        // valeurs
        short hauteurSaut = 4000;
        float facteurMultiplicatif = 3.28084f;

        //calculs
        double hauteurSautPieds = hauteurSaut * facteurMultiplicatif;

        System.out.println("Facteur de conversion : " + facteurMultiplicatif);
        System.out.println("Hauteur du saut en pieds : " + hauteurSautPieds);

    }
}
