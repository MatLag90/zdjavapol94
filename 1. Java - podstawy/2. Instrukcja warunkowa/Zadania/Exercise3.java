public class Exercise3 {
    public static void main(String[] args) {
//        3. Zadeklaruj dwie zmienne, jedna reprezentująca temperaturę
//        (liczba całkowita), druga to wartość logiczna reprezentująca
//        to, czy pada deszcz. Przypisz zmiennym wartości.
        int temperature = 15;
        boolean rain = true;
//        Następnie wypisz w konsoli, czy pogoda jest ładna, czy nie, przy użyciu
//        instrukcji warunkowej. Pogoda jest ładna, gdy temperatura jest
//        większa lub równa 20 i gdy nie pada deszcz.
        if (temperature >= 20 && !rain) { // !rain to to samo, co: rain == false
            System.out.println("Pogoda jest ładna.");
        } else {
            System.out.println("Pogoda nie jest ładna.");
        }
    }
}
