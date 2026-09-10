package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        byte nbGarden = 4;
        float sideSizeByGarden = 1.25f;
        byte plantByGarden = 9;
        float totalGardenSize = nbGarden * (sideSizeByGarden * sideSizeByGarden);
        byte totalPlant = (byte) (nbGarden * plantByGarden);
        float surfaceByPlant = totalGardenSize/totalPlant;
        System.out.println("La taille totale du jardin cultivé est de : "+ totalGardenSize + "m\u00B2.\n Le nombre totale de plante cultivable est de : " + totalPlant + ".\n La surface par plante est de : " + surfaceByPlant + "m\u00B2.");
        // ² = \u00B2
    }
}
