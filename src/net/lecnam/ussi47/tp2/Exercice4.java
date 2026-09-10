package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {
        int jumpHeightMeter = 4000;
        float keyConvertionMetersFoot = 3.28084f;
        float jumpHeightFoot = jumpHeightMeter * keyConvertionMetersFoot;
        System.out.println("Pour convertire une longueur en metre en pieds, il faut mutliplier la longueur par " + keyConvertionMetersFoot + ".\nAinsi, un saut de " + jumpHeightMeter + "m est de : " + jumpHeightFoot + "ft.") ;
    }
}
