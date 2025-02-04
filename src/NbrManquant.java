public class NbrManquant {
    public static int trouverNbrManquant(int[] tableau) {

        if (tableau == null || tableau.length == 0) {
            return 0;
        }

        if (tableau[tableau.length - 1] == tableau.length) {
            return 0 ;
        }

        int n = tableau.length + 1;

        int resultatAttendu = (n * (n + 1)) / 2;

        int resultatReel = 0;

        for (int nombre : tableau) {
            resultatReel += nombre;
        }

        int difference = resultatAttendu - resultatReel;
        return difference == 0 ? 0 : difference;
    }
}
