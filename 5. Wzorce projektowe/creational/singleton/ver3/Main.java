package pl.sdacademy.creational.singleton.ver3;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.INSTANCE;
        System.out.println(sun == Sun.INSTANCE);
    }
}
