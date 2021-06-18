package pl.sdacademy.warrior;

//    W.1. Stwórz klasę reprezentującą wojownika. Wojownik powinien mieć pola:
//    - imię
//    - siła ataku
//    - punkty życia
public class Warrior {
    private String name;
    private int damage;
    private int healthPoints;

//    W.2. Wojownik posiada konstruktor tworzący obiekt o zadanym imieniu,
//    sile ataku oraz punktach życia.
    public Warrior(String name, int damage, int healthPoints) {
        this.name = name;
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

//    Posiada również konstruktor tworzący wojownika o zadanym imieniu,
//    stu punktach życia o sile ataku równej 1.
    public Warrior(String name) {
        this.name = name;
        damage = 1;
        healthPoints = 100;
    }

//    W.3. Dodaj metodę public String toString zwracającą opis wojownika
//    (zawierającą jego imię, siłę ataku oraz punkty życia).
    public String toString() {
        return "Imię: " + name + ", siła ataku: " + damage + ", punkty życia: " + healthPoints;
    }

//    W.4. Wojownik posiada metodę hit, przyjmującą jako argument wojownika. Wojownik,
//    w kontekście którego metoda została wywołana zada wojownikowi przekazanemu jako
//    argument obrażenia równe jego sile ataku. Obrażenia będą reprezentowane przez utratę
//    punktów życia.
    public void hit(Warrior warrior) {
        warrior.healthPoints -= damage;
    }
}
