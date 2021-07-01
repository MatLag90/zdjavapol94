package pl.sdacademy.creational.singleton.ver1;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getInstance();
        System.out.println(sun == Sun.getInstance());
    }
}
