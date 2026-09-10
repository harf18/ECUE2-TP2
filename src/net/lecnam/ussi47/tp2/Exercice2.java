package net.lecnam.ussi47.tp2;
import static java.lang.StrictMath.hypot;

public class Exercice2 {

    public static void main(String[] args) {
        int grandCote = 3 , petitCote = 4 , hypothenus = 5;
        boolean resultat = false;
        resultat =  hypot(grandCote,petitCote)==hypothenus;
        System.out.println(resultat);
    }

}
