package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nombres = new int[5];
        int taille = 0;

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Sectionnez votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez un nombre à ajouter : ");
                    int nouveau = scanner.nextInt();


                    if (taille == nombres.length) {
                        nombres = agrandirTableau(nombres);
                    }

                    nombres[taille] = nouveau;
                    taille++;
                    System.out.println("Nombre ajouté !");
                    break;

                case 2:
                        System.out.println("📦 Nombres stockés :");
                        for (int i = 0; i < taille; i++) {
                            System.out.print(nombres[i] + " ");
                        }
                        System.out.println();
                    break;

                case 3:
                    System.out.println("👋 Fin du programme. Au revoir !");
                    continuer = false;
                    break;

                default:
                    System.out.println("❌ Option invalide. Veuillez choisir 1, 2 ou 3.");
            }
        }
    }

    // Méthode pour doubler la taille d’un tableau manuellement
    public static int[] agrandirTableau(int[] ancien) {
        int[] nouveau = new int[ancien.length * 2];
        System.arraycopy(ancien, 0, nouveau, 0, ancien.length);
        ;
        return nouveau;

    }
}
