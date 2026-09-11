package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;
public class Exercice7 {

    public static void main(String[] args) {

        int nombre;

        nombre = ThreadLocalRandom.current().nextInt(0,101);
        int reste = nombre % 2;
        if (reste == 1)
            System.out.println("le nombre " + nombre + " est impaire");
        else
            System.out.println("le nombre " + nombre + " est paire");


    }
}
