package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");

        for (int i = array.length -1; i>= 0; i--) {
            System.out.println(array[i]);

        }

        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");

       for (int value : array) {
           if (value > 3) {
               System.out.println(value);
           }

       }

        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");

        for (int value : array) {
            if (value % 2 == 0) {
                System.out.println(value);
            }

        }

        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                System.out.println("Index " + i + " : " + array[i]);

            }
        }

        System.out.println(" ");
        System.out.println("---------");
        System.out.println(" ");

        for (int value : array) {
            if (value % 2 != 0) {
                System.out.println(value);
            }

        }






    }
}
