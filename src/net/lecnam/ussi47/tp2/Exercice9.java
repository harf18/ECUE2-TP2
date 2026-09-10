package net.lecnam.ussi47.tp2;

public class Exercice9 {

    public static void main(String[] args) {
        String chaine = "3896,86 / 4,869 = ";
        String chaineFormat= chaine.replace(',', '.');
        float premierNombre = Float.parseFloat(chaineFormat.substring(0, 7));
        float deuxiemeNombre = Float.parseFloat(chaineFormat.substring(10, 15));
        float resultat = premierNombre / deuxiemeNombre ;
        System.out.println(chaine + resultat);
    }
}

