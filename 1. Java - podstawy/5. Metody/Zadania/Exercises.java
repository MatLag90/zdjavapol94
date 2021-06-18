package methods;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println(exercise1(5, 7));

        System.out.println("\nZadanie 2");
        System.out.println(exercise2("aaa", "bbb"));

        System.out.println("\nZadanie 3");
        System.out.println(exercise3(5));

        System.out.println("\nZadanie 4");
        System.out.println(exercise4("kubek", "telefon"));
    }

    //    1. Stwórz metodę exercise1, która przyjmie dwa parametry typu int,
    //    a która zwróci wynik mnożenia tych parametrów.
    public static int exercise1(int x, int y) {
        return x * y;
    }

//    2. Stwórz metodę exercise2, która przyjmie dwa łańcuchy znaków jako parametry,
//    a która zwróci ich konkatenację.
    public static String exercise2(String text1, String text2) {
        return text1 + text2;
    }

//    3. Stwórz metodę exercise3, która przyjmie parametr typu int. Metoda zwróci odpowiedź
//    na pytanie, czy wartość jest dodatnia.
    public static boolean exercise3(int x) {
        // Wersja 1:
//        if (x > 0) {
//            return true;
//        } else {
//            return false;
//        }
        // Wersja 2:
        return x > 0;
    }

//    4. Stwórz metodę, która przyjmie dwa parametry typu String. Metoda zwróci dłuższy z tych tekstów.
//    Jeśli oba są równej długości, metoda zwróci pierwszy z nich.
    public static String exercise4(String text1, String text2) {
        if (text1.length() >= text2.length()) {
            return text1;
        } else {
            return text2;
        }
    }
}
