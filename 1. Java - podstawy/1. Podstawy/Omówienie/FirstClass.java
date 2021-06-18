// Na razie klasy będziemy rozumieli jako pliki z kodem źródłowym.
// Klasę tworzymy klikając prawym przyciskiem myszy na folderze src w widoku projektu i wybierając
// New -> Java Class. Następnie wpisujemy nazwę klasy (używamy w nazwie jedynie znaków angielskiego alfabetu
// i cyfr).
public class FirstClass {
    // Jak na razie, instrukcje będziemy umieszczali wewnątrz nawiasów wąsatych umieszczonych po linii:
    // public static void main(String[] args)
    // Aby uzyskać ten kod "z automatu" możemy zapisać "psvm" lub "main" i skorzystać z szablonu Intellij
    // - zatwierdzamy szablon przy użyciu tabulatora lub entera.
    public static void main(String[] args) {
        // Instrukcja, która służy do wypisania wartości w konsoli, to System.out.println(), gdzie w nawiasach
        // przekazujemy jako argument wartość, którą chcemy wypisać.
        // Aby zapisać tę instrukcję możemu posłużyć się szablonem IntelliJ - zapisujemy sout i klikamy enter.
        // Wartości tekstowe umieszczamy w cudzysłowach.
        // Instrukcje kończymy średnikami.
        System.out.println("ABCD");
        System.out.println("XYZ");
        System.out.println("123");
        // Wartości liczbowe zapisujemy bezpośrednio.
        System.out.println(123);
    }
}
