public class Main {
    public static void main(String[] args) {

        int[] exemple1 = {1, 2, 4, 5, 6 };
        int[] exemple2 = {2, 3, 1, 5};

        int[] test1 = {};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Exemple 1: Le nombre manquant est " +
                NbrManquant.trouverNbrManquant(exemple1));

        System.out.println("Exemple 2: Le nombre manquant est " +
                NbrManquant.trouverNbrManquant(exemple2));


        System.out.println("Test 1: " + NbrManquant.trouverNbrManquant(test1));
        System.out.println("Test 2: " + NbrManquant.trouverNbrManquant(test2));
    }
}