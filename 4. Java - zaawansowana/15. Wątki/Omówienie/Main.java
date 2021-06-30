package pl.sdacademy.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start głównego wątku");
        ///////////////////////////////////////////////////////////
        // Obiekt typu Thread reprezentuje wątek. Do utworzenia nowego wątku możemy użyć konstruktora,
        // któremu jako argument przekażemy obiekt implementujący interfejs Runnable.
        // Jako argument przekazujemy implementację interfejsu funkcjonalnego, w związku z czym możemy
        // użyć lambdy.
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    // Wątek usypiamy (pauzujemy) na wybraną liczbę milisekund za pomocą metody sleep.
                    // Jeśli działanie wątku w trakcie jego uśpienia zostanie przerwane, zostanie wyrzucony
                    // wyjątek typu InterruptedException.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Jeśli nie chcemy mieć obowiązku zaczekania na wykonanie wszystkich instrukcji przez wątek, żeby
        // aplikacja zakończyła działanie, możemy oznaczyć wątek jako deamon (aby zobaczyć różnicę odkomentuj
        // poniższą instrukcję):
        // thread.setDaemon(true);
        // Wątek startujemy za pomocą metody start (nie run!)
        thread.start();
        ///////////////////////////////////////////////////////////
        // Dalsze metody wywoływane przez główny wątek
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Koniec głównego wątku");
    }
}
