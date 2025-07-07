package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] entier = { 8, -7, 12, 1, -2, 14, 17, 9 };

        System.out.println(entier.length);
        System.out.println(entier[0]);
        System.out.println(entier[entier.length -1]);

        // Le code echou car il n'y a pas de valeur à l'index 10 du tableau
        System.out.println(entier[10]);
    }
}
