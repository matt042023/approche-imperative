package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Valeur supérieur à 3 :");

        for (int value : array) {
            if (value > 3) {
                System.out.println(value);
            }
        }

        System.out.println("----------------");
        System.out.println("valeurs paires :");
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }

        System.out.println("----------------");
        System.out.println("valeurs des index paires :");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + " : " + array[i]);
            }
        }

        System.out.println("----------------");
        System.out.println("valeurs impaires :");
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }

    }
}
