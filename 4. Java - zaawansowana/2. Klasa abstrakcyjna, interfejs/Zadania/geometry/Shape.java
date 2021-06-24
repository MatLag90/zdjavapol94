package pl.sdacademy.exercises.geometry;

//    1. (geom) Stworzymy abstrakcyjną klasę Shape, która będzie miała pole:
//    private String color;
//    metodę abstrakcyjną getArea(); (pole powierzchni)
//    oraz metodę abstrakcyjną getPerimeter(); (obwód)
public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
