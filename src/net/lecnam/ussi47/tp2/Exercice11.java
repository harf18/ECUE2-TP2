package net.lecnam.ussi47.tp2;

public class Exercice11 {

    public static void main(String[] args) {
        String texteReceived = "CNAM";
        String texteModified = texteReceived.substring(0,1).toUpperCase() + texteReceived.substring(1).toLowerCase();
        System.out.println("Texte reçu : " + texteReceived + "\nTexte modifier : " + texteModified);
    }
}
