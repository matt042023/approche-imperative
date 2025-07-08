package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rang N pour calculer F(N) dans la suite de Fibonacci : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("❌ Le rang doit être un entier positif.");
            return;
        }

        int resultat = fibonacci(n);
        System.out.println("F(" + n + ") = " + resultat);
    }

    // Méthode iterative pour calculer F(n)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b; // somme des deux précédents
            a = b;
            b = c;
        }

        return c;
    }
}

