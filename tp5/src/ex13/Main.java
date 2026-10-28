package ex13;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> aire =
                (longueur, largeur) -> longueur * largeur;

        System.out.println(aire.apply(5, 3));
        System.out.println(aire.apply(7, 2));

    }
}
