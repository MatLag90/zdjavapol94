package pl.sdacademy.music;

public class Main {
    public static void main(String[] args) {
        String[] songs = {"Come Together", "Something", "Track 3", "Track 4"};
        MusicAlbum abbeyRoad = new MusicAlbum("Beatles", "Abbey Road", songs);
        System.out.println(abbeyRoad);
        System.out.println("Pierwsza piosenka albumu: " + abbeyRoad.getSong(0));
        System.out.println("Liczba piosenek albumu: " + abbeyRoad.getSongCount());

        MusicPlayer musicPlayer = new MusicPlayer(2, true, abbeyRoad);
        System.out.println(musicPlayer);

        MusicAlbum ledZeppelinIV = new MusicAlbum("Led Zeppelin", "Led Zeppelin IV", new String[]{"Black Dog", "Rock and Roll", "The Battle of Evermore", "Stairway to Heaven"});

        System.out.println("Zmiana albumu na Led Zeppelin IV");
        musicPlayer.setAlbum(ledZeppelinIV);
        System.out.println(musicPlayer);
        System.out.println("Przełączenie na następną piosenkę");
        musicPlayer.playNext();
        System.out.println(musicPlayer);
    }
}
