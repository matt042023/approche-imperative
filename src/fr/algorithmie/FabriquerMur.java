package fr.algorithmie;

public class FabriquerMur {

    public static void main(String[] args) {
        // Appels de tests
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int maxBigUsables = Math.min(longueur / 5, nbBig);         // Max de briques 5m utilisables
        int reste = longueur - (maxBigUsables * 5);                // Ce qu'il reste à combler
        return reste <= nbSmall;                                   // Peut-on combler le reste avec les 1m ?
    }

    public static void verifier(int nbSmall, int nbBig, int longueur, boolean attendu) {
        boolean resultat = fabriquerMur(nbSmall, nbBig, longueur);
        System.out.println("nbSmall=" + nbSmall + ", nbBig=" + nbBig + ", longueur=" + longueur
                + " → attendu=" + attendu + ", obtenu=" + resultat + " → "
                + (resultat == attendu ? "✅ OK" : "❌ ERREUR"));
    }

}