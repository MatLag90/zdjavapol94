package pl.sdacademy.guitar;

//    G.1 Stwórz klasę reprezentującą gitarę. Gitarę charakteryzuje to, czy jest elektryczna,
//    liczba strun, czy jest nastrojona oraz producent.
//    G.5 Rozstrojona gitara podczas grania zamiast słowa "brzdęk" wypisuje "$GAEGE#VARA".
//    G.6 Po zagraniu 5 razy na gitarze, gitara się rozstraja.
//    G.7 Gitarę można nastroić.
public class Guitar {
    private boolean electric;
    private int stringCount;
    private boolean tuned;
    private String manufacturer;

    public Guitar(boolean electric, int stringCount, boolean tuned, String manufacturer) {
        this.electric = electric;
        this.stringCount = stringCount;
        this.tuned = tuned;
        this.manufacturer = manufacturer;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getStringCount() {
        return stringCount;
    }

    public boolean isTuned() {
        return tuned;
    }

    public String getManufacturer() {
        return manufacturer;
    }

//    G.2 Dodaj gitarze metodę toString, określającą jak gitara jest zamieniana na tekst.
//    Tekst ma być postaci:
//    Gitara <tu elektryczna, jeśli gitara jest elektryczna>. Liczba strun: <liczba strun>. Czy nastrojona: <czy nastrojona>. Producent: <producent>.
    public String toString() {
        return "Gitara" + (electric ? " elektryczna" : "") + ". Liczba strun: " + stringCount
                + ". Czy nastrojona: " + (tuned ? "tak" : "nie") + ". Producent: " + manufacturer;
    }

//    G.3 Na gitarze można zagrać. Gdy na gitarze się zagra, to w konsoli wypisane jest "brzdęk"
//    tyle razy, ile gitara ma strun.
//    G.4 Gdy gramy na gitarze elektrycznej, to w konsoli pojawia się "elektryczny brzdęk".
    public void play() {
        String sound = electric ? "elektryczny brzdęk" : "brzdęk";
        for (int i = 0; i < stringCount; i++) {
            System.out.println(sound);
        }
    }
}
