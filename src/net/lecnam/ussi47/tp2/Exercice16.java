package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {
        int hauteur = 5;
        String ligne = "";
        int i = 1 ;
        int a = 1;
        int espaceEntreEtoile = 0;

        for (i = hauteur ; i > 0; i--){
            String espace = " ";
            String etoile = "*";

            String nombreEspace = espace.repeat(i-1);
            String nombreEspaceEntreEtoile = espace.repeat(espaceEntreEtoile);
            if (espaceEntreEtoile == 0){
                System.out.println(nombreEspace + etoile + nombreEspace);
                espaceEntreEtoile = espaceEntreEtoile + 1;
            } else if (i>1){
                System.out.println(nombreEspace + etoile + nombreEspaceEntreEtoile + etoile + nombreEspace);
                espaceEntreEtoile = espaceEntreEtoile + 2;
            } else {
                System.out.println(nombreEspace + etoile + etoile.repeat(espaceEntreEtoile) +  etoile + nombreEspace);
            }
        }
    }
}
