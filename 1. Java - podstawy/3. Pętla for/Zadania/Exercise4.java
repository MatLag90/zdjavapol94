package forloop;

public class Exercise4 {
    public static void main(String[] args) {
//        4. Wypisz wszystkie liczby parzyste z przedziału 0 - 100.
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Ciutkę gorsze rozwiązanie (niepotrzebnie licznik przyjmuje wartości nieparzyste):
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
    }
}
