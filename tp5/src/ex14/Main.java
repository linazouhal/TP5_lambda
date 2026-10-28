package ex14;

public class Main {
    public static void main(String[] args) {
        Comparateur test = (s1, s2) -> s1.length() == s2.length();

        String[] mots = {"orange", "pomme", "cerise"};

        for (int i = 0; i < mots.length; i++) {
            for (int j = i + 1; j < mots.length; j++) {
                System.out.println(
                        mots[i] + " et " + mots[j] + " : "
                                + test.comparer(mots[i], mots[j])
                );
            }
        }
    }
}
