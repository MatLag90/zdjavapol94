package whileloop;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
//        1. Stwórz program, który poprosi użytkownika o podanie wartości
//        liczbowej. Następnie program wypisze wszystkie liczby naturalne,
//        aż do zadanej.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int a = scanner.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }
}
