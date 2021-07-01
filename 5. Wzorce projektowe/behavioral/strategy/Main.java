package pl.sdacademy.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior conan = new Warrior("Conan", new PunchStrategy());
        conan.hit();
        conan.setHitStrategy(new SwordSwingStrategy());
        conan.hit();
    }
}
