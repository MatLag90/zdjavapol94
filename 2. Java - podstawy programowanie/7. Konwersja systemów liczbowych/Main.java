package pl.sdacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Zadanie 1 -----");
        System.out.println(binaryToDecimal("101100"));

        System.out.println("--- Zadanie 4 -----");
        System.out.println(decimalToBinary("44"));
    }

//    1. Stwórz metodę, która przyjmie parametr - łańcuch znaków
//    - liczbę zapisaną dwójkowo. Metoda zwróci łańcuch znaków
//    - tę samą liczbę zapisaną w systemie dziesiętnym.
//    Np. dla wywołania jej z argumentem "101100" zwróci "44"
    private static String binaryToDecimal(String binary) {
        // Kolejna potęga dwójki, o którą powiększamy wynik bądź nie.
        int powerOf2 = 1;
        // Zmienna, której użyjemy do przygotowania wyniku.
        int result = 0;

        // Stwórzmy pętlę, której licznik przebiegnie przez
        // indeksy cyfr binarnego zapisu liczby (binary)
        // począwszy od indeksu ostatniej cyfry.
        for (int i = binary.length() - 1; i >= 0; i--) {
            // Jeśli cyfra, której indeks wskazuje licznik pętli,
            // jest równa 1,
            if (binary.charAt(i) == '1') {
                // to dodajemy do liczonej wartości liczby
                // (result) kolejną potęgę liczby 2 (powerOf2).
                result += powerOf2;
            }
            // Na koniec przebiegu pętli zwiększymy wartość potęgi liczby 2 (powerOf2).
            powerOf2 *= 2;
        }
        // Na koniec zwracamy wynik jako łańcuch znaków (w razie czego google'ujemy konwersję z int na String).
        return result + "";
    }

//    4. Stwórz metodę, która przyjmie parametr - łańcuch znaków - liczbę zapisaną
//    dziesiętnie. Metoda zwróci łańcuch znaków - tę samą liczbę zapisaną w systemie dwójkowym.
//    "44" -> "101100"
    private static String decimalToBinary(String decimal) {
        // konwertujemy parametr do typu int i przypisujemy do tej zmiennej
        // (wygoogluj frazę "java String to int")
        int value = Integer.parseInt(decimal);
        // tworzony wynik (będziemy dopisywać do niego kolejne reszty z dzielenia)
        String result = "";
        // póki value (pozostała wartość) jest większa od 0
        while (value > 0) {
            // dopisuję do tworzonego wyniku resztę z dzielenia przez 2
            result = value % 2 + result;
            // następnie dzielę pozostałą wartość (value) przez 2
            value /= 2; // value = value / 2;
        }
        // na koniec zwracamy przygotowany wynik
        return result;
    }
}
