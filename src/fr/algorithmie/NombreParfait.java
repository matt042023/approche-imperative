package fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int n = 28;

        int somme = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                somme += i;
            }
        }

        if (somme == n) {
            System.out.println("Le nombre " + n + " est un nombre parfait");
        } else {
            System.out.println("Le nombre " + n + " n'est pas un nombre parfait");
        }


    }
}
