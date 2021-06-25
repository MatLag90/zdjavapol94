package pl.sdacademy.music;

//    1. Stwórz klasę MusicAlbum. W klasie mamy pola:
//    - artist (String)
//    - title (String)
//    - songs (tablica piosenek - ich tytułów)
//    2. W klasie utwórz konstruktor, który przypisze wartości polom, zgodnie z wartościami parametrów.
//    3. Stwórz metodę o sygnaturze "public String toString", która zwróci łańcuch z artystą oraz tytułem albumu.
//    4. Dodaj metodę getSong, która zwróci tytuł piosenki o zadanym indeksie.
//    5. Dodaj metodę getSongCount, która zwróci liczbę piosenek.
public class MusicAlbum {
    private String artist;
    private String title;
    private String[] songs;

    public MusicAlbum(String artist, String title, String[] songs) {
        this.artist = artist;
        this.title = title;
        this.songs = songs;
    }

    public String toString() {
        return "Artysta: " + artist + ", tytuł: " + title;
    }

    public String getSong(int index) {
        return songs[index];
    }

    public int getSongCount() {
        return songs.length;
    }
}
