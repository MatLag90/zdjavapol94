package pl.sdacademy.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class PressPublisher {
    private String name;
    private Set<PressObserver> observers = new HashSet<>();

    public PressPublisher(String name) {
        this.name = name;
    }

    public void publish(String newspaper) {
        System.out.println("\nWydawca " + name + " wydaje gazetę: " + newspaper);
        observers.forEach(observer -> observer.update(newspaper));
    }

    public void addObserver(PressObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PressObserver observer) {
        observers.remove(observer);
    }
}
