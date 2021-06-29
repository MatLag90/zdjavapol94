package pl.sdacademy.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // Błędy działania aplikacji będą reprezentowane za pomocą obiektów typu Throwable.
        // Podstawowa hierarchia wyjątków: https://www.javamex.com/tutorials/exceptions/exceptions_hierarchy.shtml
        // Wyjątki typu Error to wyjątki, których z definicji nie chcemy obsługiwać w kodzie - reprezentują
        // takie sytuacje, jak np. problem środowiska uruchomieniowego, niepomyślność wykonanego testu itp.
        // Sami będziemy skupiali się na wyjątkach typu Exception.
        // Wyrzucony wyjątek można złapać (obsłużyć wystąpienie niepożądanej sytuacji).

        int x = 1;
        int y = 0;
        // Instrukcje, które mogą spowodować wyrzucenie wyjątku możemy opakować w bloku try
        try {
            // Poniższa instrukcja, gdy do zmiennej y będzie przypisane 0,
            // spowoduje wyrzucenie wyjątku (dzielenie przez 0)
            System.out.println(x / y);
            // Instrukcje następujące po instrukcji wyrzucającej wyjątek nie będą wykonywane.
            System.out.println("To nie będzie wypisane w konsoli");
        } catch (ArithmeticException e) { // Następnie dodamy część catch - w nawiasach znajdzie się
            // deklaracja zmiennej, do której będzie przypisany obiekt reprezentujący wyjątek. Typ tej zmiennej
            // będzie typem łapanego (obsługiwanego wyjątku).
            // Jeśli wyjątek tego typu zostanie wyrzucony, to zostaną wywołane instrukcje z bloku catch.
            System.out.println("Obsługa wyjątku typu ArithmeticException");
        }
        System.out.println("Aplikacja działa dalej");

        String text = null;
        try {
            // Instrukcja spowoduje wyrzucenie wyjątku (wywołanie metody na nullu).
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Obsługa wyjątku typu NullPointerException");
        }

        int[] intArray = {10, 7};
        try {
            // Instrukcja spowoduje wyrzucenie wyjątku (odwołanie się poza zakres indeksów tablicy)
            System.out.println(intArray[50]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Obsługa wyjątku typu ArrayIndexOutOfBoundsException");
        }

        System.out.println("\nPrzykład obsługi wyjątków różnego typu");
        short[] shortArray = {1, 0};
        int index1 = 0;
        int index2 = 1;
        try {
            // Poniższa instrukcja mogłaby dla różnych wartości zmiennych spowodować wyrzucenie wyjątku
            // różnego typu. Aby to uzyskać:
            // - do zmiennej shortArray przypisz null
            // - lub do zmiennej index1 przypisz 1000
            // Dopiszemy wiele bloków catch - wywołane będą instrukcje z bloku, w którym zadeklarowano zmienną
            // typu wyjątku, który został wyrzucony.
            System.out.println(shortArray[index1] / shortArray[index2]);
        } catch (ArithmeticException e) {
            System.out.println("Obsługa wyjątku typu ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Obsługa wyjątku typu ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("Obsługa wyjątku typu NullPointerException");
        }

        System.out.println("\nPrzykład obsługi wyjątków różnego typu w ten sam sposób");
        try {
            System.out.println(shortArray[index1] / shortArray[index2]);
            // Obsłużenie w ten sam sposób wyjątków różnych, wybranych typów:
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Obsługa wyjątku typu ArithmeticException " +
                    "lub ArrayIndexOutOfBoundsException lub NullPointerException");
        }

        System.out.println("\nPrzykład obsługi wyjątków dziedziczących po wspólnym typie");
        try {
            System.out.println(shortArray[index1] / shortArray[index2]);
        } catch (RuntimeException e) {
            // Wszystkie typy wyjątków, o których była mowa wcześniej dziedziczą po typie RuntimeException.
            // Obsługujemy więc tutaj wszystkie wyjątki typów dziedziczących po RuntimeException (lub samego
            // RuntimeException).
            System.out.println("Obsługa wyjątku typu RuntimeException");
        }

        System.out.println("\nPrzykład checked exception");
        try {
            // Poniższa instrukcja spowoduje wyrzucenie wyjątku typu IOException. Typ ten dziedziczy po
            // klasie Exception, ale nie dziedziczy po klasie RuntimeException.
            // Wyjątki typu RuntimeException nazwiemy unchecked exceptions i są to wyjątki, w przypadku których
            // nie mamy obowiązku ich obsługi w kodzie.
            // W przypadku wszystkich pozostałych (tych, które nie dziedziczą po RuntimeException) mamy taki
            // obowiązek - inaczej kod nie zostanie skompilowany. Te wyjątki nazywamy checked exceptions - sprawdzane
            // na etapie kompilacji.

            // Spróbuj wywołać poniższą instrukcję bez bloku try/catch - kod taki nie ulegnie kompilacji.
            // Stąd nazwa checked exceptions - możliwość wyrzucenia takiego wyjątku będzie sprawdzana na etapie
            // kompilacji.
            Files.readAllLines(Path.of("a"));
        } catch (IOException e) {
            System.out.println("Obsługa wyjątku typu IOException");
        }

        System.out.println("\nUżycie wyjątku - obiektu reprezentującego nieporządaną sytuację oraz stack trace.");
        try {
            // Wywołamy metodę, która wywoła metodę, która spowoduje wyrzucenie wyjątku.
            stackTraceExample1();
        } catch (ArithmeticException e) {
            // Do zmiennej zadeklarowanej w nawiasach po słówku catch mamy przypisany obiekt reprezentujący wyjątek.
            // Metoda getMessage zwróci opis zaistniałej sytuacji.
            System.out.println(e.getMessage());
            // Jeśli chcemy wypisać w konsoli stos wywołań metod, który doprowadził do wyjątku, możemy użyć jego
            // metody printStackTrace.
//            e.printStackTrace();
        }

        // Wyjątek możemy wyrzucić za pomocą instrukcji throw.
        // Jako prawy argument przekażemy obiekt - wyjątek. W tym wypadku tworzony jest wyjątek typu RuntimeException.
        // Kod jest zakomentowany, bo wyrzucenie nieobsłużonego wyjątku spowodowałoby zakończenie działania
        // programu.
//        throw new RuntimeException("Nasz komunikat wyjątku");

        System.out.println("\nPrzykład wyrzucenia wyjątku i jego obsługi");
        try {
            // Metoda throwExceptionExample może wyrzucić wyjątek checked exception (niedziedziczący po typie
            // RuntimeException). Mamy obowiązek się nim zająć.
            throwExceptionExample();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Jeśli nie chcemy w ciele metody obsługiwać wyjątku zadanego typu, tylko w wypadku zaistnienia jego wyrzucenia
    // chcemy przekazać przymus jego obsługi metodzie "wyżej", to możemy to osiągnąć za pomocą słówka throws w
    // sygnaturze tej metody. Po tym słówku zapisujemy typy wyjątków, które metoda będzie przekazywała metodzie,
    // która ją wywołała.
    private static void throwExceptionExample() throws Exception {
        // Nie mamy już obowiązku obsługi za pomocą try-catch potencjalnego wyrzuconego wyjątku.
        throw new Exception("Jakiś komunikat wyjątku");
    }

    private static void stackTraceExample1() {
        stackTraceExample2();
    }

    private static void stackTraceExample2() {
        System.out.println(1 / 0);
    }
}

