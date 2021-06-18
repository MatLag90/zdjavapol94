public class ArithmeticOperators {
    public static void main(String[] args) {
        // Operatory liczbowe, z których będziemy na razie korzystać to:
        // W poniższych przykładach posługujemy się też znakiem + jako operatorem konkatenacji,
        // żeby w konsoli zapisać sobie też treść działania, którego wynik liczymy.
        // Posłużymy się też nawiasami, żeby operatory arytmetyczne były wykonywane w pierwszej kolejności.
        // Operator dodawania (+)
        System.out.println("5 + 3 = " + (5 + 3));
        // Operator odejmowania (-)
        System.out.println("10 - 5 = " + (10 - 5));
        // Operator mnożenia (*)
        // Operatory mnożenia i dzielenia są silniejsze od dodawania i odejmowania (siła to kolejność
        // wykonywania działań).
        System.out.println("3 * 4 = " + 3 * 4);
        // Operator dzielenia (/)
        System.out.println("9 / 3 = " + 9 / 3);
        // Na razie działamy w obrębie zbioru liczb całkowitych,
        // czyli wynik dzielenia też będzie liczbą całkowitą.
        System.out.println("9 / 2 = " + 9 / 2);
        // Operator modulo (reszta z dzielenia) (%)
        System.out.println("7 % 3 = " + 7 % 3);
        System.out.println("2 + 3 - 5 = " + (2 + 3 - 5));
        // Operatory mnożenia i dzielenia są silniejsze od dodawania i odejmowania (siła to kolejność
        // wykonywania działań).
        System.out.println("2 + 2 * 2 = " + (2 + 2 * 2));
        System.out.println("(2 + 2) * 2 = " + (2 + 2) * 2);
    }
}
