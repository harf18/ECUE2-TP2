package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        byte a = 3;
        byte b = 4;
        byte c = 5;
        double resultat , hypo;
        resultat = Math.pow(a,2) + Math.pow(b,2);
        hypo = Math.pow(c,2);
        if (resultat == hypo)
            System.out.println("le théoréme est vérifier");
        else
            System.out.println("le théoréme n'est pas réel");
    }
}
