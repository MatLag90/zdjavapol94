package pl.sdacademy.behavioral.observer;

public class PressReader implements PressObserver {
    private String name;

    public PressReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String newspaper) {
        System.out.println("Czytelnik " + name + " czyta gazetę " + newspaper);
    }
}
