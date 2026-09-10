package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {
        int hauteur = 9;
        String ligne = "";
        int i = 1 ;
        int a = 1;

        for (i = hauteur ; i > 0; i--){
            String espace = " ";
            String etoile = "*";
            String nombreEspace = espace.repeat(i-1);
            String nombreEtoile = etoile.repeat(a);
            System.out.println(nombreEspace + nombreEtoile + nombreEspace);
            a = a + 2 ;
        }
    }
}
