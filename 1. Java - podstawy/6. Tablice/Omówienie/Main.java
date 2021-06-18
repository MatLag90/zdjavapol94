package arrays;

public class Main {
    public static void main(String[] args) {
        // Jeśli po określeniu typu zapiszemy nawiasy kwadratowe, to otrzymujemy typ tablicowy, którego elementy
        // są typu, którego nazwa pojawia się przed nawiasami. Tablica to ciąg (sekwencja) wartości.
        // W poniższym przypadku deklarujemy zmienną, której typem będzie tablica, której elementy są typu int.
        // Nazwiemy zmienną intArray i przypiszemy jej od razu wartość - tablicę czteroelementową, której elementy to
        // 50, 3, 645, -4
        int[] myIntArray = {50, 3, 645, -4};
        // Liczbę elementów tablicy uzyskamy odwołując się do właściwości length:
        System.out.println("Liczba elementów tablicy: " + myIntArray.length);
        // Do elementu na podstawie indeksu odwołujemy się zapisując indeks w nawiasach kwadratowych:
        System.out.println("Trzeci element tablicy: " + myIntArray[2]);
        System.out.println("Pierwszy element tablicy: " + myIntArray[0]);
        // Analogicznie jak w przypadku tekstu - indeksacja elementów startuje od 0, więc indeks ostatniego elementu
        // to liczba elementów tablicy minus 1 (myIntArray.length - 1)
        System.out.println("Ostatni element tablicy: " + myIntArray[myIntArray.length - 1]);

        // Do elementu możemy się odwołać również, aby przypisać mu wartość:
        myIntArray[0] = 11111;
        System.out.println("Nowa wartość pierwszego elementu: " + myIntArray[0]);

        System.out.println("\nPrzebiegnięcie w pętli przez indeksy elementów");
        // Klasycznej pętli for możemy użyć gdy potrzebujemy się odwołać do indeksów elementów
        // (jeśli mamy indeks elementu, to możemy odwołać się również do jego wartości)
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Indeks: " + i + ", wartość: " + myIntArray[i]);
        }

        System.out.println("\nPrzebiegnięcie w pętli przez wartości elementów");
        // Przez elementy tablicy możemy również przebiec za pomocą pętli foreach. W nawiasach okrągłych deklarujemy
        // zmienną, do której będzie przypisany w każdym kolejnym przebiegu pętli następny element tablicy, do której
        // odwołanie zapiszemy po dwukropku:
        // W tym przypadku nie możemy odwołać się do indeksu elementu, jedynie do jego wartości.
        for (int element : myIntArray) {
            System.out.println("Wartość: " + element);
        }

        // Tablicę o zadanej długości (liczbie elementów) tworzymy za pomocą instrukcji:
        // new typElementu[liczba elementów]
        myIntArray = new int[3];
        System.out.println("\nElementy tablicy stworzonej przy pomocy instrukcji new int[3]:");
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Indeks: " + i + ", wartość: " + myIntArray[i]);
        }

        System.out.println("\nPrzykład przypisania jednej tablicy do dwóch zmiennych");
        // Zadeklarujemy inną zmienną typu tablica intów i przypiszemy jej wartość przypisaną do zmiennej intArray.
        int[] myIntArray2 = myIntArray;
        // Zmieniamy wartość elementu o indeksie 0 tablicy przypisanej do myIntArray2:
        myIntArray2[0] = -999;
        // Zwracamy uwagę na to, że zmieniliśmy "również" wartość elementu tablicy przypisanej do zmiennej myIntArray.
        // Dzieje się tak dlatego, że tablica to typ obiektowy - na razie rozumiemy to w taki sposób,
        // że na jedną tablicę może wskazywać wiele zmiennych.
        System.out.println(myIntArray[0]);
    }
}
