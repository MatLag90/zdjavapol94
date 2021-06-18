package pl.sdacademy.regex;

public class Main {
    public static void main(String[] args) {
        // Wyrażenia regularne stosowane są testowania łańcuchów znaków dla zadanego kryterium.
        // Można ich również używać do wyszukiwania zadanych fragmentów, ich zastępowania etc.
        // Klasa String oferuje metodę matches, której jako argument przekazujemy wyrażenie regularne.
        // Wyrażenie regularne w Javie to po prostu łańcuch znaków utworzony wedle zadanych reguł.

        // Wyrażenie \d reprezentuje cyfrę.
        System.out.println("\nPrzykłady \\d");
        System.out.println("1".matches("\\d"));
        System.out.println("123".matches("\\d\\d\\d"));

        System.out.println("\nPrzykłady \\w");
        // Wyrażenie \w to znak alfanumeryczny (lub podkreślnik)
        // Czyli pasować będzie znak angielskiego alfabetu, cyfra lub podkreślnik.
        System.out.println("a".matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("3".matches("\\w"));
        System.out.println("_".matches("\\w"));

        System.out.println("\nPrzykłady .");
        // Znak . reprezentuje dowolny znak.
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("#".matches("."));
        System.out.println("ó".matches("."));

        System.out.println("\nPrzykłady znaków oznaczających same siebie");
        System.out.println("a".matches("a"));
        System.out.println("3".matches("3"));
        System.out.println(" ".matches(" "));
        // W przypadku, gdy znak ma wyjątkową funkcję w wyrażeniu regularnym, to żeby odwołać
        // się bezpośrednio do niego, poprzedzimy go backslashem.
        System.out.println(".".matches("\\."));

        System.out.println("\nPrzykłady *");
        // * oznacza dowolną liczbę wystąpień (również brak wystąpień)
        System.out.println("123".matches("\\d*"));
        System.out.println("1".matches("\\d*"));
        System.out.println("".matches("\\d*"));

        System.out.println("\nPrzykłady +");
        // + oznacza co najmniej jedno wystąpienie (pusty łańcuch znaków to nie jest co najmniej jedna cyfra):
        System.out.println("aaa".matches("a+"));
        System.out.println("a".matches("a+"));
        System.out.println("".matches("a+")); // fałsz! ma być co najmniej jedno wystąpienie

        System.out.println("\nPrzykłady {}");
        // {x} oznacza x wystąpień wartości poprzedzającej nawias wąsaty
        System.out.println("at35G".matches("\\w{5}"));
        System.out.println("33Ab1".matches("\\w{5}"));
        // {x,y} oznacza od x do y wystąpień wartości poprzedzającej nawias wąsaty
        System.out.println("888".matches("8{3,5}"));
        System.out.println("8888".matches("8{3,5}"));
        System.out.println("88888".matches("8{3,5}"));

        System.out.println("\nPrzykłady ?");
        // Znak zapytania oznacza opcjonalność wartości.
        System.out.println("".matches("k?"));
        System.out.println("k".matches("k?"));
        System.out.println("kk".matches("k?")); // fałsz! ma być jedno k lub wcale.

        System.out.println("\nPrzykłady []");
        // W nawiasach kwadratowych definiujemy zbiór wartości. Pasować będzie znak z tego zbioru.
        System.out.println("b".matches("[abc]"));
        System.out.println("caabacacb".matches("[abc]*"));
        // W zbiorach możemy opisywać zakresy przy użyciu myślnika.
        System.out.println("ceeefd".matches("[c-f]*"));
        // 4, 5, 6, 7, d, e, f, X, Y, Z
        // inaczej zapisane: [4567defXYZ]
        System.out.println("".matches("[4-7d-fX-Z]"));


        System.out.println("\nPrzykłady ()");
        // () oznacza grupę - sekwencję, którą traktujemy razem.
        // W poniższych przykładach interesują nas sekwencje Abc występujące kolejno co najmniej raz.
        System.out.println("Abc".matches("(Abc)+"));
        System.out.println("AbcAbcAbc".matches("(Abc)+"));

        System.out.println("\nPrzykłady złożone");
        // Cyfra, potem dowolna liczba wystąpień x, potem co najmniej jedno powtórzenie sekwencji AB,
        // a na koniec opcjonalnie znak f.
        System.out.println("5xxxABABf".matches("\\dx*(AB)+f?"));
        System.out.println("2AB".matches("\\dx*(AB)+f?"));
    }
}
