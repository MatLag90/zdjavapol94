package recursiveness;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println(power(2, 3));
        System.out.println("\nZadanie 3");
        System.out.println(fibonacci(8));
    }
    //    1. Stwórz metodę power (potęgowanie), która przyjmie dwa inty.
//    Metoda zwróci pierwszy argument podniesiony do drugiego argumentu.
//    a^b = a * a^(b-1), gdy b > 0
//    a^b = 1, gdy b = 0
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }

//    2. Stwórz metodę sum, która przyjmie jako parametr wartość typu int.
//    Metoda zwróci sumę liczb naturalnych aż do zadanej.
    // s(5) = 1 + 2 + 3 + 4 + 5
    // 5! = 1 * 2 * 3 * 4 * 5

    // s(N) = { 0, gdy N = 0
    //        { s(N-1) + N, gdy N > 0


//    3. Stwórz metodę fibonacci, która przyjmie argument - indeks wyrazu,
//    a która zwróci wartość zadanego wyrazu w ciągu Fibonacciego.
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    // Wzór rekursywny: https://wikimedia.org/api/rest_v1/media/math/render/svg/5662c603b1cc30912599180f12fe0d29701c1448

    // Problem wynikający z poniższej implementacji:
//    F5 = F3 + F4 = F3 + F2 + F3 = F1 + F2 + F2 + F3 = F1 + F2 + F2 + F1 + F2
//    Wielokrotnie liczymy wartość tego samego wyrazu (w powyższym przykładzie wartość wyrazu o indeksie 2 będzie
//    liczona trzykrotnie.
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
