package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nombre = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }

        System.out.println("La somme des premiers " + nombre + " entiers est : " + somme);

        scanner.close();
    }
}
