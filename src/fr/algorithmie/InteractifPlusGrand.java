package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez un nombre :");
            int nombre = scanner.nextInt();
            if (nombre > max) {
                max = nombre;
            }

        }

        System.out.println("Le plus grand nombre est " + max);

        scanner.close();
    }
}
