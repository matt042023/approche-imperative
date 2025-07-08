package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] tableau = {0, 1, 2, 3};

        System.out.println("Tableau avant rotation :");
        System.out.println(Arrays.toString(tableau));

        if (tableau.length > 1) {
            int dernier = tableau[tableau.length - 1];

            // décaler les éléments vers la droite
            for (int i = tableau.length - 1; i > 0; i--) {
                tableau[i] = tableau[i - 1];
            }

            tableau[0] = dernier;

            System.out.println("Tableau après rotation :");
            System.out.println(Arrays.toString(tableau));
        }
    }
}
