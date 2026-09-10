package net.lecnam.ussi47.tp2;

public class Exercice5 {

    public static void main(String[] args) {
        byte volumeHeatedByRadiator = 8;
        float l = 4.30f;
        float w = 3.40f;
        float h = 2.30f;
        float totalVolume = l * w * h;
        byte nbOfRadiator = (byte) Math.ceil(totalVolume/volumeHeatedByRadiator);
        System.out.println("Il faut " + nbOfRadiator + " radiateur pour cette pièce. (volumme de : " + totalVolume + "m\u00B3)");
    }
}
