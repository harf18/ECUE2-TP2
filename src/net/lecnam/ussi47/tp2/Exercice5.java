package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {

        int volumeDeChauffageDUnRadiateurDe500W = 8;
        double volumeDeLaPieceAChauffer = 3.40*4.30*2.30;
        double  nbRadiateurPourNotrePieceAchauffer = volumeDeLaPieceAChauffer / (double) volumeDeChauffageDUnRadiateurDe500W;
        int nbRadiateurArrondiEntier = (int) Math.ceil(nbRadiateurPourNotrePieceAchauffer);
        System.out.println("Nombre de radiateur :"+ nbRadiateurArrondiEntier);
    }
}
