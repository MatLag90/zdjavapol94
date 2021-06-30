package pl.sdacademy.thread.synchronization;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        // Utworzymy dwa wątki, których zadaniem będzie siadanie przez zadaną osobę na krześle.
        // Metoda takeASeat jest sychronizowana, więc w jednym momencie tylko jeden wątek może ją wywołać.
        // W związku z tym jedna osoba będzie próbowała usiąść na krześle i dopiero gdy skończy pracę (uda się usiąść
        // lub nie) następna osoba będzie próbowała usiąść. W praktyce jeden wątek będzie czekać, aż drugi zakończy
        // wywołanie metody takeASeat.
        Thread thread1 = new Thread(() -> chair.takeASeat("Stefan"));
        Thread thread2 = new Thread(() -> chair.takeASeat("Elvis"));
        thread1.start();
        thread2.start();
    }
}
