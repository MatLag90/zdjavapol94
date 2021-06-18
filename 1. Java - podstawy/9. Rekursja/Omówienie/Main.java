package recursiveness;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wywołanie metody działającej iteracyjnie: " + factorialV1(5));
        System.out.println("Wywołanie metody działającej rekursywnie: " + factorialV2(5));
    }

    // Iteracyjny (korzystający z pętli) sposób implementacji metody liczącej silnię argumentu.
    // N! = 1 * 2 * ... * (N-1) * N
    // 5! = 1 * 2 * 3 * 4 * 5 = 120
    public static int factorialV1(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Rekursywna definicja silni:
    // N! = { 1, gdy N = 0
    //      { (N-1)! * N, gdy N > 0
    // Przykład:
    // 3! = (3-1)! * 3 = 2! * 3 = (2-1)! * 2 * 3 = 1! * 2 * 3 =
    // = (1-1)! * 1 * 2 * 3 = 0! * 1 * 2 * 3 = 1 * 1 * 2 * 3 = 6
    // Rekursywny (korzystający sam z siebie) sposób implementacji metody liczącej silnię argumentu.
    // Zakładamy, że argumenty będą tylko dodatnie
    public static int factorialV2(int n) {
        if (n == 0) {
            // Silnia dla n równego 0 da wynik 1.
            return 1;
        } else { // gdy n > 0 - zakładamy, że metoda nie będzie wywoływana dla ujemnych wartości n
            // Dla n > 0 silnię liczymy następująco:
            // n! = (n - 1)! * n
            // Czyli zwrócimy jako wynik iloczyn silni z (n - 1) oraz n.
            // Żeby wyliczyć silnię z (n - 1) użyjemy metody, którą właśnie definiujemy
            // - factorial. Czyli metoda wywoła samą siebie, gdy będzie wywołana.
            return factorialV2(n - 1) * n;
        }
    }
}


