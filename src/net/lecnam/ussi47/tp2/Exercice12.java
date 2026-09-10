package net.lecnam.ussi47.tp2;

public class Exercice12 {

    public static void main(String[] args) {
        String phrase = "cette phrase contient 11 voyelles";
        String voyelles = "aeiouyAEIOUYàâäéèêëîïôöùûü";
        int compteur = 0;

        for (int i = 0; i < phrase.length(); i++) {
            // Prendre le caractère de l'index i
            char c = phrase.charAt(i);
            // Vérifie si le caractère actuel se trouve dans la chaîne des voyelles
            if (voyelles.indexOf(c) != -1) {
                System.out.println("Voyelle trouvée : " + c);
                compteur++;
            }
        }

        System.out.println("Nombre total de voyelles : " + compteur);

    }
}
