package net.lecnam.ussi47.tp2;

public class Exercice16 {

    public static void main(String[] args) {
        int height = 15;
        String line = "";

        for (int i = 1; i <= height;i++)
        {
            if (i == 1) {
                line = " ".repeat(height - i) + "*";
            } else if (i == height) {
                line = "*".repeat(2*i - 1);
            } else {
                line = " ".repeat(height - i) + "*" + " ".repeat(2*(i-1) - 1) + "*";
            }
            System.out.println(line);
        }

    }
}
