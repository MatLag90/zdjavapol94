package pl.sdacademy.methods;

import java.util.Arrays;

public class Easy {
    public static void main(String[] args) {
        System.out.println("-------- Zadanie 1 --------");
        exercise1();

        System.out.println("\n-------- Zadanie 2 --------");
        exercise2("ABCDE");

        System.out.println("\n-------- Zadanie 3 --------");
        System.out.println(exercise3());
        // Inny przykład użycia metody exercise3 (przypisanie wyniku wywołania do zmiennej)
        int ex3 = exercise3();
        System.out.println("Wartość przypisana do zmiennej ex3: " + ex3);

        System.out.println("\n-------- Zadanie 5 --------");
        System.out.println(exercise5("XYZ"));

        System.out.println("\n-------- Zadanie 7 --------");
        int[] intArray = {10, 12, 4, 9};
        System.out.println(exercise7(intArray));

        System.out.println("\n-------- Zadanie 8 --------");
        String[] stringArray = {"Aaaa", "Bbbb", "Cccc"};
        System.out.println(exercise8(stringArray, 2));

        System.out.println("\n-------- Zadanie 9 --------");
        System.out.println(exercise9("A"));
        System.out.println(exercise9(""));

        System.out.println("\n-------- Zadanie 10 --------");
        int[] ex10 = exercise10();
        for (int element : ex10) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(exercise10()));
    }

    //    1. Stwórz metodę, która będzie bezparametrowa, która wypisze
//    w konsoli "Zadanie 1".
    private static void exercise1() {
        System.out.println("Zadanie 1");
    }

    //    2. Stwórz metodę, która wypisze w konsoli wartość tekstową, zadaną za
//    pomocą parametru.
    private static void exercise2(String text) {
        System.out.println(text);
    }

    //    3. Stwórz metodę, która będzie bezparametrowa, a która zwraca liczbę
//    całkowitą 5.
    private static int exercise3() {
        return 5;
    }

    //    5. Stwórz metodę, która przyjmie parametr typu String, a która zwróci
//    długość otrzymanej wartości.
    private static int exercise5(String text) {
        return text.length();
    }

    //    7. Stwórz metodę, która przyjmuje parametr - tablicę intów, a która
//    zwróci wartość jej pierwszego elementu.
    private static int exercise7(int[] intArray) {
        return intArray[0];
    }

    //    8. Stwórz metodę, która przyjmie parametry - tablicę stringów oraz liczbę całkowitą.
//    Metoda zwróci element tablicy o indeksie wskazanym za pomocą drugiego parametru.
    private static String exercise8(String[] stringArray, int index) {
        return stringArray[index];
    }

    //    9. Stwórz metodę, która przyjmie parametr typu String. Metoda zwróci odpowiedź na pytanie,
//    czy jego długość jest większa od 0.
    private static boolean exercise9(String text) {
        return text.length() > 0;
    }

    //    10. Stwórz metodę. Zwróci ona tablicę intów, zawierającą elementy: 5, 10, 15.
    private static int[] exercise10() {
        // Wersja 1:
        return new int[]{5, 10, 15};
        // Wersja 2:
//        int[] result = {5, 10, 15};
//        return result;
    }
}
