package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauDiff {
    public static void main(String[] args) {
        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int tailleMax = Math.max(tableau1.length, tableau2.length);
        int[] tableauSomme = new int[tailleMax];

        for (int i = 0; i < tailleMax; i++) {
            int valeur1 = tableau1[i];
            int valeur2 = i < tableau2.length ? tableau2[i] : 0;
            tableauSomme[i] = valeur1 + valeur2;
        }

        System.out.println("Tableau 1 : " + Arrays.toString(tableau1));
        System.out.println("Tableau 2 : " + Arrays.toString(tableau2));
        System.out.println("Somme des tableaux : " + Arrays.toString(tableauSomme));
    }
}
