package pl.sdacademy.television;
// T.1 Stwórz klasę reprezentującą Telewizor o polach:
public class Television {
    public static final int MAX_VOLUME = 10;
    private static final int MIN_VOLUME = 0;

    //    - głośność
    private int volume;
    //    - liczba programów (kanałów)
    private int channelCount;
    //    - numer aktualnego programu (kanału)
    private int currentChannel;
    //    - czy włączony
    private boolean on;

//    T.2 W klasie mamy konstruktor ustalający wartości wszystkich pól zgodnie
//    z wartościami parametrów.
    public Television(int volume, int channelCount, int currentChannel, boolean on) {
        this.volume = volume;
        this.channelCount = channelCount;
        this.currentChannel = currentChannel;
        this.on = on;
    }

//    W klasie mamy również konstruktor ustalający jedynie wartość liczby programów
//    zgodnie z wartością parametru - w takim wypadku tworzony telewizor będzie
//    wyłączony, aktualny program ma wartość 1, a głośność 0.
    public Television(int channelCount) {
        this.channelCount = channelCount;
        this.currentChannel = 1; // inaczej: currentChannel = 1;
        // Poniższe instrukcje niczego nie zmienią (domyślna wartość pola typu boolean to false,
        // a pola typu int to 0).
//        this.on = false;
//        this.volume = 0;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannelCount() {
        return channelCount;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public boolean isOn() {
        return on;
    }

    //    T.3 Mamy również metodę o sygnaturze public String toString, zwracającą opis telewizora.
//    Jeśli telewizor jest wyłączony, to zwrócony opis ma jedynie zawierać informację
//    "Wyłączony telewizor". Gdy telewizor jest włączony, opis ma wyglądać podobnie do:
//     "Włączony telewizor. Aktualny program X (z Y dostępnych). Ustawiona głośność to Z."
    public String toString() {
        if (on) {
            return "Włączony telewizor. Aktualny program " + currentChannel + " (z " + channelCount
                    + " dostępnych). Ustawiona głośność to " + volume + ".";
        } else {
            return "Wyłączony telewizor";
        }
    }

//    T.4 Do klasy dodaj metody włączajacą oraz wyłączającą telewizor (turnOn i turnOff)
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

//    T.5 Dodaj do klasy metody pogłaśniające oraz ściszające telewizor. Głośność może znajdować
//    się w przedziale 0-10 (dalsze ściszanie/pogłaśnianie nie będzie niczym skutkowało).
//    Głośność można zmienić jedynie, gdy telewizor jest włączony. (volumeUp i volumeDown)
    public void volumeUp() {
        if (on && volume < MAX_VOLUME) {
            volume++;
        }
    }

    public void volumeDown() {
        if (on && volume > MIN_VOLUME) {
            volume--;
        }
    }
}
