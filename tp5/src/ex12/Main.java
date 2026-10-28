package ex12;

public class Main {
    public static void main(String[] args) {
        OperationTableau sommet = tableau -> {
            int s = 0;
            for (int n : tableau) {
                s += n;
            }
            System.out.println("Somme = " + s);
        };

        OperationTableau pairs = tableau -> {
            for (int n : tableau) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }}};
    }
}
