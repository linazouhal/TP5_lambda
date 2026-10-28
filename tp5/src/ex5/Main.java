package ex5;

public class Main {
    public static void main(String[] args) {
        Operation somme = (a, b) -> a + b;
        Operation multi = (a, b) -> a * b;
        int nbr[] = {1, 2, 3, 4};
        int s = 0;
        int m = 1;
        for (int n : nbr) {
            s = somme.calculer(s, n);
            m = multi.calculer(m, n);
        }
        System.out.println("somme :" + s);
        System.out.println("multiplication:" + m);
    }
}
