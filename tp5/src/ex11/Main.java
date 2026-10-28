package ex11;

public class Main {
    public static void main(String[] args) {
        VerifierPalindrome test =
                t -> t.equals(new StringBuilder(t).reverse().toString());

        String[] mots = {"kayak", "java", "radar", "lambda"};

        for (String t : mots) {
            System.out.println(t + " : " + test.estPalindrome(t));
        }
    }
}
