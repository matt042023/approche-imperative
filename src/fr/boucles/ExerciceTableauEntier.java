package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(tab[0]);

        System.out.println(tab.length);

        System.out.println(tab[tab.length -1]);

        tab[4] = 8;
        for (int num: tab)
            System.out.println(num);
    }
}
