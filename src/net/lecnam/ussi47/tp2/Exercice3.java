package net.lecnam.ussi47.tp2;

public class Exercice3 {

    public static void main(String[] args) {
        int n_square = 4;
        int plant_by_square = 9;
        float side_square_length = 1.25f;
        float surface = side_square_length * side_square_length;
        float side_plant_length = side_square_length/plant_by_square;

        float total_surfaces = 4 * surface;
        int total_plants = n_square * plant_by_square;
        float plant_surface = side_plant_length * side_plant_length;


        System.out.println("Total surface : " + total_surfaces);
        System.out.println("Total plantes : " + total_plants);
        System.out.println("Plante surface : " + plant_surface);


    }
}
