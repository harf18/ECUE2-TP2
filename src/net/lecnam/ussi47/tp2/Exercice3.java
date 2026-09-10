package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        float surfaceCarreJardin = 1.25f * 1.25f ;
        float surfaceCultivable = 4 * surfaceCarreJardin ;
        byte nombreDePlanteCultivable = 9 * 4 ;
        float surfaceParPlante = surfaceCarreJardin / 9 ;
        System.out.println("La surface cultivée est de " + surfaceCultivable + ", le nombre plantes cultivables est de " + nombreDePlanteCultivable + " et la surface par plante est de " + surfaceParPlante + ".");

    }
}
