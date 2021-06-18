package pl.sdacademy;

public class ZadaniaPodstawy {
    public static void main(String[] args) {
        System.out.println("-------- Zadanie 1 ---------");
        System.out.println(zadanie1(3, 5));
        System.out.println(zadanie1(123, 50));

        System.out.println("\n-------- Zadanie 2 ---------");
        System.out.println(zadanie2("Samolot"));

        System.out.println("\n-------- Zadanie 3 ---------");
        System.out.println(zadanie3("Samolot"));

        System.out.println("\n-------- Zadanie 4 ---------");
        System.out.println(zadanie4(10));
        System.out.println(zadanie4(12));
    }

//    Napisz metodę statyczną zadanie1, która jako argument przyjmie dwa
//    inty, a która w wyniku zwróci mniejszą z nich.
    private static int zadanie1(int x, int y) {
        // Wersja 1:
        if (x > y) {
            return y;
        } else {
            return x;
        }
        // Wersja 2:
        // Jeśli warunek przez znakiem zapytania jest prawdziwy,
        // to zwracamy wartość przed dwukropkiem, a jeśli nie,
        // zwracamy wartość po dwukropku.
//        return x > y ? y : x;
    }

//        Napisz metodę statyczną zadanie2, która przyjmie jako argument łańcuch znaków,
//        która zwróci pierwszy znak łańcucha.
    private static char zadanie2(String text) {
        return text.charAt(0);
    }

//    Napisz metodę statyczną zadanie3, która przyjmie jako argument łańcuch znaków,
//    która zwróci ostatni znak łańcucha.
    private static char zadanie3(String text) {
        return text.charAt(text.length() - 1);
    }

//    Napisz metodę statyczną zadanie4, która przyjmie jako argument int,
//    a która da odpowiedź na pytanie, czy liczba ta dzieli się przez 2 i nie dzieli
//    się przez 3 (takie liczby to np. 4, 8, ale nie 6).
    private static boolean zadanie4(int x) {
        // Wersja gorsza:
//        if (x % 2 == 0 && x % 3 != 0) {
//            return true;
//        } else {
//            return false;
//        }
        // Wersja lepsza:
        return x % 2 == 0 && x % 3 != 0;
    }
}
