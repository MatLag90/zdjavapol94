package forloop;

public class ForLoop {
    public static void main(String[] args) {
        // Jeśli chcemy wielokrotnie wywołać blok kodu, możemy użyć pętli.
        // Kiedy wiemy ile razy chcemy ten kod wywołać, użyjemy pętli for.
        // Składnia to: for, po którym w nawiasach wypisujemy trzy instrukcje:
        // - instrukcja wywołana przed pierwszym przebiegiem pętli (deklaracja i przypisanie wartości licznikowi)
        // - warunek następnego przebiegu pętli (łącznie z pierwszym). Czyli ograniczenie na wartości licznika
        // - instrukcja wywołana po każdym przebiegu pętli (modyfikacja wartości licznika).

        // Napiszemy pętlę, która wypisze w konsoli liczby od 0 do 9.
        // Licznikiem będzie zmienna i - to często stosowana nazwa dla licznika pętli for - od słówka iteration
        // (czyli po polsku przebieg [pętli]) - której przypiszemy wartość 0 na starcie.
        // Będziemy przebiegać pętlę póki i jest mniejsze od 10,
        // a po każdym przebiegu pętli będziemy zwiększać wartość i o 1.
        for (int i = 0; i < 10; i++) {
            // Blok kodu - zestaw instrukcji wykonywanych w każdym jednym przebiegu pętli.
            System.out.println(i);
        }
    }
}
