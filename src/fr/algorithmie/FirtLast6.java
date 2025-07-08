package fr.algorithmie;

public class FirtLast6 {
    public static void main(String[] args) {
        int[] tableau = {5, 1, 2, 3, 4};

        boolean result = tableau.length > 0 && (tableau[0] == 6 || tableau[tableau.length - 1] == 6);

        System.out.println("Le résultat est : " + result);
    }
}
