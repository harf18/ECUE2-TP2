package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        float cote = 1.25f ;
        int nombreDePlante;
        float surfaceCult;
        float surfaceParPlante;
        nombreDePlante = 4*9;
        System.out.println(nombreDePlante);
        surfaceCult = cote*cote*4;
        System.out.println(surfaceCult);
        surfaceParPlante = surfaceCult/nombreDePlante;
        System.out.println(surfaceParPlante);
    }
}
