package pl.sdacademy.generics;

// Klasa generyczna umożliwia nam sparametryzowanie typu (lub typów) użytego w definicji.
// Napiszemy klasę reprezentującą pudełko, do którego będziemy mogli
// wstawić wartość wybranego, dowolnego typu.
// Tworząc typ generyczny, po nazwie zapisujemy nawiasy trójkątne, w których zapisujemy
// typy sparametryzowane. W naszym przypadku będzie to T (przyjmiemy konwencję jednoliterową).
// Następnie będzie można użyć tej klasy, wskazując wartość tego typu.
// Przykładowo Box<String> będzie deklaracją pudełka, które służy do przechowywania
// wartości typu String. Tak zadeklarowana zmienna będzie wszędzie zamiast T "widziała" String.
public class Box<T> {
    // T będzie użyte jako typ pola element.
    private T element;

    // W takim razie typem parametru konstruktora też będzie typ T.
    public Box(T element) {
        this.element = element;
    }

    // Analogicznie w przypadku gettera pola element.
    public T getElement() {
        return element;
    }
}
