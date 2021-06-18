package pl.sdacademy.methods;

public class Medium {
    public static void main(String[] args) {
        System.out.println("----------- Zadanie 1 ------------");
        System.out.println(exercise1(9));

        System.out.println("----------- Zadanie 2 ------------");
        System.out.println(exercise2(""));
        System.out.println(exercise2("abc"));
        System.out.println(exercise2("aaaaaaaaaaaaaaaaaaaaa"));
    }
//    1. Stwórz metodę, która przyjmie parametr typu int. Metoda zwróci odpowiedź,
//    czy ta wartość jest jednocześnie:
//    - większa od 5
//    - podzielna przez 3
//    - mniejsza bądź równa 123
    private static boolean exercise1(int x) {
        // Wersja 1 (gorsza):
//        if (x > 5 && x % 3 == 0 && x <= 123) {
//            return true;
//        } else {
//            return false;
//        }
        // Wersja 2:
        return x > 5 && x % 3 == 0 && x <= 123;
    }

//    2. Stwórz metodę, która przyjmie parametr typu String. Jeśli wartością parametru
//    będzie pusty łańcuch, to zwróci -1. Jeśli będzie miał od 1 do 5 znaków, to metoda
//    zwróci 100, a jeśli ma więcej znaków, to metoda zwróci jego długość.
    // Wersja 1:
    private static int exercise2(String text) {
        if (text.length() == 0) {
            return -1;
        } else if (text.length() <= 5) {
            return 100;
        } else {
            return text.length();
        }
    }

    // Wersja 2:
//    private static int exercise2(String text) {
//        int length = text.length();
//        if (text.isEmpty()) {
//            return -1;
//        }
//        if (length <= 5) {
//            return 100;
//        }
//        return length;
//    }
}
