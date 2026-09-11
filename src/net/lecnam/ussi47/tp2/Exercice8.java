package net.lecnam.ussi47.tp2;
import java.util.concurrent.ThreadLocalRandom;

public class Exercice8 {

    public static void main(String[] args) {
        int nombre;

        nombre = ThreadLocalRandom.current().nextInt(1900,2050);
        int reste;
        reste = nombre % 4;
        System.out.println(nombre);
        System.out.println(reste);
        if (reste == 0 && nombre / 100 != 0)
                System.out.println("l'année " + nombre + " est bisextile");
        else if (nombre / 400 == 0) {
                System.out.println("l'année " + nombre + " est bisextile");

            }
        else
            System.out.println(" l'année "+ nombre + " n'est pas bisextile");



    }
}
