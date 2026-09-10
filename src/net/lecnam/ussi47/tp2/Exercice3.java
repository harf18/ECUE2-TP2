package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        double coteJardin = 1.25;
        byte nombreDePlante = 9;
        byte nombreDejardin = 4;

        double surfaceUnJardin = coteJardin * coteJardin;
        double surfaceTotalJardin = surfaceUnJardin * nombreDejardin;
        int nombreDePlanteTotal = nombreDePlante * nombreDejardin;
        double surfaceParPlante = surfaceTotalJardin / nombreDePlanteTotal;

        System.out.println("La surface cultivée totale est " + surfaceTotalJardin + "m²");
        System.out.println("On peut planter au total " + nombreDePlanteTotal + " plantes.");
        System.out.println("Chaque plante possède " + surfaceParPlante + "m² pour qu'elle pousse.");
    }
}
