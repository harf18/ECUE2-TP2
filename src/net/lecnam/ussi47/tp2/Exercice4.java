package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {
        int  distanceDeSautParachute = 4000;
        double facteurDeconversionParMetre = 3.28084 ,facteurDeconversion ,distanceDeSautParachuteEnPieds;
        distanceDeSautParachuteEnPieds = distanceDeSautParachute * facteurDeconversionParMetre;
        System.out.printf("facteur de conversion : %.4f %n",facteurDeconversionParMetre);
        System.out.printf("hauteur en pieds %.4f pieds %n %n",distanceDeSautParachuteEnPieds);
    }
}
