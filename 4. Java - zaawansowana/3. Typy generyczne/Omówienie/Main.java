package pl.sdacademy.generics;

public class Main {
    public static void main(String[] args) {
        // Deklarując zmienną typu generycznego, określimy wartość typu sparametryzowanego.
        // Zapisujemy to po nazwie typu w nawiasach trójkątnych (w tym przypadku String).
        // W przypadku użycia konstruktora nie musimy ponownie precyzować tego typu
        // - nawiasy trójkątne pozostawimy puste.
        // Konstruktor w tym wypadku musi przyjąć argument typu String.
        Box<String> stringBox = new Box<>("ABC");
        // Zwracamy uwagę, że metoda getElement zwraca wartość typu String.
        String stringElement = stringBox.getElement();

        // Typy generyczne nie mogą jako sparametryzowanego typu przyjąć
        // typów prymitywnych. W związku z tym użyjemy wrappera (typu opakowującego/osłonowego)
        Box<Integer> intBox = new Box<>(123);
        int intElement = intBox.getElement();
    }
}
