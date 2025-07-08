package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interactif21Batons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreBatons = 21;
        boolean tourJoueur = random.nextBoolean(); // tirage au sort du premier joueur

        System.out.println("🎮 Bienvenue au jeu des 21 bâtons !");
        System.out.println("Celui qui prend le dernier bâton a perdu !");
        System.out.println(tourJoueur ? "👉 Vous commencez !" : "🤖 L'ordinateur commence !");

        while (nombreBatons > 1) {
            afficherBatons(nombreBatons);

            int prise;

            if (tourJoueur) {
                prise = demanderPrise(scanner, nombreBatons);
                System.out.println("✅ Vous avez pris " + prise + " bâton(s).");
            } else {
                prise = coupOrdinateur(nombreBatons);
                System.out.println("🤖 L'ordinateur prend " + prise + " bâton(s).");
            }

            nombreBatons -= prise;

            // Si 1 bâton reste → prochain joueur perd
            if (nombreBatons == 1) {
                System.out.println("\nIl ne reste qu’un seul bâton !");
                System.out.println(tourJoueur
                        ? "💀 Vous devez le prendre... vous avez perdu !"
                        : "🏆 L'ordinateur doit le prendre... vous avez gagné !");
                break;
            }

            tourJoueur = !tourJoueur; // on change de joueur
        }
    }

    // Méthode pour demander la prise du joueur
    public static int demanderPrise(Scanner scanner, int batonsRestants) {
        int prise;
        do {

            System.out.print("Combien de bâtons voulez-vous prendre (1 à 3) ? ");
            while (!scanner.hasNextInt()) {
                System.out.print("❗ Entrez un nombre valide (1 à 3) : ");
                scanner.next();
            }
            prise = scanner.nextInt();
        } while (prise < 1 || prise > 3 || prise >= batonsRestants);
        return prise;
    }

    // Méthode pour calculer le coup de l'ordinateur
    public static int coupOrdinateur(int batonsRestants) {
        if ((batonsRestants - 1) % 4 != 0) {
            return (batonsRestants - 1) % 4;
        } else {
            return Math.min(3, batonsRestants - 2); // évite de laisser 1 bâton
        }
    }

    public static void afficherBatons(int nombreBatons) {
        System.out.println("\nIl reste " + nombreBatons + " bâton(s)");
        for (int i = 0; i < nombreBatons; i++) {
            System.out.print("| ");
        }
        System.out.println();
    }
}
