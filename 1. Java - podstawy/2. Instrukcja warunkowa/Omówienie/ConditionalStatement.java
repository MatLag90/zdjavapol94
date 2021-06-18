public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 10;

        // W przypadku, gdy chcemy wykonać wybrane instrukcje pod pewnym warunkiem, używamy wyrażenia warunkowego.
        // Wyrażenie warunkowe to: słówko kluczowe if, po którym w nawiasach okrągłych zapisujemy wyrażenie logiczne.
        if (age < 18) {
            // Jeśli wyrażenie to jest prawdziwe, to wykonujemy instrukcje zawarte w następującym bloku kodu.
            System.out.println("Jesteś niepełnoletni. Napij się soku.");
        } else {
            // Jeśli chcemy w innym wypadku wykonać inne instrukcje, możemy użyć bloku else.
            System.out.println("Jesteś pełnoletni, proszę, napij się piwa.");
        }

        // Jeśli przy tworzeniu wyrażenia warunkowego nie użyjemy nawiasów wąsatych (bloku kodu), to
        // przy prawdzie warunku będzie wykonana pierwsza zapisana instrukcja.
        // Umawiamy się jednak, że zawsze tworząc wyrażenie warunkowe będziemy używali nawiasów wąsatych (patrz
        // przykład wyżej) - tak wygląda zwykle konwencja przy pisaniu kodu javowego.
//        if (age < 18)
//            System.out.println("Tak, jak wcześniej mówiłem - jesteś niepełnoletni.");
    }
}
