package net.lecnam.ussi47.tp2;

public class Exercice2 {

    public static void main(String[] args) {

        int cote1 = 3;
        int cote2 = 4;
        int cote3 = 5;

        int resultat = cote1 * cote1 + cote2 * cote2;
        int carreHypotenuse = cote3 * cote3;

        System.out.println("3² + 4² = " + resultat);
        System.out.println("5² = " + carreHypotenuse);

        if (resultat == carreHypotenuse) {
            System.out.println("Le théorème de Pythagore est vérifié.");
        } else {
            System.out.println("Le théorème de Pythagore n'est pas vérifié.");
        }
    }
}
