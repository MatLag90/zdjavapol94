package pl.sdacademy;

public class ZadaniaTablice {
    public static void main(String[] args) {
        System.out.println("--------- Zadanie 3 --------");
        System.out.println(zadanie3(new int[]{4, 4, 6}, new int[]{2, 5, 1}));
        int[] array1 = {10, 8};
        int[] array2 = {1, 5, 9};
        System.out.println(zadanie3(array1, array2));

        System.out.println("--------- Zadanie 4 --------");
        System.out.println(zadanie4(new int[]{3, 5, 7}, 5));
        System.out.println(zadanie4(array1, 8));
    }

    //    Napisz metodę statyczną zadanie3, która przyjmie jako argumenty dwie tablice
//    intów, a która zwróci sumę elementów obu tablic.
    private static int zadanie3(int[] array1, int[] array2) {
        int result = 0;
        for (int element : array1) {
            result += element;
        }
        for (int element : array2) {
            result += element;
        }
        return result;
    }

    //    Napisz metodę statyczną zadanie4, która przyjmie jako argumenty tablicę intów
//    i wartość typu int, a która zwróci odpowiedź na pytanie, czy w tablicy mamy
//    element o wartości równej drugiemu argumentowi.
    private static boolean zadanie4(int[] array, int searchedElement) {
        for (int element : array) {
            if (element == searchedElement) {
                return true;
            }
        }
        return false;
    }
}
