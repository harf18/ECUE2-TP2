package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {
        int meanFallDistance = 4000;
        float coeffFeet = 3.28084f;
        float meanFallDistanceInFeet = meanFallDistance * coeffFeet;

        System.out.println(meanFallDistance + " x " + coeffFeet + " = " + meanFallDistanceInFeet);
    }
}
