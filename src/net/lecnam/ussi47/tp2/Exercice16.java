package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < x - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 2; i < x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j < 2 * (i - 1) - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        if (x > 1) {
            for (int i = 0; i < 2 * x - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
