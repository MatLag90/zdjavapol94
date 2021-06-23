package pl.sdacademy.interfaces;

// To, że klasa implementuje interfejs zapisujemy za pomocą implements <nazwa interfejsu>.
// Jeśli klasa implementuje interfejs, to musi zaimplementować wszystkie (abstrakcyjne) metody tego interfejsu.
// Klasa Paint implementuje interfejs Colored, to znaczy, że musi implementować metodę getColor tego interfejsu.
public class Paint implements Colored {
    private String color;
    private double volume;

    public Paint(String color, double volume) {
        this.color = color;
        this.volume = volume;
    }

    // Klasa implementuje interfejs Colored, w którym mamy zadeklarowaną metodę String getColor().
    // W związku z tym musimy tę metodę zaimplementować.
    @Override
    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }
}
