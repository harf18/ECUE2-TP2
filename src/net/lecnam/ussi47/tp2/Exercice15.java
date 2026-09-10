package net.lecnam.ussi47.tp2;

public class Exercice15 {

    public static void main(String[] args) {
        int height = 15;
        String line = "";

        for (int i = 1; i <= height;i++)
        {
            line = " ".repeat(height - i) + "*".repeat(2*i - 1);
            System.out.println(line);
        }


    }
}
