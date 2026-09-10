package net.lecnam.ussi47.tp2;

public class Exercice4 {

    public static void main(String[] args) {
        int hauteurParachutiste = 4000;
        double conversionPied = 3.28084;

        double hauteurEnPied = hauteurParachutiste * conversionPied;

        System.out.println("1 mètre correspond à " + conversionPied + " pieds.");
        System.out.println("Le parachutiste saute de " + hauteurEnPied + " pieds. (4000m)");
    }
}
