package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = { "Montpellier", "Beziers", "Toulouse", "Marseille", "Nice" };

        System.out.println(villes[0]);
        System.out.println(villes[1]);
        System.out.println(villes[2]);
        System.out.println(villes[3]);
        System.out.println(villes[4]);
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("longeur du tableau : " + villes.length);

        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");

        villes[3] = "Reims";

        for (String ville : villes) {
            System.out.println(ville);
        }


        // equivalent à :
        /*
         * for (int i = 0; i < villes.length; i++) {
         *  System.out.println(villes[i]);
         * }
         * */
    }
}
