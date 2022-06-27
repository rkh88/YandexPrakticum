package Figures;

public class Circle implements Figure {
    // Радиус круга
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
