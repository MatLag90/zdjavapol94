package pl.sdacademy.music;

//    6. Stwórz klasę MusicPlayer, reprezentujacą odtwarzacz muzyki. W klasie mamy pola:
//    - currentSongIndex (indeks aktualnie odtwarzanej piosenki)
//    - paused (czy piosenka jest odtwarzana)
//    - album (album muzyczny, odtwarzany przez odtwarzacz)
//    7. W klasie utwórz konstruktor tworzący odtwarzacz o zadanych wartościach pól.
//    8. W klasie stwórz metodę public String toString, która zwróci tekst zawierający informacje:
//    - artysta oraz tytuł odtwarzanego albumu
//    - czy piosenka jest odtwarzana
//    - indeks aktualnie odtwarzanej piosenki
//    9. Dodaj setter dla pola album. Po zmianie albumu indeks odtwarzanej piosenki zostaje wyzerowany.
//    10. Dodaj metody playNext oraz playPrevious, zmieniającą indeks aktualnie odtwarzanej piosenki.
//    Uwzględnij liczbę piosenek odtwarzanego albumu. Po wywołaniu metody odtwarzanie nie może być zapauzowane.
//    11. Dodaj metodę getCurrentSong - metoda zwróci nazwę aktualnie odtwarzanej piosenki.
//    12. Zmodyfikuj metodę toString w taki sposób, aby wypisywała również tytuł odtwarzanej piosenki.
//    13. Dodaj metodę displayAllSongs, która wyświetli tytuły wszystkich piosenek odtwarzanego albumu wraz z numerami. Aktualnie odtwarzana piosenka będzie zapisana w nawiasach okrągłych.
public class MusicPlayer {
    private int currentSongIndex;
    private boolean paused;
    private MusicAlbum album;

    public MusicPlayer(int currentSongIndex, boolean paused, MusicAlbum album) {
        this.currentSongIndex = currentSongIndex;
        this.paused = paused;
        this.album = album;
    }

    public void setAlbum(MusicAlbum album) {
        this.album = album;
        currentSongIndex = 0;
    }

    public void playNext() {
        // Wersja 1:
//        if (currentSongIndex == album.getSongCount() - 1) {
//            currentSongIndex = 0;
//        } else {
//            currentSongIndex++;
//        }
        // Wersja 2:
        currentSongIndex = currentSongIndex == album.getSongCount() - 1 ? 0 : currentSongIndex + 1;
        paused = false;
    }

    public void playPrevious() {
        currentSongIndex = currentSongIndex == 0 ? album.getSongCount() - 1 : currentSongIndex - 1;
        paused = false;
    }


    public String toString() {
        return album + ", czy piosenka jest odtwarzana: " + (paused ? "nie" : "tak")
                + ", indeks aktualnie odtwarzanej piosenki: " + currentSongIndex;
    }
}
