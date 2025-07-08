package fr.algorithmie;

import java.util.HashSet;
import java.util.Set;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        Set<Integer> set1 = new HashSet<>();
        for (int val : array1) {
            set1.add(val);
        }


        int compteurCommun = 0;
        Set<Integer> dejaComptes = new HashSet<>();

        for (int val : array2) {
            if (set1.contains(val) && !dejaComptes.contains(val)) {
                compteurCommun++;
                dejaComptes.add(val); // éviter de compter 2 fois
            }
        }

        System.out.println("Nombre d'éléments en commun : " + compteurCommun);
    }
}
