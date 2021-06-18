package whileloop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Deklarujemy zmienną typu Random. Przypisujemy jej wartość
        // - przypisywane wyrażenie wyjaśnimy później. Rozumiemy, że możemy następnie
        // użyć zmiennej random, żeby losować wartości.
        Random myRandom = new Random();
        // Metoda nextInt zmiennej random wylosuje wartość z zakresu 0 do 9 (10 jest ograniczeniem z góry).
        System.out.println("Losowa wartość z przedziału 0 - 9: " + myRandom.nextInt(10));

        // Przypiszemy do zmiennej x losową wartość z przedziału 0 - 20.
        int x = myRandom.nextInt(21);
        // Pętla while służy do wykonywania instrukcji DOPÓKI zadany warunek jest spełniony.
        // W tym przypadku będziemy wywoływali instrukcje z bloku kodu, póki wylosowana
        // wartość jest różna od 20.
        // Pętlę while możemy traktować jako analogię do instrukcji warunkowej if - z tą różnicą,
        // że w przypadku pętli while działamy PÓKI warunek jest spełniony, a dla instrukcji warunkowej
        // sprawdzamy warunek tylko raz.
        while (x != 20) {
            // Jeśli wylosowaliśmy wartość różną od 20, to wypiszemy ją
            System.out.println("Wartość x: " + x);
            // a następnie jeszcze raz losujemy i przypisujemy wynik losowania do zmiennej x.
            x = myRandom.nextInt(21);
        }
        // Pętla zakończyła działanie, więc warunek x != 20 nie był spełniony. W takim razie do zmiennej x
        // jest przypisana wartość 20.
        System.out.println("Upewniamy się, czy wartość x to 20: " + x);
    }
}
