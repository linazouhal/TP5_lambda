package ex2;

public class Main {
    public static void main(String[] args) {
    Verifier pair = n -> n % 2 == 0;
    int[] nombre = {5, 8, 13, 20};
        System.out.println("les nombres pair :");
        for (int n : nombre) {
        if (pair.tester(n)) {
            System.out.println(n);
        }
    }
}}
