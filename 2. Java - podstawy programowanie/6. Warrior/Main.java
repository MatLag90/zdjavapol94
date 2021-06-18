package pl.sdacademy.warrior;

public class Main {
    public static void main(String[] args) {
        Warrior heMan = new Warrior("He-man", 20, 150);
        Warrior kapitanBomba = new Warrior("Kapitan Bomba", 15, 110);
        System.out.println(heMan);
        System.out.println(kapitanBomba);

        System.out.println("He-man uderza kapitana Bombę");
        heMan.hit(kapitanBomba);
        System.out.println(kapitanBomba);
    }
}
