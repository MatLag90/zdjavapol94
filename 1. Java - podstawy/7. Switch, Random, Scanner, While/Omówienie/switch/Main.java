package switchstatement;

public class Main {
    public static void main(String[] args) {
        int x = 5;


        // switch to instrukcja warunkowa, która oparta jest o wybraną wartość
        // W nawiasach precyzujemy, o którą wartość nam chodzi.
        // Poniżej opiszemy przypadki dla wartości zmiennej x.
        switch (x) {
            // Gdy wartością zmiennej x będzie 3, wykonujemy poniższe instrukcje (aż do instrukcji break)
            case 3:
                System.out.println("x ma wartość 3");
                break;
            case 5:
                // Gdy wartością zmiennej x będzie 5, wykonujemy poniższe instrukcje (aż do instrukcji break)
                System.out.println("x ma wartość 5");
                break;
            case 11:
                System.out.println("x ma wartość 11");
                break;
            default:
                // Gdy zmienna ma wartość różną od tych, dla których opisaliśmy przypadki, wykonujemy instrukcje
                // począwszy od instrukcji bloku default (aż do instrukcji break).
                System.out.println("x ma wartość różną od 3, 5 i 11");
        }

        // Analogiczna instrukcja warunkowa if do powyższej:
//        if (x == 3) {
//            System.out.println("x ma wartość 3");
//        } else if (x == 5) {
//            System.out.println("x ma wartość 5");
//        } else if (x == 11) {
//            System.out.println("x ma wartość 11");
//        } else {
//            System.out.println("x ma wartość różną od 3, 5 i 11");
//        }

        String education = "podstawowe";

        // Przykład wyrażenia switch bez instrukcji break.
        switch (education) {
            case "brak":
                System.out.println("Nauczanie w szkole podstawowej");
            case "podstawowe":
                System.out.println("Nauczanie w szkole średniej");
            case "średnie":
                System.out.println("Nauczanie na studiach");
        }
    }
}
