package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {
        int cote1 = 3;
        int cote2 = 4;
        int cote3 = 5;

        int sommeCarres = cote1 * cote1 + cote2 * cote2;

        int carreHypotenuse = cote3 * cote3;

        if (sommeCarres == carreHypotenuse) {
            System.out.println("Le triangle est rectangle");
        } else {
            System.out.println("Le triangle n'est pas rectangle");
        }
    }
}