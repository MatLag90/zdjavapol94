package pl.sdacademy.thread.synchronization;

public class Chair {
    private boolean available = true;

    // Metoda służy do siadania na krześle.
    // Metoda jest sychronizowana (słówko kluczowe synchronized w deklaracji metody), to znaczy, że tylko jeden wątek
    // może w jednym momencie ją wywoływać.
    // Dla zaobserwowania różnicy w działaniu usuń słówko "synchronized" i przeanalizuj działanie
    // - wiele wątków naraz będzie wywoływało tę metodę.
    public synchronized void takeASeat(String name) {
        System.out.println(name + " zamierza usiąść na krześle");
        if (available) {
            System.out.println(name + " widzi wolne krzesło, więc siada");
            available = false;
            System.out.println(name + " usiadł(a) na krześle");
        } else {
            System.out.println("Krzesło jest zajęte, " + name + " nie może usiąść");
        }
    }
}
