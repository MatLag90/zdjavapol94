public class Exercise2 {
    public static void main(String[] args) {
//        2. Sprawdź, czy wartość przypisana zmiennej jest parzysta,
//        czy nie (wypisz w konsoli odpowiedni komunikat).
        int x = 31;
        if (x % 2 == 0) { // parzystość sprawdźmy wykorzystując resztę z dzielenia przez 2
            System.out.println("Wartość zmiennej x jest parzysta.");
        } else {
            System.out.println("Wartość zmiennej x jest nieparzysta.");
        }
    }
}
