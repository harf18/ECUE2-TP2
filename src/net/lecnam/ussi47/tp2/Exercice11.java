package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        String enMajuscule = "CNAM";
        String result = enMajuscule.substring(0,1).toUpperCase() + enMajuscule.substring(1,4).toLowerCase();
        System.out.println(result);

    }
}
