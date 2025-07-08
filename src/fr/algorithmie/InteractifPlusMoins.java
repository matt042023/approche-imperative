package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Random random = new Random();
        int secret = random.nextInt(100);

        int essai;
        int coup= 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entré un nombre entre 1 et 100 :");
        do {
            essai = scanner.nextInt();
            if (essai < secret) {
                System.out.println("Le nombre recherché est plus grand");
                coup++;
            } else if (essai > secret) {
                System.out.println("Le nombre recherché est plus petit");
                coup++;
            }
        }while (essai != secret);

        System.out.println("Vous avez gagné en " + coup + " coups");






    }
}
