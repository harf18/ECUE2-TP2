package net.lecnam.ussi47.tp2;

public class Exercice9 {

    public static void main(String[] args) {
        String chaine = "3896,86 / 4,869 = ";
        String nombre1 = chaine.substring(0,7);
        String nombre2 = chaine.substring(10,15);
        System.out.println(nombre2);
        float transtyp_nombre1 = Float.parseFloat(nombre1.replace(",","."));
        float transtyp_nombre2 = Float.parseFloat(nombre2.replace(",","."));
        System.out.println(transtyp_nombre1);
        float resultat = transtyp_nombre1/transtyp_nombre2;
        System.out.println(chaine + resultat);


    }
}
