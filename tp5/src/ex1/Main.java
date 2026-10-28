package ex1;

import ex2.Verifier;

public class Main {
    public static void main(String[] args) {
        Calcule addition = (a, b) -> a + b;
        Calcule multiplication = (a, b) -> a * b;
        System.out.println(addition.executer(10, 40));
        System.out.println(multiplication.executer(10, 40));
            }
        }