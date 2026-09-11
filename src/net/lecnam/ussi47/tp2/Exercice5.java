package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        short unradia = 500;
        float surfacePiece ;
        surfacePiece = 3.40f *4.30f *2.30f;
        byte Chauffe = 8;
        float rapportSurface;
        int nombreDeRadiateur;

        rapportSurface = surfacePiece/Chauffe;
        System.out.println(rapportSurface);
        nombreDeRadiateur =  Math.round(rapportSurface);
        System.out.println("il nous faut "+ nombreDeRadiateur + " pour cette surface");


    }
}
