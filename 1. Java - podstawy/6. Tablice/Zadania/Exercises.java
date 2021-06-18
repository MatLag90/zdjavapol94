package arrays;

public class Exercises {
    public static void main(String[] args) {
        // Tablica utworzona na potrzebę przykładowych wywołań metod z zadań
        int[] array = {4, 33, 1};

        System.out.println("Zadanie 1");
//        print(new int[]{4, 33, 1});
        print(array);

        System.out.println("\nZadanie 2");
        System.out.println(getSecondElement(array));

        System.out.println("\nZadanie 4");
        System.out.println(getMax(array));

        System.out.println("\nZadanie 6");
        System.out.println(getSum(array));
    }

    //    1. Napisz metodę print, która wypisze w konsoli elementy tablicy
//    intów, przekazanej jako parametr.
    public static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

//    2. Napisz metodę getSecondElement, która przyjmuje parametr - tablicę intów,
//    a która zwróci wartość drugiego elementu tej tablicy.
    public static int getSecondElement(int[] array) {
        return array[1];
    }

//    4. Napisz metodę getMax, która przyjmie za parametr tablicę intów,
//    a która zwróci największą wartość z tej tablicy.
    public static int getMax(int[] array) {
        // Zmienna max reprezentuje największą do tej pory napotkaną wartość w tablicy.
        // Na starcie zakładamy, że największy jest pierwszy element tablicy.
        int max = array[0];
        // Pętla, której licznik przebiegnie przez indeksy wszystkich elementów tablicy
        // przypisanej do zmiennej array, poza pierwszym (0). Poza pierwszym dlatego, że
        /// pierwszy już na starcie metody został użyty.
        for (int i = 1; i < array.length; i++) {
            // Porównujemy każdy kolejny element tablicy z maxem (największą do tej pory napotkaną wartością)
            // i jeśli trafiliśmy na wartość większą, to aktualizujemy maxa.
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

//    6. Napisz metodę getSum, która przyjmie za parametr tablicę intów,
//    a która zwróci sumę jej elementów.
    public static int getSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
}
