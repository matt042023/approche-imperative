package fr.algorithmie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AfficheInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Elements du tableau dans l'ordre normal :");

        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("----------------");
        System.out.println("Elements du tableau dans l'ordre inversé :");

        for (int i = array.length -1 ; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

        System.out.println("----------------");
        System.out.println("Copie du tableau");

        int[] arrayCopy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(arrayCopy));



    }
}
