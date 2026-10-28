package ex6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filtre lettre = let -> let.startsWith("A");

        Filtre filtre = f -> f.startsWith("A");

        List<String> fruits = Arrays.asList(
                "Ananas", "Banane", "Abricot", "Cerise"
        );

        for (String f : fruits) {
            if (filtre.verifier(f)) {
                System.out.println(f);
            }
        }
    }
}
