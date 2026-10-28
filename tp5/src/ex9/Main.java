package ex9;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> test = n -> n > 10;

        int[] t = {5, 12, 7, 18, 3};

        for (int n : t) {
            if (test.test(n)) {
                System.out.println(n);
            }
        }
    }
}
