package ex3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Transformateur majuscule = s -> s.toUpperCase();
    Transformateur inverser = s -> new StringBuilder(s).reverse().toString();
    String chaine[] = {"java", "lambda", "exercice"};
        for (String c : chaine) {
        System.out.println(majuscule.transformer(c));
        System.out.println(inverser.transformer(c));
    }
    List<String> chaines = Arrays.asList("Pomme", "Banane", "orange", "ananas");
        chaines.sort((String s1, String s2) -> s1.compareTo(s2));
        System.out.println(chaines);
        chaines.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(chaines);
}}
