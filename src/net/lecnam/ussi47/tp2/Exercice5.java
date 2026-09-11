package net.lecnam.ussi47.tp2;




public class Exercice5 {

    public static void main(String[] args) {
        float radiatorHeatingCapacity = 8.3f;
        float roomArea = 3.40f * 4.30f * 2.30f;

        double calcInter = roomArea/radiatorHeatingCapacity;

        int nRadiator = (int) Math.ceil(calcInter);

        System.out.println(nRadiator + " radiateurs.");




    }
}
