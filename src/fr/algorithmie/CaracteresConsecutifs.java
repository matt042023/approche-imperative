package fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String chaine = "aaabbc";
        StringBuilder resultat = new StringBuilder();

        char courant = chaine.charAt(0);
        int compteur = 1;

        for (int i = 1; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            if (c == courant) {
                compteur++;
            } else {
                resultat.append(courant).append(compteur);
                courant = c;
                compteur = 1;
            }
        }

        // Ajouter le dernier groupe
        resultat.append(courant).append(compteur);

        System.out.println("Chaîne compressée : " + resultat);
    }
}
