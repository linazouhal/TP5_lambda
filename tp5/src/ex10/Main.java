package ex10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animaux = new ArrayList<>(
                Arrays.asList("chat", "chien", "cheval")
        );

        animaux.forEach(an -> System.out.println(an.toUpperCase()));

        animaux.sort(String::compareTo);
        System.out.println(animaux);
    }
}
