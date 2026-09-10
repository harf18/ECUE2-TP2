package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        int nSquare = 4;
        int plantBySquare = 9;
        float sideSquareLength = 1.25f;
        float surface = sideSquareLength * sideSquareLength;
        float sidePlantLength = sideSquareLength/plantBySquare;

        float totalSurfaces = 4 * surface;
        int totalPlants = nSquare * plantBySquare;
        float plantSurface = sidePlantLength * sidePlantLength;


        System.out.println("Total surface : " + totalSurfaces);
        System.out.println("Total plantes : " + totalPlants);
        System.out.println("Plante surface : " + plantSurface);


    }
}
