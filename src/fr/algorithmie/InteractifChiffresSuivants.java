package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();

        int[] tableau = new int[10];

        for (int i = 1; i <=10; i++) {
            tableau[i-1] = nombre + i;
        }

        scanner.close();

        System.out.println("Les chiffres suivants du nombre " + nombre + " sont :" + Arrays.toString(tableau));



    }
}
