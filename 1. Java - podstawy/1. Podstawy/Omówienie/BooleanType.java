public class BooleanType {
    public static void main(String[] args) {
        // Typ boolean to typ logiczny - mamy dwie wartości typu logicznego: prawda i fałsz. Wartości te zapisujemy
        // jako true i false.
        // Deklarujemy zmienną typu boolean o nazwie myBooleanVariable i przypisujemy jej wartość:
        boolean myBooleanVariable = true; // lub przypisanie fałszu: false
        System.out.println("Wartość przypisana do zmiennej myBooleanVariable: " + myBooleanVariable);

        System.out.println("\nOperator \"i\":");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println("\nOperator \"lub\":");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("\nOperator \"negacji\":");
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);

        System.out.println("\nOperatory porównania:");
        System.out.println("10 > 3 = " + (10 > 3));
        System.out.println("10 < 3 = " + (10 < 3));
        System.out.println("5 >= 5 = " + (5 >= 5));
        System.out.println("5 <= 5 = " + (5 <= 5));
        System.out.println("27 == 27 = " + (27 == 27));
        System.out.println("27 != 27 = " + (27 != 27));

        // Wszystkie powyżej wypisane wyrażenia zwracają wartość logiczną - prawdę lub fałsz.
        // Możemy w takim razie przypisać ich wyniki (lub wynik ich kombinacji) do zmiennej typu boolean.
        myBooleanVariable = 123 > 4 && true || false;
    }
}
