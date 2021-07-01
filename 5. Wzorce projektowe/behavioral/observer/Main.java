package pl.sdacademy.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("Wydawca 1");
        pressPublisher.publish("Gazeta ABC");

        PressReader adamAdamowski = new PressReader("Adam Adamowski");
        pressPublisher.addObserver(adamAdamowski);

        pressPublisher.publish("Gazeta DEF");

        PressReader tomaszTomaszowski = new PressReader("Tomasz Tomaszowski");
        pressPublisher.addObserver(tomaszTomaszowski);
        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);

        pressPublisher.publish("Gazeta GHI");

    }
}
