package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tableau = {3, 7, 2, 3};

        boolean result = tableau.length >= 1 && (tableau[0] == tableau[tableau.length - 1]);

        System.out.println("Le résultat est : " + result);
    }
}
