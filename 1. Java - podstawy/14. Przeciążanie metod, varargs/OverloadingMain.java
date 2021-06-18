package methodoverloading;

public class OverloadingMain {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add("abc", "def"));
        System.out.println(add(5, 1, 3));
    }

    // Definiowanie w klasie wielu metod o tej samej nazwie nazywamy przeciążaniem metody.
    // To, którą metodę faktycznie wywołamy, zależeć będzie od typów argumentów - to one wskażą, które
    // przeciążenie wywołamy.
    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static String add(String a, String b) {
        return a + b;
    }
}
