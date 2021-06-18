package classes.accessmodifiers.somepackage;

public class A {
    // Modyfikatory dostępu precyzują, gdzie można się odwołać do deklarowanego opisu. Tyczą się klas,
    // pól, konstruktorów, metod.

    // Prywatny modyfikator dostępu sprawia, że do pola możemy się odwołać jedynie w tej klasie,
    // w której zostało zadeklarowane.
    private int x;
    // Domyślny modyfikator dostępu (nie zapisujemy żadnego słówka) sprawia, że do pola możemy się odwołać
    // w klasach z tego samego pakietu.
    int y;
    // Do publicznego pola możemy się odwołać w każdej klasie.
    public int z;

    public static void main(String[] args) {
        A a = new A();
        // Zwracamy uwagę, że w tej samej klasie, w której zostały zadeklarowane pola możemy się odwołać zarówno do:
        // pola prywatnego,
        a.x = 1;
        // pola z domyślnym modyfikatorem dostępu
        a.y = 1;
        // oraz z publicznym modyfikatorem dostepu.
        a.z = 1;
    }
}
