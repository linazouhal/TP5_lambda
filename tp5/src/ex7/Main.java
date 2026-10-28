package ex7;

import ex8.Compareur;

public class Main {
    public static void main(String[] args) {
        Calculateur division = (x, y) -> x / y;
        Calculateur puissance = (x, y) -> Math.pow(x, y);

        System.out.println(division.effectuer(10, 2));
        System.out.println(puissance.effectuer(2, 3));

        Compareur max = (a, b) -> a > b ? a : b;

        int[] tab = {12, 5, 8, 20};
        int grand = tab[0];

        for (int n : tab) {
            grand = max.comparer(grand, n);
        }

        System.out.println("Plus grand = " + grand);

    }
}
