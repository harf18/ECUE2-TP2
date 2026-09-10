package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        byte a = 3;
        byte b = 4;
        byte c = 5;
        double resultPythagore = Math.pow(a, 2) + Math.pow(b, 2);
        if (resultPythagore == Math.pow(c, 2)) {
            System.out.println("Le triangle est un triangle rectangle");
        } else {
            System.out.println("Le triangle n'est pas un triangle rectangle");
        }
    }
}
